package com.example.sahil.design_patterns.structural.flyweight.color;

public class White implements Color {
    @Override
    public String getColor(){ return "White"; }

    @Override
    public int compareTo(Color o) {
        return o.getColor().equalsIgnoreCase(this.getColor()) ? 0 : 1;
    }
}
