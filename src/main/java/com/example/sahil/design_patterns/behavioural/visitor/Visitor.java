package com.example.sahil.design_patterns.behavioural.visitor;

public interface Visitor {

    void visit(XmlElement xmlElement);
    void visit(JsonElement jsonElement);

}
