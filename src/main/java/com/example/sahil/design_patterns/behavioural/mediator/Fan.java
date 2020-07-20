package com.example.sahil.design_patterns.behavioural.mediator;

public class Fan {
    private Mediator mediator;
    private boolean isOn = false;

    public Fan() { this.mediator = new Mediator(this); }

    public Mediator getMediator(){ return this.mediator; }

    public void turnOn() {
        mediator.start();
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
        mediator.stop();
    }

    public boolean isOn() { return this.isOn; }
}
