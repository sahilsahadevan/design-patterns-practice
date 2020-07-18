package com.example.sahil.design_patterns.structural.adapter;

// Creating an Adapter to convert the Imperial Values of Movable to Metric to cater Indian Consumers
public interface MovableAdapter {

    // returns speed in KM/H .
    // Notice how the method naming convention getSpeed() matches Movable Interface to avoid confusions
    double getSpeed();
}