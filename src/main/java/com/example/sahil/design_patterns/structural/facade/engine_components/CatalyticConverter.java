package com.example.sahil.design_patterns.structural.facade.engine_components;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CatalyticConverter {

    private final Logger log = LoggerFactory.getLogger(CatalyticConverter.class);

    public void on() {
        log.info("Catalytic Converter switched on!");
    }

    public void off() {
        log.info("Catalytic Converter switched off!");
    }
}