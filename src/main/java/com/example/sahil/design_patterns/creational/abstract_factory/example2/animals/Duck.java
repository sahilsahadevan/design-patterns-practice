package com.example.sahil.design_patterns.creational.abstract_factory.example2.animals;

public class Duck implements Animal {

    @Override
    public String getAnimal() {
        return "Duck";
    }

    @Override
    public String makeSound() {
        return "Quacks";
    }
}