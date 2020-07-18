package com.example.sahil.design_patterns.structural.flyweight;

import com.example.sahil.design_patterns.structural.flyweight.color.Color;
import com.example.sahil.design_patterns.structural.flyweight.powertrain.GasolineEngine;

import java.util.HashMap;
import java.util.Map;

//Building a new vehicle is a very expensive operation so VehicleFactory will only create one vehicle per color.
public class VehicleFactory {

    //Storing a pool of Unique Vehicles per color in Hashmap.
    //For Concurrent apps, apply ThreadSafety here, like using ConcurrentHashmap
    private static Map<String, Vehicle> vehiclesCache = new HashMap<>();

    //Do not add same vehicle with same color twice.
    //Notice how the client code can only affect the extrinsic state of the object (the color of our vehicle)
    // passing it as an argument to the createVehicle method.
    public static Vehicle createVehicle(Color color) {
        // add new color entry if not present else , return existing entry value
        return vehiclesCache.computeIfAbsent(color.getColor(), newColor -> new Car(new GasolineEngine(), color));
    }

}
