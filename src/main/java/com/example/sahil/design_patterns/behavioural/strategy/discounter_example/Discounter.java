package com.example.sahil.design_patterns.behavioural.strategy.discounter_example;

import java.math.BigDecimal;
import java.util.function.UnaryOperator;

// Reference and explanation -> https://www.baeldung.com/java-strategy-pattern
public interface Discounter extends UnaryOperator<BigDecimal> {

    default Discounter combine(Discounter after) {
        return value -> this.apply(value).add(after.apply(value));
    }

    static Discounter christmas() {
        return (amount) -> amount.multiply(BigDecimal.valueOf(0.9));
    }

    static Discounter newYear() {
        return (amount) -> amount.multiply(BigDecimal.valueOf(0.8));
    }

    static Discounter easter() {
        return (amount) -> amount.multiply(BigDecimal.valueOf(0.5));
    }


}