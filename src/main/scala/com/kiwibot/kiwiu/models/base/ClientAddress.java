package com.kiwibot.kiwiu.models.base;

public abstract class ClientAddress extends Address{
    private final String name;

    private final boolean favorite;

    private final String clientId;

    private final String zoneId;

    protected ClientAddress(String id, Boolean deleted, String lat, String lng, String description, String comments, String city, String state, String street, int streetNumber, String zipCode, String shortAddress, String longAddress, String name, boolean favorite, String clientId, String zoneId) {
        super(id, deleted, lat, lng, description, comments, city, state, street, streetNumber, zipCode, shortAddress, longAddress);
        this.name = name;
        this.favorite = favorite;
        this.clientId = clientId;
        this.zoneId = zoneId;
    }
}