package com.example.sahil.design_patterns.structural.decorator;

public abstract class TreeDecorator implements ChristmasTree {
    private ChristmasTree tree;

    public TreeDecorator(ChristmasTree tree){
        this.tree = tree;    //injecting tree Impl
    }

    @Override
    public String decorate() {
        return tree.decorate();  //printing the impl
    }
}