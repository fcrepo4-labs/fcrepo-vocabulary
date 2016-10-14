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
 * RDF Terms from the Fedora Ontology
 * @author acoburn
 */
public class Fedora {

    private static RDFTermFactory factory = new SimpleRDFTermFactory();

    /* Namespace */
    public static String uri = "http://fedora.info/definitions/v4/repository#";

    /* Classes */
    public static IRI AnnotatedResource = factory.createIRI(uri + "AnnotatedResource");
    public static IRI Binary = factory.createIRI(uri + "Binary");
    public static IRI Configuration = factory.createIRI(uri + "Configuration");
    public static IRI Container = factory.createIRI(uri + "Container");
    public static IRI EmbedResources = factory.createIRI(uri + "EmbedResources");
    public static IRI InboundReferences = factory.createIRI(uri + "InboundReferences");
    public static IRI NonRdfSourceDescription = factory.createIRI(uri + "NonRdfSourceDescription");
    public static IRI Pairtree = factory.createIRI(uri + "Pairtree");
    public static IRI Relations = factory.createIRI(uri + "Relations");
    public static IRI RepositoryRoot = factory.createIRI(uri + "RepositoryRoot");
    public static IRI Resource = factory.createIRI(uri + "Resource");
    public static IRI ServerManaged = factory.createIRI(uri + "ServerManaged");
    public static IRI Skolem = factory.createIRI(uri + "Skolem");
    public static IRI Thing = factory.createIRI(uri + "Thing");
    public static IRI Tombstone = factory.createIRI(uri + "Tombstone");
    public static IRI Version = factory.createIRI(uri + "Version");

    /* Named Individuals */
    public static IRI inaccessibleResource = factory.createIRI(uri + "inaccessibleResource");

    /* Object Properties */
    public static IRI baseVersion = factory.createIRI(uri + "baseVersion");
    public static IRI hasAccessRoles = factory.createIRI(uri + "hasAccessRoles");
    public static IRI hasFixityService = factory.createIRI(uri + "hasFixityService");
    public static IRI hasMember = factory.createIRI(uri + "hasMember");
    public static IRI hasNamespaces = factory.createIRI(uri + "hasNamespaces");
    public static IRI hasParent = factory.createIRI(uri + "hasParent");
    public static IRI hasResultsMember = factory.createIRI(uri + "hasResultsMember");
    public static IRI hasVersion = factory.createIRI(uri + "hasVersion");
    public static IRI hasVersions = factory.createIRI(uri + "hasVersions");
    public static IRI predecessors = factory.createIRI(uri + "predecessors");
    public static IRI sparql = factory.createIRI(uri + "sparql");

    /* Datatype Properties */
    public static IRI computedChecksum = factory.createIRI(uri + "computedChecksum");
    public static IRI computedSize = factory.createIRI(uri + "computedSize");
    public static IRI created = factory.createIRI(uri + "created");
    public static IRI createdBy = factory.createIRI(uri + "createdBy");
    public static IRI hasLocation = factory.createIRI(uri + "hasLocation");
    public static IRI hasMoreResults = factory.createIRI(uri + "hasMoreResults");
    public static IRI hasTransactionProvider = factory.createIRI(uri + "hasTransactionProvider");
    public static IRI hasVersionLabel = factory.createIRI(uri + "hasVersionLabel");
    public static IRI isCheckedOut = factory.createIRI(uri + "isCheckedOut");
    public static IRI lastModified = factory.createIRI(uri + "lastModified");
    public static IRI lastModifiedBy = factory.createIRI(uri + "lastModifiedBy");
    public static IRI numberOfChildren = factory.createIRI(uri + "numberOfChildren");
    public static IRI numFixityErrors = factory.createIRI(uri + "numFixityErrors");
    public static IRI numFixityRepaired = factory.createIRI(uri + "numFixityRepaired");
    public static IRI objectCount = factory.createIRI(uri + "objectCount");
    public static IRI objectSize = factory.createIRI(uri + "objectSize");
    public static IRI writable = factory.createIRI(uri + "writable");

    private Fedora() {
        // prevent instantiation
    }
}
