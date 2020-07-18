package com.example.sahil.design_patterns.structural.facade.engine_components;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TemperatureSensor {
    private final Logger log = LoggerFactory.getLogger(TemperatureSensor.class);

    public void getTemperature() {
        log.info("Getting temperature from the sensor..");
    }

}