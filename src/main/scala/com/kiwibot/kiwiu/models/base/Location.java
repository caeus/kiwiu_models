package com.kiwibot.kiwiu.models.base;

import lombok.With;

@With
public abstract class Location extends Entity {
    private final String lat;
    private final String lng;
    private final String description;
    private final String comments;
    protected Location(String id, Boolean deleted, String lat, String lng, String description, String comments) {
        super(id, deleted);
        this.lat = lat;
        this.lng = lng;
        this.description = description;
        this.comments = comments;
    }
}
