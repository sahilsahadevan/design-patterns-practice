package com.example.sahil.design_patterns.behavioural.memento;

// Originator
public class TextWindow {
 
    private StringBuilder currentText;
 
    public TextWindow() {
        this.currentText = new StringBuilder();
    }
 
    public void addText(String text) {
        currentText.append(text);
    }

    public String getCurrentText() { return currentText.toString(); }

    // Save updates the current state by creating a new TextWindowState everytime to avoid duplicate saving.
    // This can be optimized using static returns but be very careful to clear existing state and overwrite it
    // instead of appending it
    public TextWindowState save() {
        return new TextWindowState(currentText.toString());
    }

    // The undo call
    public void restore(TextWindowState save) {
        currentText = new StringBuilder(save.getText());
    }
}