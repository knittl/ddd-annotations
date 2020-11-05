package com.github.knittl.ddd.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Marker annotation for <i>Application Services</i>.
 * <p>
 * An <i>application service</i> is responsible for handling transactions, ensuring system security, looking up the proper
 * aggregates, invoking methods on them and saving the changes back to the database. Application services do not
 * contain any business logic themselves.
 * <p>
 * It is only responsible for orchestration (finding the correct objects and invoking the correct methods in the correct
 * order)
 *
 * @see <a href="https://www.domainlanguage.com/ddd/reference/">DDD Reference</a>
 */
@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@DDDAnnotation
public @interface ApplicationService {
}
