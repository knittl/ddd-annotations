package com.github.knittl.ddd.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * Marker annotation for domain factories.
 */
@Documented
@Target(ElementType.TYPE)
@DDDAnnotation
public @interface Factory {
}
