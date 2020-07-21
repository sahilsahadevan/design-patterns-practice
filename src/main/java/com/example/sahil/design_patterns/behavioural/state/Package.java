package com.example.sahil.design_patterns.behavioural.state;

public class Package {

    private PackageState state;

    public Package(){
        this.state = new NotStartedState();
    }

    public PackageState getState() {
        return state;
    }

    public void setState(PackageState state) {
        this.state = state;
    }

    public void previousState() {
        state.prev(this);
    }

    public void nextState() {
        state.next(this);
    }

    public void printStatus() {
        state.printStatus();
    }
}