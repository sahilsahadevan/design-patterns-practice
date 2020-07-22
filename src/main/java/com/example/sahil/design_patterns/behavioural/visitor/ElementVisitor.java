package com.example.sahil.design_patterns.behavioural.visitor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ElementVisitor implements Visitor {
    private final Logger log = LoggerFactory.getLogger(ElementVisitor.class);

    @Override
    public void visit(XmlElement xe) {
        log.info("processing xml element with uuid: {}", xe.getUuid());
    }

    @Override
    public void visit(JsonElement je) {
        log.info("processing json element with uuid: {}", je.getUuid());
    }
}