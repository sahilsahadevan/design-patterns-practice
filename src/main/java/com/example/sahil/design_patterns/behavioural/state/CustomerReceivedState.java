package com.example.sahil.design_patterns.behavioural.state;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CustomerReceivedState implements PackageState {
    private final Logger log = LoggerFactory.getLogger(CustomerReceivedState.class);

    @Override
    public void next(Package pkg) {
        log.info("The package is already in it's end state.");
    }

    @Override
    public void prev(Package pkg) {
        pkg.setState(new DeliveredState());
    }

    @Override
    public void printStatus() {
        log.info("Package Receipt Acknowledged by Customer");
    }

    @Override
    public String toString() {
        return "CustomerReceivedState";
    }
}