package com.example.sahil.design_patterns.behavioural.mediator;

public class Mediator {
    private final Button button;
    private final Fan fan;
    private final PowerSupplier powerSupplier;

   public Mediator(Fan fan){
       this.fan = fan;
       this.powerSupplier = new PowerSupplier();
       this.button = new Button(this);
   }

    public void press() {
        if (fan.isOn()) {
            fan.turnOff();
        } else {
            fan.turnOn();
        }
    }

    public void start() {
        powerSupplier.turnOn();
    }

    public void stop() {
        powerSupplier.turnOff();
    }
}