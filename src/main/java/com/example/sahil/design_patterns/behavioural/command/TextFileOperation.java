package com.example.sahil.design_patterns.behavioural.command;

// The Command: Its implementations will store all info for execution an action
@FunctionalInterface
public interface TextFileOperation {
    String execute();
}