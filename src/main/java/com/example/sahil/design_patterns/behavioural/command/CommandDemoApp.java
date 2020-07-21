package com.example.sahil.design_patterns.behavioural.command;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// The Main class here is the Client in the Command Pattern as it controls the command execution process
@SpringBootApplication
public class CommandDemoApp {
    private static final Logger log = LoggerFactory.getLogger(CommandDemoApp.class);

    public static void main(String[] args) {
        SpringApplication.run(CommandDemoApp.class, args);
        TextFileOperationExecutor textFileOperationExecutor = new TextFileOperationExecutor();
        // Traditional way
        log.info("{}",
                textFileOperationExecutor.executeOperation(new OpenTextFileOperation(new TextFile("File1.txt"))));
        log.info("{}",
                textFileOperationExecutor.executeOperation(new SaveTextFileOperation(new TextFile("File1.txt"))));

        // using method references
        TextFile textFile = new TextFile("File2.txt");
        log.info("{}", textFileOperationExecutor.executeOperation(textFile::open));
        log.info("{}", textFileOperationExecutor.executeOperation(textFile::save));


    }


}