package com.example.sahil.design_patterns.creational.abstract_factory.example2.animals;

public class Bear implements Animal {

    @Override
    public String getAnimal() {
        return "Bear";
    }

    @Override
    public String makeSound() {
        return "Grunts";
    }
}