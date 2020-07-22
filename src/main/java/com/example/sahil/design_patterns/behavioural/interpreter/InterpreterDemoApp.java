package com.example.sahil.design_patterns.behavioural.interpreter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class InterpreterDemoApp {
    private static final Logger log = LoggerFactory.getLogger(InterpreterDemoApp.class);

    public static void main(String[] args) {
        SpringApplication.run(InterpreterDemoApp.class, args);

        Expression query = new Select("name", new From("people"));
        Context ctx = new Context();
        List<String> result = query.interpret(ctx);
        log.info("'SELECT NAME FROM PEOPLE' : {}", result);

        Expression query2 = new Select("*", new From("people"));
        List<String> result2 = query2.interpret(ctx);
        log.info("'SELECT * FROM PEOPLE' : {}", result2);

        Expression query3 =
                new Select("name",
                        new From("people",
                                new Where(name -> name.toLowerCase().startsWith("d"))));
        List<String> result3 = query3.interpret(ctx);
        log.info("'SELECT NAME FROM PEOPLE WHERE NAME like 'd%'' : {}", result3);
    }

}