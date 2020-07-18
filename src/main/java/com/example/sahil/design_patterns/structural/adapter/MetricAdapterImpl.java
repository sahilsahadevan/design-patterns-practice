package com.example.sahil.design_patterns.structural.adapter;

public class MetricAdapterImpl implements MovableAdapter {

    private final Movable luxuryCars;

    //Accepting Imperial Movable Implementations while initializing
    public MetricAdapterImpl(Movable luxuryCars) {
        this.luxuryCars = luxuryCars;
    }

    @Override
    public double getSpeed() {
        return convertMPHtoKMPH(luxuryCars.getSpeed());
    }

    private double convertMPHtoKMPH(double mph) {
        return mph * 1.60934;
    }
}
