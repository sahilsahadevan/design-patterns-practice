package com.example.sahil.design_patterns.creational.singleton;

import com.example.sahil.design_patterns.DesignPatternsPracticeApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SingletonDemoApp {

    public static void main(String[] args) {
        SpringApplication.run(DesignPatternsPracticeApplication.class, args);
        SingletonDemo singletonDemo1 = SingletonDemo.getInstance();
        SingletonDemo singletonDemo2 = SingletonDemo.getInstance();
        SingletonDemo singletonDemo3 = SingletonDemo.getInstance();
        System.out.println("singletonDemo1 = " + singletonDemo1);
        System.out.println("singletonDemo2 = " + singletonDemo2);
        System.out.println("singletonDemo3 = " + singletonDemo3);
        System.out.println("is singletonDemo1 ==  singletonDemo2 == singletonDemo3 "
                + ((singletonDemo1 == singletonDemo2) && (singletonDemo1 == singletonDemo3)));
    }

}
