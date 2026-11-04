package com.tapri.practice.chapter10;

/**
 * Chapter 10 practice stub: Layers and DTOs.
 *
 * Goal: Map a persistence-shaped order into an API response DTO without exposing internal fields.
 *
 * Implement the TODO method(s), then add tests in the chapter test source set.
 * The UnsupportedOperationException is intentional: this exercise is incomplete.
 */
public class OrderMapper {

    public OrderResponse toResponse(OrderEntity entity) { throw new UnsupportedOperationException("TODO: map entity to DTO"); }
    
    public record OrderEntity(long id, String customerEmail, int totalPaise, String internalNote) {}
    public record OrderResponse(long id, int totalPaise) {}
}
