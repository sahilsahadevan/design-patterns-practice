package com.example.sahil.design_patterns.structural.facade.engine_components;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FuelPump {
    private final Logger log = LoggerFactory.getLogger(FuelPump.class);
    private static final Logger LOGGER = LoggerFactory.getLogger(FuelPump.class);

    public void pump() {
        log.info("Fuel Pump is pumping fuel..");
    }
}