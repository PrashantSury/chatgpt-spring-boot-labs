# Chapter 10: Layers and DTOs

**By the end of this chapter:** apply the core idea in a small Tapri Cloud feature and explain the design choice in an interview.

## Why you need this

Layering separates HTTP concerns, business rules and persistence. DTOs define the API contract and prevent database entities from leaking directly to clients.

## Core concepts

A controller handles HTTP mapping; a service owns use-case orchestration and business rules; a repository handles persistence. Map request/response DTOs explicitly. Keep entities internal to the data layer.

## Tapri Cloud scenario

An order response should expose order number, item summaries and total, not lazy JPA proxies or internal audit columns. Validate the request DTO before invoking the service.

## Build it — practical tasks

1. Implement the smallest working example of the chapter concept in a focused package.
2. Integrate it into the Tapri Cloud menu or order use case without mixing unrelated responsibilities.
3. Add tests for the successful path and at least two failure or edge cases.
4. Add useful logging or diagnostics without exposing secrets or personal data.
5. Write a short note explaining the trade-off you made and one alternative.

## Acceptance checklist

- [ ] The feature works for the stated scenario.
- [ ] Responsibilities are separated and names express intent.
- [ ] Success and failure cases are covered by tests.
- [ ] HTTP or application behavior is documented with an example.
- [ ] You can explain the implementation without reading the code.

## Interview check

**Why not return JPA entities from controllers?** It couples the API to persistence, risks exposing fields and can trigger lazy-loading or serialization problems.

## Stretch task

Add a test for a realistic edge case, then refactor one part to improve readability without changing behavior.


## Practice stub

Implement the chapter exercise in [`OrderMapper.java`](src/main/java/com/tapri/practice/chapter10/OrderMapper.java). The starter method intentionally throws `UnsupportedOperationException` until you complete the TODO. Add tests under `src/test/java` and verify normal and edge-case behavior.
