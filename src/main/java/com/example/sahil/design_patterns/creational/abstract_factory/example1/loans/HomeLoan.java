package com.example.sahil.design_patterns.creational.abstract_factory.example1.loans;

public class HomeLoan extends Loan {
    private final String LOAN_TYPE = "HomeLoan";

    @Override
    public String getLoanType(){ return LOAN_TYPE; }

    @Override
    public void setInterestRate(double r) {
        rate = r;
    }
}
