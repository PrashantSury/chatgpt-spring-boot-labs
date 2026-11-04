package com.tapri.practice.chapter18;

/**
 * Chapter 18 practice stub: Pagination and sorting.
 *
 * Goal: Validate page number and size and constrain sort fields to an allowlist.
 *
 * Implement the TODO method(s), then add tests in the chapter test source set.
 * The UnsupportedOperationException is intentional: this exercise is incomplete.
 */
public class PageRequestPolicy {

    public PageWindow normalize(int page, int size, String sortBy) { throw new UnsupportedOperationException("TODO: validate page, clamp size and whitelist sort field"); }
    
    public record PageWindow(int page, int size, String sortBy) {}
}
