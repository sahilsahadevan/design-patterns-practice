package com.example.sahil.design_patterns.creational.abstract_factory.example2;

public interface AbstractFactory<T> {
    T create(String animalType) ;
}
