package com.tapri.practice.chapter04;

/**
 * Chapter 4 practice stub: Dependency injection.
 *
 * Goal: Inject a PaymentGateway through the constructor. Do not construct the gateway inside the service.
 *
 * Implement the TODO method(s), then add tests in the chapter test source set.
 * The UnsupportedOperationException is intentional: this exercise is incomplete.
 */
public class CheckoutService {

    public String checkout(int amount) { throw new UnsupportedOperationException("TODO: delegate to the injected gateway"); }
}
