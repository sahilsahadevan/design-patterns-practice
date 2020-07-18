package com.example.sahil.design_patterns.creational.abstract_factory.example1.loans;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class Loan {
    private final Logger log = LoggerFactory.getLogger(Loan.class);
    protected double rate;
    public abstract void setInterestRate(double rate);

    public abstract String getLoanType();

    public void calculateLoanPayment(double loanAmount, int years) {
        /*
              rate = annual interest rate/12*100, n = number of monthly installments (EMI), 1 year = 12 months.
              Therefore EMI is n = years*12
            */

        double emi;
        int n;
        n = years * 12;
        rate = rate / 1200;
        //emi = (P * r * (1+r)^n) / ((1+r)^n - 1)
        emi = ((rate * Math.pow((1 + rate), n)) / ((Math.pow((1 + rate), n)) - 1)) * loanAmount;
        log.info("Your monthly EMI is {} for the amount {} you have borrowed", emi, loanAmount);
    }
}
