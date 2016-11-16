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
import org.apache.commons.rdf.api.RDF;
import org.apache.commons.rdf.simple.SimpleRDF;

/**
 * RDF Terms from the Fedora Event Vocabulary
 * @author acoburn
 */
public class Event {

    private static RDF rdf = new SimpleRDF();

    /* Namespace */
    public static String uri = "http://fedora.info/definitions/v4/event#";

    /* Classes */
    public static IRI ResourceCreation = rdf.createIRI(uri + "ResourceCreation");
    public static IRI ResourceDeletion = rdf.createIRI(uri + "ResourceDeletion");
    public static IRI ResourceModification = rdf.createIRI(uri + "ResourceModification");
    public static IRI ResourceRelocation = rdf.createIRI(uri + "ResourceRelocation");

    private Event() {
        // prevent instantiation
    }
}
