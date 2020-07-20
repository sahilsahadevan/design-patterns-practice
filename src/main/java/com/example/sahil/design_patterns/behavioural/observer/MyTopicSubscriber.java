package com.example.sahil.design_patterns.behavioural.observer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyTopicSubscriber implements Observer {
    private final Logger log = LoggerFactory.getLogger(MyTopicSubscriber.class);
    private final String name;
    private Observable topic;

    public MyTopicSubscriber(String nm) {
        this.name = nm;
    }

    @Override
    public void update() {
        String msg = (String) topic.getUpdate(this);
        if (msg == null) {
            log.info("{} :: No new message", name);
        } else
            log.info("{} :: Consuming message:: {}", name, msg);
    }

    @Override
    public void setSubject(Observable sub) {
        this.topic = sub;
    }

}