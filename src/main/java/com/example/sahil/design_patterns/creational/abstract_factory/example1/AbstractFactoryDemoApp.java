package com.example.sahil.design_patterns.creational.abstract_factory.example1;

import com.example.sahil.design_patterns.creational.abstract_factory.example1.banks.Bank;
import com.example.sahil.design_patterns.creational.abstract_factory.example1.loans.Loan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class AbstractFactoryDemoApp implements CommandLineRunner {
    private final Logger log = LoggerFactory.getLogger(AbstractFactoryDemoApp.class);

    public static void main(String[] args) {
        SpringApplication.run(AbstractFactoryDemoApp.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        int years = 0;
        double loanAmount = 0.0D;
        double interestPercentRate = 0.0D;
        AbstractFactory abstractFactory;
        Scanner scanner = new Scanner(System.in);
        Bank bank = null;
        Loan loan = null;
        String bankName;
        String loanType;
        abstractFactory = FactoryProvider.getFactory("Bank");
        if (abstractFactory != null) {
            log.info("Enter Bank name -> ");
            bankName = scanner.next();
            bank = abstractFactory.getBank(bankName);
            log.info("Back Selected : {}", bank.getBankName());
        }
        abstractFactory = FactoryProvider.getFactory("Loan");
        if (abstractFactory != null) {
            log.info("Enter Loan Type -> ");
            loanType = scanner.next();
            loan = abstractFactory.getLoan(loanType);
            log.info("Loan Type selected : {}", loan.getLoanType());
        }

        if (bank != null && loan != null) {

            log.info("Enter LoanAmount for {} {} (format is double) -> ", bank.getBankName(), loan.getLoanType());
            loanAmount = scanner.nextDouble();
            log.info("LoanAmount is :{} ", loanAmount);

            log.info("Enter Interest Rate for {} {} (format is double) -> ", bank.getBankName(), loan.getLoanType());
            interestPercentRate = scanner.nextDouble();
            loan.setInterestRate(interestPercentRate);
            log.info("interestPercentRate is : {} ", interestPercentRate);

            log.info("Enter Number of Years you need to close the entire {} {} (format is integer) ->", bank.getBankName(), loan.getLoanType());
            years = scanner.nextInt();
            log.info("Number of Years required is : {} ", years);

            loan.calculateLoanPayment(loanAmount, years);
        } else {
            log.error("Invalid Bank or LoanType entered in factory");
        }
    }

}