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
 * RDF Terms from the W3C PROV Ontology
 * @author acoburn
 */
public class PROV {

    private static RDFTermFactory factory = new SimpleRDFTermFactory();

    /* Namespace */
    public static String uri = "http://www.w3.org/ns/prov#";

    /* Classes */
    public static IRI Activity = factory.createIRI(uri + "Activity");
    public static IRI Agent = factory.createIRI(uri + "Agent");
    public static IRI Entity = factory.createIRI(uri + "Entity");

    /* Expanded Classes */
    public static IRI Bundle = factory.createIRI(uri + "Bundle");
    public static IRI Collection = factory.createIRI(uri + "Collection");
    public static IRI EmptyCollection = factory.createIRI(uri + "EmptyCollection");
    public static IRI Location = factory.createIRI(uri + "Location");
    public static IRI Organization = factory.createIRI(uri + "Organization");
    public static IRI Person = factory.createIRI(uri + "Person");
    public static IRI SoftwareAgent = factory.createIRI(uri + "SoftwareAgent");

    /* Qualified Classes */
    public static IRI ActivityInfluence = factory.createIRI(uri + "ActivityInfluence");
    public static IRI AgentInfluence = factory.createIRI(uri + "AgentInfluence");
    public static IRI Association = factory.createIRI(uri + "Association");
    public static IRI Attribution = factory.createIRI(uri + "Attribution");
    public static IRI Communication = factory.createIRI(uri + "Communication");
    public static IRI Delegation = factory.createIRI(uri + "Delegation");
    public static IRI Derivation = factory.createIRI(uri + "Derivation");
    public static IRI End = factory.createIRI(uri + "End");
    public static IRI EntityInfluence = factory.createIRI(uri + "EntityInfluence");
    public static IRI Generation = factory.createIRI(uri + "Generation");
    public static IRI Influence = factory.createIRI(uri + "Influence");
    public static IRI InstantaneousEvent = factory.createIRI(uri + "InstantaneousEvent");
    public static IRI Invalidation = factory.createIRI(uri + "Invalidation");
    public static IRI Plan = factory.createIRI(uri + "Plan");
    public static IRI PrimarySource = factory.createIRI(uri + "PrimarySource");
    public static IRI Quotation = factory.createIRI(uri + "Quotation");
    public static IRI Revision = factory.createIRI(uri + "Revision");
    public static IRI Start = factory.createIRI(uri + "Start");
    public static IRI Usage = factory.createIRI(uri + "Usage");

    /* Properties */
    public static IRI actedOnBehalfOf = factory.createIRI(uri + "actedOnBehalfOf");
    public static IRI endedAtTime = factory.createIRI(uri + "endedAtTime");
    public static IRI startedAtTime = factory.createIRI(uri + "startedAtTime");
    public static IRI used = factory.createIRI(uri + "used");
    public static IRI wasAssociatedWith = factory.createIRI(uri + "wasAssociatedWith");
    public static IRI wasAttributedTo = factory.createIRI(uri + "wasAttributedTo");
    public static IRI wasDerivedFrom = factory.createIRI(uri + "wasDerivedFrom");
    public static IRI wasGeneratedBy = factory.createIRI(uri + "wasGeneratedBy");
    public static IRI wasInformedBy = factory.createIRI(uri + "wasInformedBy");

    /* Expanded Properties */
    public static IRI alternateOf = factory.createIRI(uri + "alternateOf");
    public static IRI atLocation = factory.createIRI(uri + "atLocation");
    public static IRI generated = factory.createIRI(uri + "generated");
    public static IRI generatedAtTime = factory.createIRI(uri + "generatedAtTime");
    public static IRI hadMember = factory.createIRI(uri + "hadMember");
    public static IRI hadPrimarySource = factory.createIRI(uri + "hadPrimarySource");
    public static IRI influenced = factory.createIRI(uri + "influenced");
    public static IRI invalidated = factory.createIRI(uri + "invalidated");
    public static IRI invalidatedAtTime = factory.createIRI(uri + "invalidatedAtTime");
    public static IRI specializationOf = factory.createIRI(uri + "specializationOf");
    public static IRI value = factory.createIRI(uri + "value");
    public static IRI wasEndedBy = factory.createIRI(uri + "wasEndedBy");
    public static IRI wasInvalidatedBy = factory.createIRI(uri + "wasInvalidatedBy");
    public static IRI wasQuotedFrom = factory.createIRI(uri + "wasQuotedFrom");
    public static IRI wasRevisionOf = factory.createIRI(uri + "wasRevisionOf");
    public static IRI wasStartedBy = factory.createIRI(uri + "wasStartedBy");

    /* Qualified Properties */
    public static IRI activity = factory.createIRI(uri + "activity");
    public static IRI agent = factory.createIRI(uri + "agent");
    public static IRI atTime = factory.createIRI(uri + "atTime");
    public static IRI entity = factory.createIRI(uri + "entity");
    public static IRI hadActivity = factory.createIRI(uri + "hadActivity");
    public static IRI hadGeneration = factory.createIRI(uri + "hadGeneration");
    public static IRI hadPlan = factory.createIRI(uri + "hadPlan");
    public static IRI hadRole = factory.createIRI(uri + "hadRole");
    public static IRI hadUsage = factory.createIRI(uri + "hadUsage");
    public static IRI influencer = factory.createIRI(uri + "influencer");
    public static IRI qualifiedAssociation = factory.createIRI(uri + "qualifiedAssociation");
    public static IRI qualifiedAttribution = factory.createIRI(uri + "qualifiedAttribution");
    public static IRI qualifiedCommunication = factory.createIRI(uri + "qualifiedCommunication");
    public static IRI qualifiedDelegation = factory.createIRI(uri + "qualifiedDelegation");
    public static IRI qualifiedDerivation = factory.createIRI(uri + "qualifiedDerivation");
    public static IRI qualifiedEnd = factory.createIRI(uri + "qualifiedEnd");
    public static IRI qualifiedGeneration = factory.createIRI(uri + "qualifiedGeneration");
    public static IRI qualifiedInfluence = factory.createIRI(uri + "qualifiedInfluence");
    public static IRI qualifiedInvalidation = factory.createIRI(uri + "qualifiedInvalidation");
    public static IRI qualifiedPrimarySource = factory.createIRI(uri + "qualifiedPrimarySource");
    public static IRI qualifiedQuotation = factory.createIRI(uri + "qualifiedQuotation");
    public static IRI qualifiedRevision = factory.createIRI(uri + "qualifiedRevision");
    public static IRI qualifiedStart = factory.createIRI(uri + "qualifiedStart");
    public static IRI qualifiedUsage = factory.createIRI(uri + "qualifiedUsage");
    public static IRI wasInfluencedBy = factory.createIRI(uri + "wasInfluencedBy");

    private PROV() {
        // prevent instantiation
    }
}
