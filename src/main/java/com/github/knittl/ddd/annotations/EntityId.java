package com.github.knittl.ddd.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * Marker annotation for the identity of a {@link Domain.Entity Domain Entity}, i.e. the {@link ValueObject value}
 * identifying one single entity.
 * <p>
 * Usually, this ID should be globally unique.
 */
@Documented
@Target({ElementType.TYPE, ElementType.FIELD})
@ValueObject
@DDDAnnotation
public @interface EntityId {
}
