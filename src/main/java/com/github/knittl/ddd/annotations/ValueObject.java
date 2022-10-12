package com.github.knittl.ddd.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * Marker annotation for Value Objects.
 * <p>
 * Value Objects may reference {@link Domain.Entity entities} and other value objects.
 */
@Documented
@Target(ElementType.TYPE)
@DDDAnnotation
public @interface ValueObject {
}
