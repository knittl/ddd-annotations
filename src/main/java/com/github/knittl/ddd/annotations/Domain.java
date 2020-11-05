package com.github.knittl.ddd.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Target;

/**
 * "Namespace" class for annotations which describe <i>Domain Driven Design</i> concepts which could be ambiguous
 * depending on context or which names are already in use by other popular libraries and frameworks.
 */
public final class Domain {
    private Domain() {
    }

    /**
     * Marker annotation for <i>Domain Entities</i>, a.k.a. <i>Reference Objects</i>. Usually associated with an
     * {@link EntityId ID}.
     * <p>
     * An object defined primarily by its identity is called an <i>ENTITY</i>. ENTITIES have special modeling and
     * design considerations. They have life cycles that can radically change their form and content, but a thread of
     * continuity must be maintained. Their identities must be defined so that they can be effectively tracked. Their
     * class definitions, responsibilities, attributes, and associations should revolve around who they are, rather
     * than the particular attributes they carry.
     * <p>
     * <b>GLOSSARY</b>: An object fundamentally defined not by its attributes, but by a thread of
     * continuity and identity.
     *
     * @see <a href="https://www.domainlanguage.com/ddd/reference/">DDD Reference</a>
     */
    @Documented
    @Target(ElementType.TYPE)
    @Inherited
    @DDDAnnotation
    public @interface Entity {
    }

    /**
     * Marker annotation for an event relevant for the Domain.
     */
    @Documented
    @Target(ElementType.TYPE)
    @DDDAnnotation
    public @interface Event {
    }

    /**
     * Marker annotation for Domain <i>Repositories</i>. A domain repository provides access to {@link Aggregate.Root
     * Aggregate roots}.
     * <p>
     * <b>NOTE</b>: This is/can be different from a JPA/Hibernate repository.
     * <p>
     * A <i>REPOSITORY</i> represents all objects of a certain type as a conceptual set (usually emulated). It acts
     * like a collection, except with more elaborate querying capability. Objects of the appropriate type are added and
     * removed, and the machinery behind the REPOSITORY inserts them or deletes them from the database. This
     * definition gathers a cohesive set of responsibilities for providing access to the {@link Aggregate.Root roots
     * of AGGREGATES} from early life cycle through the end.
     * <p>
     * Clients request objects from the REPOSITORY using query methods that select objects based on criteria
     * specified by the client, typically the value of certain attributes. The REPOSITORY retrieves the requested
     * object, encapsulating the machinery of database queries and metadata mapping. REPOSITORIES can implement a
     * variety of queries that select objects based on whatever criteria the client requires. They can also return
     * summary information, such as a count of how many instances meet some criteria. They can even return summary
     * calculations, such as the total across all matching objects of some numerical attribute.
     * <p>
     * REPOSITORIES have many advantages, including the following:
     * <ul>
     *   <li>They present clients with a simple model for obtaining persistent objects and managing their life cycle.
     *   <li>They decouple application and domain design from persistence technology, multiple database strategies, or
     *   even multiple data sources.
     *   <li>They communicate design decisions about object access.
     *   <li>They allow easy substitution of a dummy implementation, for use in testing (typically using an in-memory
     *   collection).
     * </ul>
     * <p>
     * <b>GLOSSARY</b>: A mechanism for encapsulating storage, retrieval, and search behavior which
     * emulates a collection of objects.
     *
     * @see <a href="https://www.domainlanguage.com/ddd/reference/">DDD Reference</a>
     */
    @Documented
    @Target(ElementType.TYPE)
    @DDDAnnotation
    public @interface Repository {
    }
}
