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
 * RDF Terms from the W3C PROV Ontology
 * @author acoburn
 */
public class PROV {

    private static RDF rdf = new SimpleRDF();

    /* Namespace */
    public static String uri = "http://www.w3.org/ns/prov#";

    /* Classes */
    public static IRI Activity = rdf.createIRI(uri + "Activity");
    public static IRI Agent = rdf.createIRI(uri + "Agent");
    public static IRI Entity = rdf.createIRI(uri + "Entity");

    /* Expanded Classes */
    public static IRI Bundle = rdf.createIRI(uri + "Bundle");
    public static IRI Collection = rdf.createIRI(uri + "Collection");
    public static IRI EmptyCollection = rdf.createIRI(uri + "EmptyCollection");
    public static IRI Location = rdf.createIRI(uri + "Location");
    public static IRI Organization = rdf.createIRI(uri + "Organization");
    public static IRI Person = rdf.createIRI(uri + "Person");
    public static IRI SoftwareAgent = rdf.createIRI(uri + "SoftwareAgent");

    /* Qualified Classes */
    public static IRI ActivityInfluence = rdf.createIRI(uri + "ActivityInfluence");
    public static IRI AgentInfluence = rdf.createIRI(uri + "AgentInfluence");
    public static IRI Association = rdf.createIRI(uri + "Association");
    public static IRI Attribution = rdf.createIRI(uri + "Attribution");
    public static IRI Communication = rdf.createIRI(uri + "Communication");
    public static IRI Delegation = rdf.createIRI(uri + "Delegation");
    public static IRI Derivation = rdf.createIRI(uri + "Derivation");
    public static IRI End = rdf.createIRI(uri + "End");
    public static IRI EntityInfluence = rdf.createIRI(uri + "EntityInfluence");
    public static IRI Generation = rdf.createIRI(uri + "Generation");
    public static IRI Influence = rdf.createIRI(uri + "Influence");
    public static IRI InstantaneousEvent = rdf.createIRI(uri + "InstantaneousEvent");
    public static IRI Invalidation = rdf.createIRI(uri + "Invalidation");
    public static IRI Plan = rdf.createIRI(uri + "Plan");
    public static IRI PrimarySource = rdf.createIRI(uri + "PrimarySource");
    public static IRI Quotation = rdf.createIRI(uri + "Quotation");
    public static IRI Revision = rdf.createIRI(uri + "Revision");
    public static IRI Start = rdf.createIRI(uri + "Start");
    public static IRI Usage = rdf.createIRI(uri + "Usage");

    /* Properties */
    public static IRI actedOnBehalfOf = rdf.createIRI(uri + "actedOnBehalfOf");
    public static IRI endedAtTime = rdf.createIRI(uri + "endedAtTime");
    public static IRI startedAtTime = rdf.createIRI(uri + "startedAtTime");
    public static IRI used = rdf.createIRI(uri + "used");
    public static IRI wasAssociatedWith = rdf.createIRI(uri + "wasAssociatedWith");
    public static IRI wasAttributedTo = rdf.createIRI(uri + "wasAttributedTo");
    public static IRI wasDerivedFrom = rdf.createIRI(uri + "wasDerivedFrom");
    public static IRI wasGeneratedBy = rdf.createIRI(uri + "wasGeneratedBy");
    public static IRI wasInformedBy = rdf.createIRI(uri + "wasInformedBy");

    /* Expanded Properties */
    public static IRI alternateOf = rdf.createIRI(uri + "alternateOf");
    public static IRI atLocation = rdf.createIRI(uri + "atLocation");
    public static IRI generated = rdf.createIRI(uri + "generated");
    public static IRI generatedAtTime = rdf.createIRI(uri + "generatedAtTime");
    public static IRI hadMember = rdf.createIRI(uri + "hadMember");
    public static IRI hadPrimarySource = rdf.createIRI(uri + "hadPrimarySource");
    public static IRI influenced = rdf.createIRI(uri + "influenced");
    public static IRI invalidated = rdf.createIRI(uri + "invalidated");
    public static IRI invalidatedAtTime = rdf.createIRI(uri + "invalidatedAtTime");
    public static IRI specializationOf = rdf.createIRI(uri + "specializationOf");
    public static IRI value = rdf.createIRI(uri + "value");
    public static IRI wasEndedBy = rdf.createIRI(uri + "wasEndedBy");
    public static IRI wasInvalidatedBy = rdf.createIRI(uri + "wasInvalidatedBy");
    public static IRI wasQuotedFrom = rdf.createIRI(uri + "wasQuotedFrom");
    public static IRI wasRevisionOf = rdf.createIRI(uri + "wasRevisionOf");
    public static IRI wasStartedBy = rdf.createIRI(uri + "wasStartedBy");

    /* Qualified Properties */
    public static IRI activity = rdf.createIRI(uri + "activity");
    public static IRI agent = rdf.createIRI(uri + "agent");
    public static IRI atTime = rdf.createIRI(uri + "atTime");
    public static IRI entity = rdf.createIRI(uri + "entity");
    public static IRI hadActivity = rdf.createIRI(uri + "hadActivity");
    public static IRI hadGeneration = rdf.createIRI(uri + "hadGeneration");
    public static IRI hadPlan = rdf.createIRI(uri + "hadPlan");
    public static IRI hadRole = rdf.createIRI(uri + "hadRole");
    public static IRI hadUsage = rdf.createIRI(uri + "hadUsage");
    public static IRI influencer = rdf.createIRI(uri + "influencer");
    public static IRI qualifiedAssociation = rdf.createIRI(uri + "qualifiedAssociation");
    public static IRI qualifiedAttribution = rdf.createIRI(uri + "qualifiedAttribution");
    public static IRI qualifiedCommunication = rdf.createIRI(uri + "qualifiedCommunication");
    public static IRI qualifiedDelegation = rdf.createIRI(uri + "qualifiedDelegation");
    public static IRI qualifiedDerivation = rdf.createIRI(uri + "qualifiedDerivation");
    public static IRI qualifiedEnd = rdf.createIRI(uri + "qualifiedEnd");
    public static IRI qualifiedGeneration = rdf.createIRI(uri + "qualifiedGeneration");
    public static IRI qualifiedInfluence = rdf.createIRI(uri + "qualifiedInfluence");
    public static IRI qualifiedInvalidation = rdf.createIRI(uri + "qualifiedInvalidation");
    public static IRI qualifiedPrimarySource = rdf.createIRI(uri + "qualifiedPrimarySource");
    public static IRI qualifiedQuotation = rdf.createIRI(uri + "qualifiedQuotation");
    public static IRI qualifiedRevision = rdf.createIRI(uri + "qualifiedRevision");
    public static IRI qualifiedStart = rdf.createIRI(uri + "qualifiedStart");
    public static IRI qualifiedUsage = rdf.createIRI(uri + "qualifiedUsage");
    public static IRI wasInfluencedBy = rdf.createIRI(uri + "wasInfluencedBy");

    private PROV() {
        // prevent instantiation
    }
}
