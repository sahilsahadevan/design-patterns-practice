package com.example.sahil.design_patterns.creational.factory.using_abstract;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class Plan {
    private final Logger log = LoggerFactory.getLogger(Plan.class);
    protected double rate;

    public abstract void getRate();

    public void calculateBill(int units) {
        log.info("{}", units * rate);
    }
}