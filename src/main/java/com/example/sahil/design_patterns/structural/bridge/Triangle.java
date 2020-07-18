package com.example.sahil.design_patterns.structural.bridge;

public class Triangle extends Shape {

    public Triangle(Color color) {
        super(color);
    }

    @Override
    public String draw() {
        return color.fill() + " Triangle drawn.";
    }
}