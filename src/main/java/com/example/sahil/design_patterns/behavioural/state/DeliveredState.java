package com.example.sahil.design_patterns.behavioural.state;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DeliveredState implements PackageState {
private final Logger log = LoggerFactory.getLogger(DeliveredState.class);
    @Override
    public void next(Package pkg) {
        pkg.setState(new CustomerReceivedState());
    }

    @Override
    public void prev(Package pkg) {
        pkg.setState(new OrderedState());
    }

    @Override
    public void printStatus() {
        log.info("Package Delivered to Customer");
    }

    @Override
    public String toString() {
        return "DeliveredState";
    }
}