package com.example.sahil.design_patterns.structural.proxy.virtual_proxy;

public class ExpensiveObjectProxy implements ExpensiveObject {
    private ExpensiveObject object;

    @Override
    public void process() {
        if (object == null) {
            object = new ExpensiveObjectImpl();
        }
        object.process();
    }
}