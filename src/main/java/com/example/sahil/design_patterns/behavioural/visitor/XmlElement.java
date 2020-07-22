package com.example.sahil.design_patterns.behavioural.visitor;


import java.util.UUID;

public class XmlElement extends Element {

    public XmlElement() {
        super(UUID.randomUUID().toString());
    }

    public void accept(Visitor v) {  v.visit(this); }
}