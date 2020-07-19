package com.example.sahil.design_patterns.behavioural.chain_of_responsibility.credentials_example;

public class AuthenticationChain {

    private AuthenticationProcessor processor;

    public AuthenticationChain(){
        this.processor = setChainAuthenticationResponsibilities();
    }

    public AuthenticationProcessor getProcessor(){
        return this.processor;
    }

    //Forming Chains : Start with "end-of-chain" first, i.e Highest level of Hierarchy
    private AuthenticationProcessor setChainAuthenticationResponsibilities() {
        //The end-of-chain does not need to pass to the next processor hence null argument in samlAuthenticationProcessor
        AuthenticationProcessor samlAuthenticationProcessor = new SamlAuthenticationProcessor(null);
        AuthenticationProcessor oAuthProcessor = new OAuthProcessor(samlAuthenticationProcessor);
        return new UsernamePasswordProcessor(oAuthProcessor);  // reached start-of-chain, hence returning
    }
}
