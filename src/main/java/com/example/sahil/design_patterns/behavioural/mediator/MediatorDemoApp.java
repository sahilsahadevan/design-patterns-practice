package com.example.sahil.design_patterns.behavioural.mediator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MediatorDemoApp {
private static final Logger log = LoggerFactory.getLogger(MediatorDemoApp.class);
    public static void main(String[] args) {
        SpringApplication.run(MediatorDemoApp.class, args);
        Fan fan = new Fan();
        Mediator mediator = fan.getMediator();
        log.info("Fan 'On' Status -> {}. Switching on now...", fan.isOn());
        mediator.press();
        log.info("Fan 'On' Status -> {}. Switching off now..", fan.isOn());
        mediator.press();
        log.info("Fan 'On' Status -> {}", fan.isOn());
    }

}