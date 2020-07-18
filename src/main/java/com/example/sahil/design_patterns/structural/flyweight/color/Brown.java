package com.example.sahil.design_patterns.structural.flyweight.color;

public class Brown implements Color {
    @Override
    public String getColor(){ return "Brown"; }

    @Override
    public int compareTo(Color o) {
        return o.getColor().equalsIgnoreCase(this.getColor()) ? 0 : 1;
    }
}
