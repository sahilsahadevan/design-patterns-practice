package com.example.sahil.design_patterns.structural.flyweight.powertrain;

public class ElectricMotor implements Engine {

    @Override
    public String type() {
        return getClass().getSimpleName();
    }
}
