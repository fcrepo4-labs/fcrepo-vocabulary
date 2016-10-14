/*
 * Licensed to DuraSpace under one or more contributor license agreements.
 * See the NOTICE file distributed with this work for additional information
 * regarding copyright ownership.
 *
 * DuraSpace licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except in
 * compliance with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.fcrepo.vocabulary;

import static java.util.Arrays.stream;
import static java.util.stream.Collectors.toSet;
import static org.apache.jena.rdf.model.ModelFactory.createDefaultModel;
import static org.apache.jena.riot.RDFDataMgr.read;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.slf4j.LoggerFactory.getLogger;

import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.lang.reflect.Field;
import java.util.stream.Stream;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.Resource;
import org.junit.Test;
import org.slf4j.Logger;

/**
 * @author acoburn
 */
public abstract class AbstractVocabularyTest {

    private static final Logger LOGGER  = getLogger(AbstractVocabularyTest.class);

    public abstract String namespace();

    public abstract Class vocabulary();

    @Test
    public void testEventVocabulary() {
        final Model model = createDefaultModel();
        read(model, namespace());

        final Set<String> subjects = model.listSubjects().mapWith(Resource::getURI)
                .filterKeep(Objects::nonNull).toSet();

        fields().forEach(field -> {
            assertTrue("Field definition is not in published ontology!", subjects.contains(namespace() + field));
        });
    }

    @Test
    public void testEventVocabularyRev() {
        final Model model = createDefaultModel();
        read(model, namespace());

        final Set<String> subjects = fields().map(field -> namespace() + field).collect(toSet());

        assertTrue("Unable to extract field definitions!", subjects.size() > 0);

        model.listSubjects().mapWith(Resource::getURI).filterKeep(Objects::nonNull)
                .filterKeep(uri -> uri.startsWith(namespace()))
                .filterDrop(namespace()::equals)
                .filterDrop(subjects::contains).forEachRemaining(uri -> {
            LOGGER.warn("{} not defined in {} class", uri, vocabulary().getName());
        });
    }

    @Test
    public void testNamespace() throws Exception {
        final Optional<Field> uri = stream(vocabulary().getFields()).filter(field -> field.getName().equals("uri"))
                .findFirst();

        assertTrue(vocabulary().getName() + " does not contain a 'uri' field!", uri.isPresent());
        assertEquals("Namespaces do not match!", namespace(), uri.get().get(null));
    }

    private Stream<String> fields() {
        return stream(vocabulary().getFields()).map(Field::getName).filter(field -> !field.equals("uri"));
    }
}
