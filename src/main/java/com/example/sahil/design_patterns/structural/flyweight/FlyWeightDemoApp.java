package com.example.sahil.design_patterns.structural.flyweight;

import com.example.sahil.design_patterns.structural.flyweight.color.Black;
import com.example.sahil.design_patterns.structural.flyweight.color.White;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FlyWeightDemoApp {
    private static final Logger log = LoggerFactory.getLogger(FlyWeightDemoApp.class);

    public static void main(String[] args) {
        SpringApplication.run(FlyWeightDemoApp.class, args);
        Vehicle blackCar1 = VehicleFactory.createVehicle(new Black());
        log.info("blackCar1 details : color={}, objectHandler={} ",blackCar1.getColor(), blackCar1.hashCode() );
        Vehicle blackCar2 = VehicleFactory.createVehicle(new Black());
        log.info("blackCar2 details : color={}, objectHandler={} ",blackCar2.getColor(), blackCar2.hashCode() );
        Vehicle whiteCar = VehicleFactory.createVehicle(new White());
        log.info("whiteCar details : color={}, objectHandler={} ",whiteCar.getColor(), whiteCar.hashCode() );

    }

}