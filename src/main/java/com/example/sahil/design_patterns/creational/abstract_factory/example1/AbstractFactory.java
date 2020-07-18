package com.example.sahil.design_patterns.creational.abstract_factory.example1;

import com.example.sahil.design_patterns.creational.abstract_factory.example1.banks.Bank;
import com.example.sahil.design_patterns.creational.abstract_factory.example1.loans.Loan;

abstract class AbstractFactory{
    abstract Bank getBank(String bank);
    abstract Loan getLoan(String loan);
}