package com.example.studyit.model;

public abstract class CNamedObject extends CBaseObject{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
