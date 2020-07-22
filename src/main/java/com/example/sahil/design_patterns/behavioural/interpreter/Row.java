package com.example.sahil.design_patterns.behavioural.interpreter;

class Row {

    private final String name;
    private final String surname;

    Row(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return name + " " + surname;
    }
}