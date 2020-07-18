package com.example.sahil.design_patterns.structural.bridge;

public class Pentagon extends Shape {

    public Pentagon(Color color) {
        super(color);
    }

    @Override
    public String draw() {
        return color.fill() + " Pentagon drawn.";
    }
}