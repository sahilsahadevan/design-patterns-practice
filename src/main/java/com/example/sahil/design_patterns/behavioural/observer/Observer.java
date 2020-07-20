package com.example.sahil.design_patterns.behavioural.observer;

// There's a predefined Observer interface in java.util core libraries, which makes implementing the observer pattern simpler.
public interface Observer {
    //method to update the observer, used by subject
    void update();
    //attach with subject to observe
    void setSubject(Observable sub);

}
