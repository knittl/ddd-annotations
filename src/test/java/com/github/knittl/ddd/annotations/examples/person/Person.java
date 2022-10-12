package com.github.knittl.ddd.annotations.examples.person;

import com.github.knittl.ddd.annotations.Aggregate;
import com.github.knittl.ddd.annotations.EntityId;

import java.util.*;

@Aggregate.Root
public class Person {
    @EntityId
    private final SocialSecurityNumber ssn;
    private final Address primaryAddress;

    public Person(final SocialSecurityNumber ssn, final Address primaryAddress) {
        this.ssn = Objects.requireNonNull(ssn);
        this.primaryAddress = primaryAddress;
    }

    public SocialSecurityNumber socialSecurityNumber() {
        return ssn;
    }

    public Address primaryAddress() {
        return primaryAddress;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        final Person person = (Person) o;
        return ssn.equals(person.ssn);
    }

    @Override
    public int hashCode() {
        return ssn.hashCode();
    }
}
