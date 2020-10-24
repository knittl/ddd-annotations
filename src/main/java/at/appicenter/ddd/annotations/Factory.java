package at.appicenter.ddd.annotations;

import java.lang.annotation.*;

/**
 * Marker annotation for domain factories.
 */
@Documented
@Target(ElementType.TYPE)
@DDDAnnotation
public @interface Factory {
}
