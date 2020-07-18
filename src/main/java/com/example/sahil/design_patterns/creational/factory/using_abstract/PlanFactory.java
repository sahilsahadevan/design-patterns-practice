package com.example.sahil.design_patterns.creational.factory.using_abstract;

import org.springframework.util.StringUtils;

public class PlanFactory {

    public Plan getInstance(String planType) {
        if (StringUtils.isEmpty(planType)) {
            return null;
        }
        if ("COMMERCIAL".equalsIgnoreCase(planType)) {
            return new CommercialPlan();
        }
        if ("DOMESTIC".equalsIgnoreCase(planType)) {
            return new DomesticPlan();
        }
        if ("INSTITUTIONAL".equalsIgnoreCase(planType)) {
            return new InstitutionalPlan();
        }
        return null;
    }
}
