package com.example.sahil.design_patterns.creational.prototype;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PrototypeDemoApp {
    private static final Logger log = LoggerFactory.getLogger(PrototypeDemoApp.class);

    public static void main(String[] args) {
        SpringApplication.run(PrototypeDemoApp.class, args);

        Tree pineTreeOrg = new PineTree(10000.0d, 30.0d);
        pineTreeOrg.setPosition(new Position(10, 20));
        Tree plasticTreeOrg = new PlasticTree(100.0d, 15.0d);
        plasticTreeOrg.setPosition(new Position(2, 3));
        Tree pineTreeClone1 = pineTreeOrg.copy();
        Tree pineTreeClone2 = pineTreeOrg.copy();

        Tree plasticTreeClone1 = plasticTreeOrg.copy();
        Tree plasticTreeClone2 = plasticTreeOrg.copy();

        log.info("Original PineTree = {} ", pineTreeOrg);
        log.info("PineTree Clone1 = {} ", pineTreeClone1);
        log.info("PineTree Clone2 = {} ", pineTreeClone2);
        log.info("Original PlasticTree = {} ", plasticTreeOrg);
        log.info("PlasticTree Clone1 = {} ", plasticTreeClone1);
        log.info("PlasticTree Clone2 = {} ", plasticTreeClone2);
        log.info("Changing Values in pineTreeClone1 to see if Original is affected .. ");
        pineTreeClone1.setMass(200.0);
        pineTreeClone1.setPosition(new Position(23, 23));
        log.info("Original PineTree after change = {} ", pineTreeOrg);
        log.info("PineTree Clone1 after change = {} ", pineTreeClone1);
        log.info("PineTree Clone2 after change = {} ", pineTreeClone2);
        log.info("Changing Values in plasticTreeOrg to see if others is affected .. ");
        plasticTreeOrg.setMass(111.0);
        plasticTreeOrg.setPosition(new Position(5, 12));
        log.info("Original PlasticTree after change = {} ", plasticTreeOrg);
        log.info("PlasticTree Clone1 after change = {} ", plasticTreeClone1);
        log.info("PlasticTree Clone2 after change = {} ", plasticTreeClone2);
        log.info("Creating another clone from plasticTreeOrg");
        Tree plasticTreeClone3 = plasticTreeOrg.copy();
        log.info("PlasticTree Clone3 = {} ", plasticTreeClone3);
        log.info("PlasticTree Clone1 after creating new clone = {} ", plasticTreeClone1);
        log.info("PlasticTree Clone2 after creating new clone = {} ", plasticTreeClone2);

    }

}