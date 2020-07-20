package com.example.sahil.design_patterns.behavioural.strategy.discounter_example;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class EasterDiscounter implements Discounter {
    private  static final BigDecimal discountPercentage = BigDecimal.valueOf(7); //7% Discount

    @Override
    public BigDecimal apply(BigDecimal amount) {
        // can also do amount.multiply(0.1)
        return amount.multiply(discountPercentage).divide(BigDecimal.valueOf(100),RoundingMode.HALF_EVEN);

    }

}