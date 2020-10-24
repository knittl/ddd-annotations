package at.appicenter.ddd.annotations;

import java.lang.annotation.*;

/**
 * Marker annotation for an aggregate. Best used on package defined in {@code package-info.java} files (available .
 */
@Documented
@Target(ElementType.PACKAGE)
@DDDAnnotation
public @interface Aggregate {
    /**
     * Marker annotation for aggregate roots. There can only be a single aggregate root per {@link Aggregate} and
     * aggregate-external access to other objects in this aggregate must go through the root.
     * <p>
     * Aggregate Roots are always {@link Domain.Entity entities}.
     */
    @Domain.Entity
    @Documented
    @Target(ElementType.TYPE)
    @DDDAnnotation
    @interface Root {
    }
}
