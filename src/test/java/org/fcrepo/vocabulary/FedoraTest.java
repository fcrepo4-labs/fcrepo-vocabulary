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

import static org.apache.jena.rdf.model.ModelFactory.createDefaultModel;
import static org.apache.jena.riot.RDFDataMgr.read;
import static org.slf4j.LoggerFactory.getLogger;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static java.util.Arrays.stream;
import static java.util.stream.Collectors.toSet;

import java.lang.reflect.Field;
import java.util.Set;
import java.util.Objects;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.Resource;

import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;

/**
 * Test the Fedora Vocabulary Class
 * @author acoburn
 */
public class FedoraTest {

    private static final Logger LOGGER  = getLogger(FedoraTest.class);

    private static final String namespace = "http://fedora.info/definitions/v4/repository#";
    private Model model;

    @Before
    public void setUp() {
        model = createDefaultModel();
        read(model, namespace);
    }

    @Test
    public void testFedoraVocabulary() {
        final Set<String> subjects = model.listSubjects().mapWith(Resource::getURI)
                .filterKeep(Objects::nonNull).toSet();

        assertEquals(Fedora.uri, namespace);
        stream(Fedora.class.getFields()).map(Field::getName).filter(field -> !field.equals("uri")).forEach(field -> {
            assertTrue(subjects.contains(Fedora.uri + field));
            assertTrue(subjects.contains(namespace + field));
        });
    }

    @Test
    public void testFedoraVocabularyRev() {
        final Set<String> subjects = stream(Fedora.class.getFields()).map(Field::getName)
                .filter(field -> !field.equals("uri")).map(field -> namespace + field).collect(toSet());
        assertTrue(subjects.size() > 0);
        model.listSubjects().mapWith(Resource::getURI).filterKeep(Objects::nonNull).filterDrop(Fedora.uri::equals)
                .forEachRemaining(uri -> {
            if (!subjects.contains(uri)) {
                LOGGER.warn("{} not defined in Fedora class", uri);
            }
        });
    }
}
