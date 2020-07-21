package com.example.sahil.design_patterns.behavioural.command;

// The Command Implementation to save a TextFile
// The Command calls the receiver to perform any action it needs
public class SaveTextFileOperation implements TextFileOperation {

    private final TextFile textFile;

    public SaveTextFileOperation(TextFile textFile){
        this.textFile = textFile;
    }

    @Override
    public String execute() {
        return textFile.save();
    }
}