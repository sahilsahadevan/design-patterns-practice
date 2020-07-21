package com.example.sahil.design_patterns.behavioural.command;

// The Command Implementation to Open a TextFile
// The Command calls the receiver to perform any action it needs
public class OpenTextFileOperation implements TextFileOperation {
 
    private final TextFile textFile;

    public OpenTextFileOperation(TextFile textFile){
        this.textFile = textFile;
    }
    
    @Override
    public String execute() {
        return textFile.open();
    }
}