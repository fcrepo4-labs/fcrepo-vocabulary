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
 * RDF Terms from the W3C ACL Vocabulary
 * @author acoburn
 */
public class ACL {

    private static RDFTermFactory factory = new SimpleRDFTermFactory();

    /* Namespace */
    public static String uri = "http://www.w3.org/ns/auth/acl#";

    /* Classes */
    public static IRI Access = factory.createIRI(uri + "Access");
    public static IRI Append = factory.createIRI(uri + "Append");
    public static IRI Authorization = factory.createIRI(uri + "Authorization");
    public static IRI Control = factory.createIRI(uri + "Control");
    public static IRI Read = factory.createIRI(uri + "Read");
    public static IRI Write = factory.createIRI(uri + "Write");

    /* Properties */
    public static IRI accessControl = factory.createIRI(uri + "accessControl");
    public static IRI accessTo = factory.createIRI(uri + "accessTo");
    public static IRI accessToClass = factory.createIRI(uri + "accessToClass");
    public static IRI agent = factory.createIRI(uri + "agent");
    public static IRI agentClass = factory.createIRI(uri + "agentClass");
    public static IRI agentGroup = factory.createIRI(uri + "agentGroup");
    public static IRI defaultForNew = factory.createIRI(uri + "defaultForNew");
    public static IRI delegates = factory.createIRI(uri + "delegates");
    public static IRI mode = factory.createIRI(uri + "mode");
    public static IRI owner = factory.createIRI(uri + "owner");

    private ACL() {
        // prevent instantiation
    }
}
