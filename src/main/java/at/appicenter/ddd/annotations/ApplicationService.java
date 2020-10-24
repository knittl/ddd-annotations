package at.appicenter.ddd.annotations;

import java.lang.annotation.*;

/**
 * Marker annotation for application services.
 */
@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@DDDAnnotation
public @interface ApplicationService {
}
