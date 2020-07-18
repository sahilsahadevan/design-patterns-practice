package com.example.sahil.design_patterns.structural.facade.engine_components;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AirFlowMeter {

    private final Logger log = LoggerFactory.getLogger(AirFlowMeter.class);

    public void getMeasurements() {
        log.info("Getting air measurements..");
    }
}