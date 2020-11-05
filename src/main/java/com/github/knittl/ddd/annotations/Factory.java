package com.github.knittl.ddd.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * Marker annotation for <i>Domain Factories</i>.
 * <p>
 * A <i>FACTORY</i> is very tightly coupled to its product, so a FACTORY should be attached only to an object that has a
 * close natural relationship with the product. When there is something we want to hide -- either the concrete
 * implementation or the sheer complexity of construction -- yet there does not seem to be a natural host, we must
 * create a dedicated FACTORY object or {@link DomainService SERVICE}. A standalone FACTORY usually produces an
 * entire {@link Aggregate AGGREGATE}, handing out a reference to the root, and ensuring that the product AGGREGATE'S
 * invariants are enforced. If an object interior to an AGGREGATE needs a FACTORY, and the AGGREGATE root is not a
 * reasonable home for it, then go ahead and make a standalone FACTORY . But respect the rules limiting access within
 * an AGGREGATE, and make sure there are only transient references to the product from outside the AGGREGATE.
 * <p>
 * The factory can interact with other factories, {@link Domain.Repository repositories} and {@link DomainService
 * domain services} but must never alter the state of the database.
 * <p>
 * <b>GLOSSARY</b>: A mechanism for encapsulating complex creation logic and abstracting the type of a
 * created object for the sake of a client.
 *
 * @see <a href="https://www.domainlanguage.com/ddd/reference/">DDD Reference</a>
 */
@Documented
@Target(ElementType.TYPE)
@DDDAnnotation
public @interface Factory {
}
