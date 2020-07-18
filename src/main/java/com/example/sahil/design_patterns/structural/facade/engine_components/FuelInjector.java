package com.example.sahil.design_patterns.structural.facade.engine_components;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FuelInjector {
    private final Logger log = LoggerFactory.getLogger(FuelInjector.class);
    private FuelPump fuelPump = new FuelPump();

    public void on() {
        log.info("Fuel injector ready to inject fuel.");
    }

    public void inject() {
        fuelPump.pump();
        log.info("Fuel injected.");
    }

    public void off() {
        log.info("Stopping Fuel injector..");
    }
}