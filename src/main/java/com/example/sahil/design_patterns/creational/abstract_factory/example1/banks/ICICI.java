package com.example.sahil.design_patterns.creational.abstract_factory.example1.banks;

public class ICICI implements Bank {

    private final String BNAME;

    public ICICI() {
        BNAME = "ICICI BANK";
    }

    public String getBankName() {
        return BNAME;
    }
}