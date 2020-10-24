package at.appicenter.ddd.annotations;

import java.lang.annotation.*;

/**
 * Marker annotation for the identity of a {@link Domain.Entity domain entity}, i.e. the {@link ValueObject value}
 * identifying one single entity.
 */
@Documented
@Target({ElementType.TYPE, ElementType.FIELD})
@ValueObject
@DDDAnnotation
public @interface EntityId {
}
