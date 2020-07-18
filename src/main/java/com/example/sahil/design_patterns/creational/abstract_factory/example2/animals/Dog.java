package com.example.sahil.design_patterns.creational.abstract_factory.example2.animals;

public class Dog implements Animal {

    @Override
    public String getAnimal() {
        return "Dog";
    }

    @Override
    public String makeSound() {
        return "Barks";
    }
}