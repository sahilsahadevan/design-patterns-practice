package com.example.sahil.design_patterns.creational.abstract_factory.example1.banks;

public class HDFC implements Bank {

    private final String BNAME;

    public HDFC() {
        BNAME = "HDFC BANK";
    }

    public String getBankName() {
        return BNAME;
    }
}
