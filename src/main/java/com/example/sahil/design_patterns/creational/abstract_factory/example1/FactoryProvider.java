package com.example.sahil.design_patterns.creational.abstract_factory.example1;

class FactoryProvider {
    private FactoryProvider() {}

    public static AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("Bank")){
            return new BankFactory();
        } else if(choice.equalsIgnoreCase("Loan")){
            return new LoanFactory();
        }
        return null;
    }
}
