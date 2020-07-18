package com.example.sahil.design_patterns.structural.facade.engine_components;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Radiator {

    private final Logger log = LoggerFactory.getLogger(Radiator.class);

    public void on() {
        log.info("Radiator switched on!");
    }

    public void off() {
        log.info("Radiator switched off!");
    }

    public void setSpeed(Integer speed) {
        log.info("Setting radiator speed to {}", speed);
    }
}