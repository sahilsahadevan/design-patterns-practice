package com.example.sahil.design_patterns.behavioural.chain_of_responsibility.credentials_example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OAuthProcessor extends AuthenticationProcessor {
    private final Logger log = LoggerFactory.getLogger(OAuthProcessor.class);

    public OAuthProcessor(AuthenticationProcessor nextProcessor) {
        super(nextProcessor);
    }

    @Override
    public boolean isAuthorized(AuthenticationProvider authProvider) {
        if (authProvider instanceof OAuthTokenProvider) {
            authProvider.authenticate();
            return true;
        } else if (nextProcessor != null) {
            log.info("Skipping {}...", this.getClass().getSimpleName());
            return nextProcessor.isAuthorized(authProvider);
        }
        log.info("End of Chain. No AuthorizationProcessor found for {}", authProvider.getClass().getSimpleName());
        return false;
    }
}
