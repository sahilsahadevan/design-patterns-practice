package com.example.sahil.design_patterns.structural.flyweight;

import com.example.sahil.design_patterns.structural.flyweight.color.Color;
import com.example.sahil.design_patterns.structural.flyweight.powertrain.Engine;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// Concrete Vehicle class
public class Car implements Vehicle {
    private final Logger log = LoggerFactory.getLogger(Car.class);
    private final Engine engine;
    private final Color color;

    public Car(Engine engine, Color color){
        this.engine = engine;
        this.color = color;
    }

    @Override
    public void start() {
        log.info("The Car's {} has been started", engine.type());
    }

    @Override
    public void stop() {
        log.info("The Car's {} has been switched off", engine.type());
    }

    @Override
    public Color getColor() {
        return color;
    }
}
