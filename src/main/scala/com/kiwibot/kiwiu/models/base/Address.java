package com.kiwibot.kiwiu.models.base;

import lombok.With;

@With
public abstract class Address extends Location {
    private final String city;
    private final String state;
    private final String street;
    private final int streetNumber;
    private final String zipCode;
    private final String shortAddress;
    private final String longAddress;

    protected Address(String id, Boolean deleted, String lat, String lng, String description, String comments, String city, String state, String street, int streetNumber, String zipCode, String shortAddress, String longAddress) {
        super(id, deleted, lat, lng, description, comments);
        this.city = city;
        this.state = state;
        this.street = street;
        this.streetNumber = streetNumber;
        this.zipCode = zipCode;
        this.shortAddress = shortAddress;
        this.longAddress = longAddress;
    }
}