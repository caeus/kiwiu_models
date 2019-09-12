package com.kiwibot.kiwiu.models.addresses;

import com.kiwibot.kiwiu.models.base.ClientAddress;

public class CreateAddressRequest extends ClientAddress {
    public CreateAddressRequest(String id, Boolean deleted, String lat, String lng, String description, String comments, String city, String state, String street, int streetNumber, String zipCode, String shortAddress, String longAddress, String name, boolean favorite, String clientId, String zoneId) {
        super(id, deleted, lat, lng, description, comments, city, state, street, streetNumber, zipCode, shortAddress, longAddress, name, favorite, clientId, zoneId);
    }
}
