package com.example.sahil.design_patterns.structural.facade.engine_components;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Starter {

    private final Logger log = LoggerFactory.getLogger(Starter.class);

    public void start() {
        log.info("Starting..");
    }
}