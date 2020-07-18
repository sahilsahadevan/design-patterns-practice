package com.example.sahil.design_patterns.creational.abstract_factory.example2;

import com.example.sahil.design_patterns.creational.abstract_factory.example2.animals.Animal;
import com.example.sahil.design_patterns.creational.abstract_factory.example2.animals.Bear;
import com.example.sahil.design_patterns.creational.abstract_factory.example2.animals.Dog;
import com.example.sahil.design_patterns.creational.abstract_factory.example2.animals.Duck;

class AnimalFactory implements AbstractFactory<Animal> {

    @Override
    public Animal create(String animalType) {
        if ("Dog".equalsIgnoreCase(animalType)) {
            return new Dog();
        } else if ("Duck".equalsIgnoreCase(animalType)) {
            return new Duck();
        } else if ("Bear".equalsIgnoreCase(animalType)){
            return new Bear();
        }
        return null;
    }

}