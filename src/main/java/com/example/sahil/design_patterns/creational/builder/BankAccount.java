package com.example.sahil.design_patterns.creational.builder;

public class BankAccount {
    private String name;
    private String accountNumber;
    private String email;
    private boolean newsletter;

    //Note the Constructor is private so that's its available for inner/nested classes only.
    //The Constructor needs to have the inner class builder object as the parameter
    private BankAccount(BankAccountBuilder bankAccountBuilder) {
        this.name = bankAccountBuilder.name;
        this.accountNumber = bankAccountBuilder.accountNumber;
        this.email = bankAccountBuilder.email;
        this.newsletter = bankAccountBuilder.newsletter;
    }

    //static nested class
    public static class BankAccountBuilder {
        private String name;
        private String accountNumber;
        private String email = "NA";
        private boolean newsletter;

        //mandatory params go here
        public BankAccountBuilder(String name, String accountNumber) {
            this.name = name;
            this.accountNumber = accountNumber;
        }

        //optional params set using a setter that returns the Builder object.
        public BankAccountBuilder withEmail(String email) {
            this.email = email;
            return this;
        }

        //optional params set using a setter that returns the Builder object.
        public BankAccountBuilder addNewsletter(boolean newsletter) {
            this.newsletter = newsletter;
            return this;
        }

        //Accessing the outer class constructor and mapping values to it.
        public BankAccount build() {
            return new BankAccount(this);
        }
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "name='" + name + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", email='" + email + '\'' +
                ", newsletter=" + newsletter +
                '}';
    }
}