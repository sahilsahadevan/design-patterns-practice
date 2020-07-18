package com.example.sahil.design_patterns.creational.abstract_factory.example1;

import com.example.sahil.design_patterns.creational.abstract_factory.example1.banks.Bank;
import com.example.sahil.design_patterns.creational.abstract_factory.example1.banks.HDFC;
import com.example.sahil.design_patterns.creational.abstract_factory.example1.banks.ICICI;
import com.example.sahil.design_patterns.creational.abstract_factory.example1.banks.SBI;
import com.example.sahil.design_patterns.creational.abstract_factory.example1.loans.Loan;

class BankFactory extends AbstractFactory{
    public Bank getBank(String bank){
        if(bank == null){
            return null;
        }
        if(bank.equalsIgnoreCase("HDFC")){
            return new HDFC();
        } else if(bank.equalsIgnoreCase("ICICI")){
            return new ICICI();
        } else if(bank.equalsIgnoreCase("SBI")){
            return new SBI();
        }
        return null;
    }
    public Loan getLoan(String loan) {
        return null;
    }
}
