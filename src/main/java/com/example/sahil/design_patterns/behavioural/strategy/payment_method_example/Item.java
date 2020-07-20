package com.example.sahil.design_patterns.behavioural.strategy.payment_method_example;

public class Item {

    private String upcCode;
    private float price;

    public Item(String upcCode, float cost) {
        this.upcCode = upcCode;
        this.price = cost;
    }

    public String getUpcCode() {
        return upcCode;
    }

    public float getPrice() {
        return price;
    }

}