package com.example.sahil.design_patterns.behavioural.strategy.discounter_example;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ChristmasDiscounter implements Discounter {
    private static final BigDecimal discountPercentage = BigDecimal.TEN; //10% Discount

    @Override
    public BigDecimal apply(BigDecimal amount) {
        // can also do amount.multiply(0.1)
        return amount.multiply(discountPercentage).divide(BigDecimal.valueOf(100),RoundingMode.HALF_EVEN);
    }

}