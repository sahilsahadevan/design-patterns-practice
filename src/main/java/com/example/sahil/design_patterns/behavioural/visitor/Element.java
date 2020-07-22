package com.example.sahil.design_patterns.behavioural.visitor;

public abstract class Element {
    private final String uuid;

    public Element(String uuid) {
        this.uuid = uuid;
    }

    public abstract void accept(Visitor v);

    protected String getUuid(){
        return this.uuid;
    }
}
