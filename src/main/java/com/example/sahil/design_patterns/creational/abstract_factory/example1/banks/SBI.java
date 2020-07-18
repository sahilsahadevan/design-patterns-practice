package com.example.sahil.design_patterns.creational.abstract_factory.example1.banks;

public class SBI implements Bank {

    private final String BNAME;

    public SBI() {
        BNAME = "SBI BANK";
    }

    public String getBankName() {
        return BNAME;
    }
}
