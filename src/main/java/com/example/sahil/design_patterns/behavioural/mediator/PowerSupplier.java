package com.example.sahil.design_patterns.behavioural.mediator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PowerSupplier {
    private final Logger log = LoggerFactory.getLogger(PowerSupplier.class);

    public void turnOn() {
        log.info("Power supply is now turned on");
    }

    public void turnOff() {
        log.info("Power supply has been switched off");
    }
}
