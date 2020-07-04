package com.example.sahil.design_patterns.creational.singleton;

public class SingletonDemo {

    //create an object of SingletonDemo
    private static SingletonDemo instance;

    //make the constructor private so that this class cannot be instantiated
    private SingletonDemo(){ }

    //Get the only object available
    public static SingletonDemo getInstance(){
        if(instance == null){
            instance = new SingletonDemo();
        }
        return instance;
    }
}
