package at.appicenter.ddd.annotations;

import java.lang.annotation.*;

/**
 * Marker annotation for domain services.
 */
@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@DDDAnnotation
public @interface DomainService {
}
