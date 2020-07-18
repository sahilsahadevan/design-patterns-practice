package com.example.sahil.design_patterns.structural.facade;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FacadeDemoApp {
private static final Logger log = LoggerFactory.getLogger(FacadeDemoApp.class);
    public static void main(String[] args) {
        SpringApplication.run(FacadeDemoApp.class, args);
        CarEngineFacade facade = new CarEngineFacade();
        facade.startEngine();
        log.info("Engine has been successfully started!");
        log.info("----------------------------");
        facade.stopEngine();
        log.info("Engine has been successfully turned off!");

    }

}