package com.example.sahil.design_patterns.creational.abstract_factory.example1;

import com.example.sahil.design_patterns.creational.abstract_factory.example1.banks.Bank;
import com.example.sahil.design_patterns.creational.abstract_factory.example1.loans.BusinessLoan;
import com.example.sahil.design_patterns.creational.abstract_factory.example1.loans.EducationLoan;
import com.example.sahil.design_patterns.creational.abstract_factory.example1.loans.HomeLoan;
import com.example.sahil.design_patterns.creational.abstract_factory.example1.loans.Loan;

class LoanFactory extends AbstractFactory{
    public Bank getBank(String bank){
        return null;
    }

    public Loan getLoan(String loan){
        if(loan == null){
            return null;
        }
        if(loan.equalsIgnoreCase("Home")){
            return new HomeLoan();
        } else if(loan.equalsIgnoreCase("Business")){
            return new BusinessLoan();
        } else if(loan.equalsIgnoreCase("Education")){
            return new EducationLoan();
        }
        return null;
    }

}