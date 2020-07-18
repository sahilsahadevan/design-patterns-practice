package com.example.sahil.design_patterns.structural.flyweight.powertrain;

public class DieselEngine implements Engine{

    @Override
    public String type() {
        return getClass().getSimpleName();
    }
}
