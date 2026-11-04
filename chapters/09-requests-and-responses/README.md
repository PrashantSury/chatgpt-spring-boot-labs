# Chapter 9: Requests and responses

**By the end of this chapter:** apply the core idea in a small Tapri Cloud feature and explain the design choice in an interview.

## Why you need this

An HTTP endpoint is a contract: method, path, headers, query parameters, request body, status code and response representation.

## Core concepts

Use `@GetMapping`, `@PostMapping`, `@PutMapping`, `@PatchMapping` and `@DeleteMapping`; bind JSON with `@RequestBody`; use `ResponseEntity` when status or headers vary. Choose status codes that reflect the operation.

## Tapri Cloud scenario

Build menu read and order creation endpoints. Return `201 Created` and a `Location` header after creating an order; return `204 No Content` after a successful deletion where appropriate.

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

**When should an API return 201 rather than 200?** When a request successfully creates a resource; include its location when practical.

## Stretch task

Add a test for a realistic edge case, then refactor one part to improve readability without changing behavior.


## Practice stub

Implement the chapter exercise in [`OrderEndpoint.java`](src/main/java/com/tapri/practice/chapter09/OrderEndpoint.java). The starter method intentionally throws `UnsupportedOperationException` until you complete the TODO. Add tests under `src/test/java` and verify normal and edge-case behavior.
