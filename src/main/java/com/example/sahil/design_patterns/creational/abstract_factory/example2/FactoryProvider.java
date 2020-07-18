package com.example.sahil.design_patterns.creational.abstract_factory.example2;

class FactoryProvider {
    private FactoryProvider(){}

    public static AbstractFactory getFactory(String choice){

        if("Animal".equalsIgnoreCase(choice)){
            return new AnimalFactory();
        }
        else if("Color".equalsIgnoreCase(choice)){
            return new ColorFactory();
        }

        return null;
    }
}
