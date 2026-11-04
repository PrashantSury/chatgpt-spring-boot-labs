package com.tapri.practice.chapter31;

/**
 * Chapter 31 practice stub.
 * Goal: Map unauthenticated and forbidden access into distinct API errors.
 *
 * Complete each TODO and add tests in src/test/java.
 * UnsupportedOperationException is intentional until you implement the exercise.
 */
public class SecurityErrorMapper {

    public ApiError map(boolean authenticated, boolean permitted) { throw new UnsupportedOperationException("TODO: distinguish 401 from 403"); }
        public record ApiError(int status, String code) {}
}
