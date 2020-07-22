package com.example.sahil.design_patterns.behavioural.visitor;

import java.util.UUID;

public class JsonElement extends Element {

    public JsonElement(){
        super(UUID.randomUUID().toString());
    }
 
    public void accept(Visitor v) {
        v.visit(this);
    }
}