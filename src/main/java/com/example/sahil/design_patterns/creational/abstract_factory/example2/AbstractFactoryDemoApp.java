package com.example.sahil.design_patterns.creational.abstract_factory.example2;

import com.example.sahil.design_patterns.creational.abstract_factory.example2.animals.Animal;
import com.example.sahil.design_patterns.creational.abstract_factory.example2.color.Color;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
class AbstractFactoryDemoApp {
    public static void main(String[] args) {
        AbstractFactory abstractFactory;
        Animal dog = null;
        Color brown = null;
        String result;

        abstractFactory = FactoryProvider.getFactory("Animal");
        if (abstractFactory != null) {
            dog = (Animal) abstractFactory.create("Dog");
        }
        abstractFactory = FactoryProvider.getFactory("Color");
        if (abstractFactory != null) {
            brown = (Color) abstractFactory.create("Brown");
        }

        if(dog != null && brown != null) {
            result = "A " + brown.getColor() + " " + dog.getAnimal() + " " + dog.makeSound();
        } else {
            result = "Invalid animal or Color";
            }
        System.out.println(result);
    }
}

