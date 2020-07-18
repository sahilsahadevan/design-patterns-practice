package com.example.sahil.design_patterns.structural.flyweight;

import com.example.sahil.design_patterns.structural.flyweight.color.Color;

// we'll create a Vehicle interface.
// Since this interface will be the return type of the factory method we need to make sure to expose all the relevant methods:
public interface Vehicle {

    void start();
    void stop();
    Color getColor();
}
