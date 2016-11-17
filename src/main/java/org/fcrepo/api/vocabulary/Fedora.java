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
package org.fcrepo.api.vocabulary;

import org.apache.commons.rdf.api.IRI;
import org.apache.commons.rdf.api.RDF;
import org.apache.commons.rdf.simple.SimpleRDF;

/**
 * RDF Terms from the Fedora Ontology
 * @author acoburn
 */
public class Fedora {

    private static RDF rdf = new SimpleRDF();

    /* Namespace */
    public static String uri = "http://fedora.info/definitions/v4/repository#";

    /* Classes */
    public static IRI AnnotatedResource = rdf.createIRI(uri + "AnnotatedResource");
    public static IRI Binary = rdf.createIRI(uri + "Binary");
    public static IRI Configuration = rdf.createIRI(uri + "Configuration");
    public static IRI Container = rdf.createIRI(uri + "Container");
    public static IRI EmbedResources = rdf.createIRI(uri + "EmbedResources");
    public static IRI InboundReferences = rdf.createIRI(uri + "InboundReferences");
    public static IRI NonRdfSourceDescription = rdf.createIRI(uri + "NonRdfSourceDescription");
    public static IRI Pairtree = rdf.createIRI(uri + "Pairtree");
    public static IRI Relations = rdf.createIRI(uri + "Relations");
    public static IRI RepositoryRoot = rdf.createIRI(uri + "RepositoryRoot");
    public static IRI Resource = rdf.createIRI(uri + "Resource");
    public static IRI ServerManaged = rdf.createIRI(uri + "ServerManaged");
    public static IRI Skolem = rdf.createIRI(uri + "Skolem");
    public static IRI Thing = rdf.createIRI(uri + "Thing");
    public static IRI Tombstone = rdf.createIRI(uri + "Tombstone");
    public static IRI Version = rdf.createIRI(uri + "Version");

    /* Named Individuals */
    public static IRI inaccessibleResource = rdf.createIRI(uri + "inaccessibleResource");

    /* Object Properties */
    public static IRI baseVersion = rdf.createIRI(uri + "baseVersion");
    public static IRI hasAccessRoles = rdf.createIRI(uri + "hasAccessRoles");
    public static IRI hasFixityService = rdf.createIRI(uri + "hasFixityService");
    public static IRI hasMember = rdf.createIRI(uri + "hasMember");
    public static IRI hasNamespaces = rdf.createIRI(uri + "hasNamespaces");
    public static IRI hasParent = rdf.createIRI(uri + "hasParent");
    public static IRI hasResultsMember = rdf.createIRI(uri + "hasResultsMember");
    public static IRI hasVersion = rdf.createIRI(uri + "hasVersion");
    public static IRI hasVersions = rdf.createIRI(uri + "hasVersions");
    public static IRI predecessors = rdf.createIRI(uri + "predecessors");
    public static IRI sparql = rdf.createIRI(uri + "sparql");

    /* Datatype Properties */
    public static IRI computedChecksum = rdf.createIRI(uri + "computedChecksum");
    public static IRI computedSize = rdf.createIRI(uri + "computedSize");
    public static IRI created = rdf.createIRI(uri + "created");
    public static IRI createdBy = rdf.createIRI(uri + "createdBy");
    public static IRI hasLocation = rdf.createIRI(uri + "hasLocation");
    public static IRI hasMoreResults = rdf.createIRI(uri + "hasMoreResults");
    public static IRI hasTransactionProvider = rdf.createIRI(uri + "hasTransactionProvider");
    public static IRI hasVersionLabel = rdf.createIRI(uri + "hasVersionLabel");
    public static IRI isCheckedOut = rdf.createIRI(uri + "isCheckedOut");
    public static IRI lastModified = rdf.createIRI(uri + "lastModified");
    public static IRI lastModifiedBy = rdf.createIRI(uri + "lastModifiedBy");
    public static IRI numberOfChildren = rdf.createIRI(uri + "numberOfChildren");
    public static IRI numFixityErrors = rdf.createIRI(uri + "numFixityErrors");
    public static IRI numFixityRepaired = rdf.createIRI(uri + "numFixityRepaired");
    public static IRI objectCount = rdf.createIRI(uri + "objectCount");
    public static IRI objectSize = rdf.createIRI(uri + "objectSize");
    public static IRI writable = rdf.createIRI(uri + "writable");

    private Fedora() {
        // prevent instantiation
    }
}
