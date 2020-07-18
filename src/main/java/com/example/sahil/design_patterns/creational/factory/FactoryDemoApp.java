package com.example.sahil.design_patterns.creational.factory;

import com.example.sahil.design_patterns.creational.factory.using_abstract.Plan;
import com.example.sahil.design_patterns.creational.factory.using_abstract.PlanFactory;
import com.example.sahil.design_patterns.creational.factory.using_interface.Shape;
import com.example.sahil.design_patterns.creational.factory.using_interface.ShapeFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FactoryDemoApp {

    public static void main(String[] args) {
        //Patter using Interface Example
        ShapeFactory shapeFactory = new ShapeFactory();
        //get an object of Circle and call its draw method.
        Shape circle = shapeFactory.getShape("CIRCLE");
        //call draw method of Circle
        circle.draw();
        //get an object of Rectangle and call its draw method.
        Shape rectangle = shapeFactory.getShape("RECTANGLE");
        //call draw method of Rectangle
        rectangle.draw();
        //get an object of Square and call its draw method.
        Shape square = shapeFactory.getShape("SQUARE");
        //call draw method of square
        square.draw();

        //Pattern using Abstract
        int units = 10;
        PlanFactory planFactory = new PlanFactory();
        Plan domestic = planFactory.getInstance("DOMESTIC");
        domestic.getRate();
        domestic.calculateBill(units);
        Plan commercial = planFactory.getInstance("commercial");
        commercial.getRate();
        commercial.calculateBill(units);
        Plan institutional = planFactory.getInstance("Institutional");
        institutional.getRate();
        institutional.calculateBill(units);
    }
}
