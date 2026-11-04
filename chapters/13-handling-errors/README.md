# Chapter 13: Handling errors

**By the end of this chapter:** apply the core idea in a small Tapri Cloud feature and explain the design choice in an interview.

## Why you need this

Consistent error handling gives clients predictable status codes and machine-readable error details without leaking stack traces or internal secrets.

## Core concepts

Use `@RestControllerAdvice` and `@ExceptionHandler`; map domain exceptions to HTTP status codes; handle validation and malformed JSON separately. Include a timestamp, status, error code, message and request path where appropriate.

## Tapri Cloud scenario

A missing menu item is a domain-level not-found condition; an invalid order is a client error; an unexpected database outage is a server-side failure. Log diagnostic details internally and return safe messages externally.

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

**Why use `@RestControllerAdvice`?** It centralizes exception-to-HTTP mapping across controllers and keeps endpoint methods focused on successful behavior.

## Stretch task

Add a test for a realistic edge case, then refactor one part to improve readability without changing behavior.
