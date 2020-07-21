package com.example.sahil.design_patterns.behavioural.state;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NotStartedState implements PackageState {
    private final Logger log = LoggerFactory.getLogger(NotStartedState.class);

    @Override
    public void next(Package pkg) {
        pkg.setState(new OrderedState());
    }

    @Override
    public void prev(Package pkg) {
        log.info("The package is already in it's root state.");
    }

    @Override
    public void printStatus() {
        log.info("Order not Complete, Hence delivery not started yet.");
    }

    @Override
    public String toString() {
        return "NotStartedState";
    }
}
