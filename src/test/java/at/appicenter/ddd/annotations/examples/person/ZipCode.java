package at.appicenter.ddd.annotations.examples.person;

import at.appicenter.ddd.annotations.*;

import java.util.*;

@ValueObject
public class ZipCode {
    private final String zipCode;

    public ZipCode(final String zipCode) {
        this.zipCode = Objects.requireNonNull(zipCode);
    }

    public String value() {
        return zipCode;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        final ZipCode that = (ZipCode) o;
        return zipCode.equals(that.zipCode);
    }

    @Override
    public int hashCode() {
        return zipCode.hashCode();
    }
}
