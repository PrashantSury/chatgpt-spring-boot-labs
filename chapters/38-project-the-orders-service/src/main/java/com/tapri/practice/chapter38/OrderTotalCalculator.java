package com.tapri.practice.chapter38;

/**
 * Chapter 38 practice stub.
 * Goal: Calculate an order total server-side with validated quantities.
 *
 * Complete each TODO and add tests in src/test/java.
 * UnsupportedOperationException is intentional until you implement the exercise.
 */
public class OrderTotalCalculator {

    public long calculate(java.util.List<Line> lines) { throw new UnsupportedOperationException("TODO: validate lines and calculate total safely"); }
        public record Line(int unitPricePaise, int quantity) {}
}
