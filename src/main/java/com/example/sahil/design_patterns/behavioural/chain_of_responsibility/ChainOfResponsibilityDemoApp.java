package com.example.sahil.design_patterns.behavioural.chain_of_responsibility;

import com.example.sahil.design_patterns.behavioural.chain_of_responsibility.credentials_example.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ChainOfResponsibilityDemoApp {
private static final Logger log = LoggerFactory.getLogger(ChainOfResponsibilityDemoApp.class);
    public static void main(String[] args) {
        SpringApplication.run(ChainOfResponsibilityDemoApp.class, args);
         AuthenticationProcessor authenticationProcessor = new AuthenticationChain().getProcessor();
        //Returns true
        log.info("Authorization {}!",authenticationProcessor.isAuthorized(new SamlAuthenticationProvider()));

        //Returns false since OAuth2Processor was not added as part of chain
        log.info("Authorization {}!",authenticationProcessor.isAuthorized(new OAuth2TokenProvider()));

    }

}