package com.example.sahil.design_patterns.behavioural.memento;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MementoDemoApp {
    private static final Logger log = LoggerFactory.getLogger(MementoDemoApp.class);

    public static void main(String[] args) {
        SpringApplication.run(MementoDemoApp.class, args);
        TextEditor textEditor = new TextEditor(new TextWindow());
        textEditor.write("The Memento Design Pattern: ");
        textEditor.write("How to implement it in Java? ");
        textEditor.hitSave();
        log.info("Initial Text: '{}'", textEditor.print());
        log.info("Updating with new text..");
        textEditor.write("Buy milk and eggs before coming home.");
        log.info("New text '{}'", textEditor.print());
        log.info("Undoing last update..");
        textEditor.hitUndo();
        log.info("Text after undo operation: '{}'", textEditor.print());
    }

}