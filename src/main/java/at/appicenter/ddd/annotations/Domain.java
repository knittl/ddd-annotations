package at.appicenter.ddd.annotations;

import java.lang.annotation.*;

/**
 * "Namespace" class for annotations which describe <em>Domain Driven Design</em> concepts which could be ambiguous
 * depending on context or which names are already in use by other popular libraries and frameworks.
 */
public final class Domain {
    private Domain() {
    }

    /**
     * Marker annotation for domain entities, a.k.a. <em>Reference Objects</em>. Usually associated with an
     * {@link EntityId ID}.
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
     * Marker annotation for domain repositories. A domain repository provides access to {@link Aggregate.Root
     * Aggregate roots}.
     * <p>
     * <b>NOTE</b>: This is/can be different from a JPA/Hibernate repository.
     */
    @Documented
    @Target(ElementType.TYPE)
    @DDDAnnotation
    public @interface Repository {
    }
}
