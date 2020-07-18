package com.example.sahil.design_patterns.structural.flyweight.powertrain;

public class GasolineEngine implements Engine{
    @Override
    public String type() {
        return getClass().getSimpleName();
    }
}
