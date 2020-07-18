package com.example.sahil.design_patterns.structural.facade.engine_components;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AirFlowController {

    private final Logger log = LoggerFactory.getLogger(AirFlowController.class);
    private AirFlowMeter airFlowMeter = new AirFlowMeter();

    public void takeAir() {
        airFlowMeter.getMeasurements();
        log.info("Air provided!");
    }

    public void off() {
        log.info("Air controller switched off.");
    }
}