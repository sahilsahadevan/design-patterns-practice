package com.example.sahil.design_patterns.behavioural.strategy.discounter_example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;

@SpringBootApplication
public class DiscounterStrategyDemoApp {
private static final Logger log = LoggerFactory.getLogger(DiscounterStrategyDemoApp.class);
    public static void main(String[] args) {
        SpringApplication.run(DiscounterStrategyDemoApp.class, args);
        BigDecimal purchaseCost = BigDecimal.valueOf(150.25);
        Discounter christmasDiscounter = new ChristmasDiscounter();
        Discounter easterDiscounter = new EasterDiscounter();


        //using Lambda s below is equivalent of using an anonymous inner class
        // Reference and explanation -> https://www.baeldung.com/java-strategy-pattern
        Discounter specialCustomerDiscount = amount -> amount.multiply(BigDecimal.valueOf(0.05));   // customized 5% discount
        Discounter specialMilitaryDiscount = amount -> amount.multiply(BigDecimal.valueOf(0.25));   //customized 25% discount

        log.info("Discount for Christmas -> {}, Final Price after Discount -> {} ",
                christmasDiscounter.apply(purchaseCost), purchaseCost.subtract(christmasDiscounter.apply(purchaseCost)));
        log.info("Discount for Easter -> {}, Final Price after Discount -> {} ",
                easterDiscounter.apply(purchaseCost), purchaseCost.subtract(easterDiscounter.apply(purchaseCost)));
        log.info("Discount for Special Customers -> {}, Final Price after Discount -> {} ",
                specialCustomerDiscount.apply(purchaseCost), purchaseCost.subtract(specialCustomerDiscount.apply(purchaseCost)));
        log.info("Discount for Military -> {} + {} = {}, Final Price after Discount -> {} ",
                specialMilitaryDiscount.apply(purchaseCost), specialCustomerDiscount.apply(purchaseCost),
                specialMilitaryDiscount.combine(specialCustomerDiscount).apply(purchaseCost),
                purchaseCost.subtract(specialMilitaryDiscount.combine(specialCustomerDiscount).apply(purchaseCost)));


    }

}