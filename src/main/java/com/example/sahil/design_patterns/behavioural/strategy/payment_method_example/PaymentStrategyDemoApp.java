package com.example.sahil.design_patterns.behavioural.strategy.payment_method_example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PaymentStrategyDemoApp {

    public static void main(String[] args) {
        SpringApplication.run(PaymentStrategyDemoApp.class, args);
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(new Item("1",20.5f));
        cart.addItem(new Item("1",20.5f));
        cart.addItem(new Item("34",6.99f));
        cart.addItem(new Item("156",10.99f));
        cart.addItem(new Item("24",19.99f));
        cart.pay(new CreditCard("Sagil Sahadevan", "10012456787659878","123", "01/22"));
        cart.pay(new Paypal("Sagil@gmail.com", "abc@123"));

    }

}