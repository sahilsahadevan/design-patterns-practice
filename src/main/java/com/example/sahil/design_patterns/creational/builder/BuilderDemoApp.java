package com.example.sahil.design_patterns.creational.builder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BuilderDemoApp {
    private static final Logger log = LoggerFactory.getLogger(BuilderDemoApp.class);

    public static void main(String[] args) {
        SpringApplication.run(BuilderDemoApp.class, args);
        BankAccount bankAccountWithEmailAndNewsletter1 =
                new BankAccount.BankAccountBuilder("Sahil Sahadevan", "11111")
                        .withEmail("sahil@gmail.com")
                        .addNewsletter(true)
                        .build();
        BankAccount bankAccountWithEmailAndNewsletter2 =
                new BankAccount.BankAccountBuilder("Sahil Sahadevan", "222222")
                        .addNewsletter(true)
                        .withEmail("sahil@gmail.com")
                        .build();
        BankAccount bankAccountWithEmailButWithoutNewsletter =
                new BankAccount.BankAccountBuilder("Sahil Sahadevan", "333333")
                .withEmail("sahil@gmail.com")
                .build();
        BankAccount bankAccountWithoutEmailButWithNewsLetter =
                new BankAccount.BankAccountBuilder("Sahil Sahadevan", "444444")
                        .addNewsletter(true)
                        .build();
        BankAccount bankAccountWithoutEmailOrNewsLetter =
                new BankAccount.BankAccountBuilder("Sahil Sahadevan", "555555")
                        .build();
        log.info("bankAccountWithEmailAndNewsletter1 details are {}", bankAccountWithEmailAndNewsletter1);
        log.info("bankAccountWithEmailAndNewsletter2 details are {}", bankAccountWithEmailAndNewsletter2);
        log.info("bankAccountWithEmailButWithoutNewsletter details are {}", bankAccountWithEmailButWithoutNewsletter);
        log.info("bankAccountWithoutEmailButWithNewsLetter details are {}", bankAccountWithoutEmailButWithNewsLetter);
        log.info("bankAccountWithoutEmailOrNewsLetter details are {}", bankAccountWithoutEmailOrNewsLetter);
    }
}