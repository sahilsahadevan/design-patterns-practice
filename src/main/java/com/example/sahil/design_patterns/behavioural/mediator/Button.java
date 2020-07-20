package com.example.sahil.design_patterns.behavioural.mediator;

public class Button {

    private final Mediator mediator;

    public Button(Mediator mediator){
        this.mediator = mediator;
    }

    public void press(){ mediator.press(); }
}