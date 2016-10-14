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

import org.apache.commons.rdf.api.IRI;
import org.apache.commons.rdf.api.RDFTermFactory;
import org.apache.commons.rdf.simple.SimpleRDFTermFactory;

/**
 * RDF Terms from the Fedora WebAC Vocabulary
 * @author acoburn
 */
public class WebAC {

    private static RDFTermFactory factory = new SimpleRDFTermFactory();

    /* Namespace */
    public static String uri = "http://fedora.info/definitions/v4/webac#";

    /* Classes */
    public static IRI Acl = factory.createIRI(uri + "Acl");

    private WebAC() {
        // prevent instantiation
    }
}
