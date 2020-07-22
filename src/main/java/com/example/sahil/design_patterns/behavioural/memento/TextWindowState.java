package com.example.sahil.design_patterns.behavioural.memento;


// Memento Class
// A simple POJO DS with a constructor to accept recent updated text and getter to return saved text
public class TextWindowState {
 
    private String text;

    //Note : we use String instead of StringBuilder to overwrite current with latest update rather than append it
    public TextWindowState(String text) {
        this.text = text;
    }
 
    public String getText() {
        return text;
    }
}