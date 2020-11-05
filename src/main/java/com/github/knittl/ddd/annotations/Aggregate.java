package com.github.knittl.ddd.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * Marker annotation for <i>aggregates</i>. Best used on package defined in {@code package-info.java} files.
 * <p>
 * An <i>AGGREGATE</i> is a cluster of associated objects that we treat as a unit for the purpose of data changes.
 * Each AGGREGATE has a root and a boundary. The boundary defines what is inside the AGGREGATE. The root is a single,
 * specific ENTITY contained in the AGGREGATE . The root is the only member of the AGGREGATE that outside objects are
 * allowed to hold references to, although objects within the boundary may hold references to each other. ENTITIES
 * other than the root have local identity, but that identity needs to be distinguishable only within the AGGREGATE,
 * because no outside object can ever see it out of the context of the root ENTITY.
 * <p>
 * <b>GLOSSARY</b>: A cluster of associated objects that are treated as a unit for the purpose of data
 * changes. External references are restricted to one member of the AGGREGATE, designated as the {@link Root root}. A
 * set of consistency rules applies within the AGGREGATE'S boundaries.
 *
 * @see <a href="https://www.domainlanguage.com/ddd/reference/">DDD Reference</a>
 */
@Documented
@Target(ElementType.PACKAGE)
@DDDAnnotation
public @interface Aggregate {
    /**
     * Marker annotation for <i>Aggregate Roots</i>. There can only be a single aggregate root per {@link Aggregate} and
     * aggregate-external access to other objects in this aggregate must go through the root.
     * <p>
     * Only aggregate roots can be obtained directly with database queries. All other objects must be found by traversal
     * of associations.
     * <p>
     * Aggregate Roots are always {@link Domain.Entity entities}.
     *
     * @see <a href="https://www.domainlanguage.com/ddd/reference/">DDD Reference</a>
     */
    @Domain.Entity
    @Documented
    @Target(ElementType.TYPE)
    @DDDAnnotation
    @interface Root {
    }
}
