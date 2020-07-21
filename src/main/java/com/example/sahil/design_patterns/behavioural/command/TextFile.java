package com.example.sahil.design_patterns.behavioural.command;

// The Receiver:  since this is performs the actual action needed
public class TextFile {
    
    private String name;
    
    public TextFile(String name){
        this.name = name;
    }

    public String open() {
        return "Opening file " + name;
    }

    public String read() {
        return "Reading file " + name;
    }

    public String write() {
        return "Writing to file " + name;
    }

    public String save() {
        return "Saving file " + name;
    }

    public String copy() {
        return "Copying file " + name;
    }

    public String paste() {
        return "Pasting file " + name;
    }
}