package com.example.sahil.design_patterns.creational.prototype;

public class PlasticTree extends Tree {
    private String name;

    public PlasticTree(double mass, double height) {
        super(mass, height);
        this.name = "PlasticTree";
    }

    @Override
    public Tree copy() {
        PlasticTree plasticTreeClone = new PlasticTree(this.getMass(), this.getHeight());
        plasticTreeClone.setPosition(this.getPosition());
        return plasticTreeClone;
    }


    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return  "PlasticTree@"+this.hashCode()+"{" +
                "name='" + name + '\'' +
                "} " + super.toString();
    }
}