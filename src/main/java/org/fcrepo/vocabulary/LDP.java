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
 * RDF Terms from the LDP Vocabulary
 * @author acoburn
 */
public class LDP {

    private static RDFTermFactory factory = new SimpleRDFTermFactory();

    /* Namespace */
    public static String uri = "http://www.w3.org/ns/ldp#";

    /* Classes */
    public static IRI BasicContainer = factory.createIRI(uri + "BasicContainer");
    public static IRI Container = factory.createIRI(uri + "Container");
    public static IRI DirectContainer = factory.createIRI(uri + "DirectContainer");
    public static IRI IndirectContainer = factory.createIRI(uri + "IndirectContainer");
    public static IRI NonRDFSource = factory.createIRI(uri + "NonRDFSource");
    public static IRI Resource = factory.createIRI(uri + "Resource");
    public static IRI RDFSource = factory.createIRI(uri + "RDFSource");

    /* Properties */
    public static IRI contains = factory.createIRI(uri + "contains");
    public static IRI hasMemberRelation = factory.createIRI(uri + "hasMemberRelation");
    public static IRI inbox = factory.createIRI(uri + "inbox");
    public static IRI insertedContentRelation = factory.createIRI(uri + "insertedContentRelation");
    public static IRI isMemberOfRelation = factory.createIRI(uri + "isMemberOfRelation");
    public static IRI member = factory.createIRI(uri + "member");
    public static IRI membershipResource = factory.createIRI(uri + "membershipResource");

    /* Prefer-related Classes */
    public static IRI PreferContainment = factory.createIRI(uri + "PreferContainment");
    public static IRI PreferMembership = factory.createIRI(uri + "PreferMembership");
    public static IRI PreferMinimalContainer = factory.createIRI(uri + "PreferMinimalContainer");

    /* Paging Classes */
    public static IRI PageSortCriterion = factory.createIRI(uri + "PageSortCriterion");
    public static IRI Ascending = factory.createIRI(uri + "Ascending");
    public static IRI Descending = factory.createIRI(uri + "Descending");
    public static IRI Page = factory.createIRI(uri + "Page");

    /* Paging Properties */
    public static IRI constrainedBy = factory.createIRI(uri + "constrainedBy");
    public static IRI pageSortCriteria = factory.createIRI(uri + "pageSortCriteria");
    public static IRI pageSortPredicate = factory.createIRI(uri + "pageSortPredicate");
    public static IRI pageSortOrder = factory.createIRI(uri + "pageSortOrder");
    public static IRI pageSortCollation = factory.createIRI(uri + "pageSortCollation");
    public static IRI pageSequence = factory.createIRI(uri + "pageSequence");

    /* Other Classes */
    public static IRI MemberSubject = factory.createIRI(uri + "MemberSubject");

    private LDP() {
        // prevent instantiation
    }
}
