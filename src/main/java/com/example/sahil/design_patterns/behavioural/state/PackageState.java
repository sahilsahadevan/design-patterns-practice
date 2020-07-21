package com.example.sahil.design_patterns.behavioural.state;

public interface PackageState {
 
    void next(Package pkg);
    void prev(Package pkg);
    void printStatus();

}