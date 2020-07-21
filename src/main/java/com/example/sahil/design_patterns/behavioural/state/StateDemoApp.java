package com.example.sahil.design_patterns.behavioural.state;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StateDemoApp {

    public static void main(String[] args) {
        SpringApplication.run(StateDemoApp.class, args);

        Package pkg = new Package();

        pkg.printStatus();
        pkg.previousState();

        pkg.nextState();
        pkg.printStatus();

        pkg.nextState();
        pkg.printStatus();

        pkg.nextState();
        pkg.printStatus();

        pkg.nextState();
        pkg.printStatus();
    }

}
