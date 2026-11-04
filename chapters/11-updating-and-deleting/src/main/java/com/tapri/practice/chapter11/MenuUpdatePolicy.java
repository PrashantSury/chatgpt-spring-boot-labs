package com.tapri.practice.chapter11;

/**
 * Chapter 11 practice stub: Updating and deleting.
 *
 * Goal: Apply a partial menu-item update while preserving fields omitted by the request.
 *
 * Implement the TODO method(s), then add tests in the chapter test source set.
 * The UnsupportedOperationException is intentional: this exercise is incomplete.
 */
public class MenuUpdatePolicy {

    public MenuItem apply(MenuItem current, MenuPatch patch) { throw new UnsupportedOperationException("TODO: apply only supplied changes"); }
    
    public record MenuItem(String name, int price, boolean available) {}
    public record MenuPatch(String name, Integer price, Boolean available) {}
}
