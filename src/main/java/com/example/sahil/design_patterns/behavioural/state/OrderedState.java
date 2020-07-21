package com.example.sahil.design_patterns.behavioural.state;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OrderedState implements PackageState {
    private final Logger log = LoggerFactory.getLogger(OrderedState.class);

    @Override
    public void next(Package pkg) {
        pkg.setState(new DeliveredState());
    }

    @Override
    public void prev(Package pkg) {
        pkg.setState(new NotStartedState());
    }

    @Override
    public void printStatus() {
        log.info("Package Ordered");
    }

    @Override
    public String toString() {
        return "OrderedState";
    }
}