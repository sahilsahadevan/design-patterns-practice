package com.example.sahil.design_patterns.creational.abstract_factory.example2;

import com.example.sahil.design_patterns.creational.abstract_factory.example2.color.Black;
import com.example.sahil.design_patterns.creational.abstract_factory.example2.color.Brown;
import com.example.sahil.design_patterns.creational.abstract_factory.example2.color.Color;
import com.example.sahil.design_patterns.creational.abstract_factory.example2.color.White;

public class ColorFactory implements AbstractFactory<Color> {

    @Override
    public Color create(String animalType) {
        if ("Black".equalsIgnoreCase(animalType)) {
            return new Black();
        } else if ("Brown".equalsIgnoreCase(animalType)) {
            return new Brown();
        } else if ("White".equalsIgnoreCase(animalType)){
            return new White();
        }

        return null;
    }

}