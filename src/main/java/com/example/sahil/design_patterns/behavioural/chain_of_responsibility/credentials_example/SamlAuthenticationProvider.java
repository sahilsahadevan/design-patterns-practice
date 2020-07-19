package com.example.sahil.design_patterns.behavioural.chain_of_responsibility.credentials_example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SamlAuthenticationProvider implements AuthenticationProvider{
    private final Logger log = LoggerFactory.getLogger(SamlAuthenticationProvider.class);
    @Override
    public void authenticate() {
        log.info("Authorized user [{}]",this.getClass().getSimpleName());
    }
}
