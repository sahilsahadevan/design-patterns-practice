package com.example.sahil.design_patterns.structural.composite;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CompositeDemoApp {

    public static void main(String[] args) {
        SpringApplication.run(CompositeDemoApp.class, args);

        Department regionalFinancialDepartment = new RegionalFinancialDepartment(3);
        Department regionalSalesDepartment = new RegionalSalesDepartment(3);
        //Notice how composite Declarations is using concrete class instead of interface. This is to use addDepartment that is not part of the interface
        CorporateDepartment corporateDepartment = new CorporateDepartment(1);
        CorporateFinancialDepartment corporateFinancialDepartment = new CorporateFinancialDepartment(2);
        CorporateSalesDepartment corporateSalesDepartment = new CorporateSalesDepartment(2);
        corporateFinancialDepartment.addDepartment(regionalFinancialDepartment);
        corporateSalesDepartment.addDepartment(regionalSalesDepartment);
        corporateDepartment.addDepartment(corporateFinancialDepartment);
        corporateDepartment.addDepartment(corporateSalesDepartment);
        corporateDepartment.printDepartmentName();

    }

}