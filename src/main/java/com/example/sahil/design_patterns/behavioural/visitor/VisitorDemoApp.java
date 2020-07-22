package com.example.sahil.design_patterns.behavioural.visitor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VisitorDemoApp {

    public static void main(String[] args) {
        SpringApplication.run(VisitorDemoApp.class, args);
        Visitor v = new ElementVisitor();

        Document d = new Document();
        d.addElement(new JsonElement());
        d.addElement(new JsonElement());
        d.addElement(new XmlElement());
        d.accept(v);
    }
}