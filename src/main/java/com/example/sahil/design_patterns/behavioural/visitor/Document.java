package com.example.sahil.design_patterns.behavioural.visitor;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Document extends Element {

    private List<Element> elements;

    public Document() {
        super(UUID.randomUUID().toString());
        this.elements = new ArrayList<>();
    }

    @Override
    public void accept(Visitor v) {
        for (Element e : this.elements) {
            e.accept(v);
        }
    }

    public void addElement(Element e){
        elements.add(e);
    }

}