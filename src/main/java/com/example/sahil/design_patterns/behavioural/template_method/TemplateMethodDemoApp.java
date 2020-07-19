package com.example.sahil.design_patterns.behavioural.template_method;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TemplateMethodDemoApp {
    private static final Logger log = LoggerFactory.getLogger(TemplateMethodDemoApp.class);

    public static void main(String[] args) {
        SpringApplication.run(TemplateMethodDemoApp.class, args);
        log.info("{}", new BasicComputer().build());
        log.info("{}", new GamingComputer().build());
    }

}