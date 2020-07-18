package com.example.sahil.design_patterns.structural.adapter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AdapterDemoApp {

    private static final Logger log = LoggerFactory.getLogger(AdapterDemoApp.class);
    public static void main(String[] args) {
        SpringApplication.run(AdapterDemoApp.class, args);
        Movable bugattiVeyron = new BugattiVeyron();
        MovableAdapter bugattiVeyronAdapter = new MetricAdapterImpl(bugattiVeyron);

        log.info("Top speed of Bugatti is {} MPH or {} KMPH", bugattiVeyron.getSpeed(), bugattiVeyronAdapter.getSpeed());
    }

}