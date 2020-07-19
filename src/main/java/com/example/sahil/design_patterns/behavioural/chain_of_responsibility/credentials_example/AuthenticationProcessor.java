package com.example.sahil.design_patterns.behavioural.chain_of_responsibility.credentials_example;

public abstract class AuthenticationProcessor {

    protected AuthenticationProcessor nextProcessor;

    public AuthenticationProcessor(AuthenticationProcessor nextProcessor){
        this.nextProcessor = nextProcessor;
    }

    public abstract boolean isAuthorized(AuthenticationProvider authProvider);
}