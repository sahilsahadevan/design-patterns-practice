package com.example.sahil.design_patterns.structural.bridge;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BridgeDemoApp {

    private static final Logger log = LoggerFactory.getLogger(BridgeDemoApp.class);
    public static void main(String[] args) {
        SpringApplication.run(BridgeDemoApp.class, args);
        Color red = new Red();
        Color green = new Green();
        Shape redTriangle = new Triangle(red);
        Shape greenTriangle = new Triangle(green);
        Shape redPentagon = new Pentagon(red);
        Shape greenPentagon = new Pentagon(green);
        log.info("{}", redTriangle.draw());
        log.info("{}", greenTriangle.draw());
        log.info("{}", redPentagon.draw());
        log.info("{}", greenPentagon.draw());
    }

}