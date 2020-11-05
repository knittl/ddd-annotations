package com.github.knittl.ddd.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * Marker annotation for <i>Value Objects</i>.
 * <p>
 * <i>VALUE OBJECTS</i> are instantiated to represent elements of the design that we care about only for what they
 * are, not who or which they are.
 * <p>
 * When you care only about the attributes of an element of the model, classify it as a VALUE OBJECT. Make it express
 * the meaning of the attributes it conveys and give it related functionality. Treat the VALUE OBJECT as immutable.
 * Do not give it any identity and avoid the design complexities necessary to maintain ENTITIES.
 * <p>
 * Value Objects may reference {@link Domain.Entity entities} and other value objects.
 * <p>
 * <b>GLOSSARY</b>: An object that describes some characteristic or attribute but carries no concept of
 * identity.
 *
 * @see <a href="https://www.domainlanguage.com/ddd/reference/">DDD Reference</a>
 */
@Documented
@Target(ElementType.TYPE)
@DDDAnnotation
public @interface ValueObject {
}
