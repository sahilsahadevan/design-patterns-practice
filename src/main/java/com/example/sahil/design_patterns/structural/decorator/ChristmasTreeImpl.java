package com.example.sahil.design_patterns.structural.decorator;

public class ChristmasTreeImpl implements ChristmasTree {

    @Override
    public String decorate() {
        return "We got a Christmas tree no. "+ super.hashCode() +"! ";
    }
}