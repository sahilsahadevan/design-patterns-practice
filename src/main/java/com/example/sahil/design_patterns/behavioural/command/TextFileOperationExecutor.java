package com.example.sahil.design_patterns.behavioural.command;

import java.util.ArrayList;
import java.util.List;

// The Invoker : It knows the command's interface and how to execute a given command
// but doesn't know how the command has been implemented.
public class TextFileOperationExecutor {
    @SuppressWarnings({"MismatchedQueryAndUpdateOfCollection"})
    private final List<TextFileOperation> textFileOperations = new ArrayList<>();
    
    public String executeOperation(TextFileOperation textFileOperation) {
        textFileOperations.add(textFileOperation);
        return textFileOperation.execute();
    }
}