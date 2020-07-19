package com.example.sahil.design_patterns.behavioural.chain_of_responsibility.credentials_example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OAuth2TokenProvider implements AuthenticationProvider {
    private final Logger log = LoggerFactory.getLogger(OAuth2TokenProvider.class);
    @Override
    public void authenticate() {
        log.info("Authorized user [{}]",this.getClass().getSimpleName());
    }
}