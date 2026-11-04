package com.tapri.practice.chapter12;

/**
 * Chapter 12 practice stub: Input validation.
 *
 * Goal: Validate that an order has at least one line and every quantity is positive.
 *
 * Implement the TODO method(s), then add tests in the chapter test source set.
 * The UnsupportedOperationException is intentional: this exercise is incomplete.
 */
public class OrderValidator {

    public void validate(OrderRequest request) { throw new UnsupportedOperationException("TODO: reject empty order and non-positive quantities"); }
    
    public record OrderRequest(java.util.List<Integer> quantities) {}
}
