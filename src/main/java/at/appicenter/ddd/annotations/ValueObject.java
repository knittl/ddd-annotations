package at.appicenter.ddd.annotations;

import java.lang.annotation.*;

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
