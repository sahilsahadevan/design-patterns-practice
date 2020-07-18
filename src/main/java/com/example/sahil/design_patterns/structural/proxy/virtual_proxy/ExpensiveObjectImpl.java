package com.example.sahil.design_patterns.structural.proxy.virtual_proxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExpensiveObjectImpl implements ExpensiveObject {
    private final Logger log = LoggerFactory.getLogger(ExpensiveObjectImpl.class);
    public ExpensiveObjectImpl() {
        heavyInitialConfiguration();
    }

    @Override
    public void process() {
        log.info("processing complete.");
    }

    private void heavyInitialConfiguration() {
        log.info("Loading initial configuration...");
    }

}
