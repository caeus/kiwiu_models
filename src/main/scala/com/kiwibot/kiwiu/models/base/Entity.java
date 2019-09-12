package com.kiwibot.kiwiu.models.base;

import lombok.With;


@With
public abstract class Entity {
    private final String id;
    private final Boolean deleted;

    protected Entity(String id, Boolean deleted) {
        this.id = id;
        this.deleted = deleted;
    }
}