package com.github.knittl.ddd.annotations.examples.person;

import com.github.knittl.ddd.annotations.EntityId;

import java.util.*;

@EntityId
public class SocialSecurityNumber {
    private final String value;

    private SocialSecurityNumber(final String value) {
        this.value = Objects.requireNonNull(value);
    }

    public static SocialSecurityNumber of(final String value) {
        return new SocialSecurityNumber(value);
    }

    public String value() {
        return value;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        final SocialSecurityNumber that = (SocialSecurityNumber) o;
        return value.equals(that.value);
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }
}
