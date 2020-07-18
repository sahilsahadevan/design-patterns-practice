package com.example.sahil.design_patterns.creational.factory.using_interface;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Rectangle implements Shape {

    //Incidentally, we are using LoggerFactory.getLogger() which itself is a good example of Factory pattern
    private final Logger log = LoggerFactory.getLogger(Rectangle.class);

    @Override
    public void draw() {
        log.info("Inside Rectangle::draw() method.");
    }
}