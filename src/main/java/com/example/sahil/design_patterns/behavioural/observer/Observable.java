package com.example.sahil.design_patterns.behavioural.observer;

/*
    There's a predefined Observable interface in java.util core libraries, However its been deprecated in Java9.
    One of its cons is that Observable isn't an interface but a class, that's why subclasses can't be used as observables.
    Also, a developer could override some of the Observable‘s synchronized methods and disrupt their thread-safety.
    You can use the java.beans.PropertyChangeListener interface instead , which is recommended instead of using Observer.

    To see PropertyChangeListener implementation as an observable -> https://www.baeldung.com/java-observer-pattern
 */
// which makes implementing the observer pattern simpler.
public interface Observable {

    //methods to register and unregister observers
    void register(Observer obj);
    void unregister(Observer obj);

    //method to notify observers of change
    void notifyObservers();

    //method to get updates from subject
    Object getUpdate(Observer obj);

}
