package com.tapri.practice.chapter13;

/**
 * Chapter 13 practice stub: Error handling.
 *
 * Goal: Map domain failures to stable HTTP status and error codes without exposing stack traces.
 *
 * Implement the TODO method(s), then add tests in the chapter test source set.
 * The UnsupportedOperationException is intentional: this exercise is incomplete.
 */
public class ApiErrorMapper {

    public ApiError map(RuntimeException error) { throw new UnsupportedOperationException("TODO: map not-found, invalid-request and unexpected failures"); }
    
    public record ApiError(int status, String code, String message) {}
}
