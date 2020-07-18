package com.example.sahil.design_patterns.structural.decorator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DecoratorDemoApp {
 private static final Logger log = LoggerFactory.getLogger(DecoratorDemoApp.class);
    public static void main(String[] args) {
        SpringApplication.run(DecoratorDemoApp.class, args);
        ChristmasTree tree1 = new Garland(new ChristmasTreeImpl());
        log.info("{}",  tree1.decorate());

        ChristmasTree tree2 = new BubbleLights( new Garland(new Garland(new ChristmasTreeImpl())));
        log.info("{}",  tree2.decorate());
    }

}
