package com.github.knittl.ddd.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Marker annotation for <i>Domain Services</i>.
 * <p>
 * A <i>domain service</i> is only responsible for making business decisions. It should generally not invoke any
 * repository methods that alter the state of the database &ndash; that is the responsibility of the
 * {@link ApplicationService application service}.
 * <p>
 * Domain services have the following characteristics:
 *
 * <ul>
 *   <li>  They are stateless</li>
 *   <li>  They are highly cohesive (meaning they are specialized in doing one thing and one thing only)</li>
 *   <li>  They contain business logic that does not naturally fit elsewhere</li>
 *   <li>  They can interact with other domain services and to some extent with repositories</li>
 *   <li>  They can publish domain events</li>
 * </ul>
 *
 * @see <a href="https://www.domainlanguage.com/ddd/reference/">DDD Reference</a>
 */
@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@DDDAnnotation
public @interface DomainService {
}
