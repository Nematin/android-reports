package com.example.studyit.model;

import java.util.UUID;

public abstract class CBaseObject {
    private UUID id;


    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}
