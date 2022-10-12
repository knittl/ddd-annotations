package com.github.knittl.ddd.annotations.examples.person;

import com.github.knittl.ddd.annotations.ValueObject;

@ValueObject
public class Address {
    private final ZipCode zipCode;
    private final String city;
    private final String street;
    private final String number;

    private Address(
            final ZipCode zipCode,
            final String city,
            final String street,
            final String number) {
        this.zipCode = zipCode;
        this.city = city;
        this.street = street;
        this.number = number;
    }

    public static Address at(final ZipCode zipCode, final String city, final String street, final String number) {
        return new Address(zipCode, city, street, number);
    }

    public ZipCode zipCode() {
        return zipCode;
    }

    public String city() {
        return city;
    }

    public String street() {
        return street;
    }

    public String number() {
        return number;
    }
}
