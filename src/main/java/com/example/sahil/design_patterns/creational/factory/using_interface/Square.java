package com.example.sahil.design_patterns.creational.factory.using_interface;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Square implements Shape {

    private final Logger log = LoggerFactory.getLogger(Square.class);

    @Override
    public void draw() {
        log.info("Inside Square::draw() method.");
    }
}