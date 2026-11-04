# Chapter 14: Filters and interceptors

**By the end of this chapter:** apply the core idea in a small Tapri Cloud feature and explain the design choice in an interview.

## Why you need this

Filters and interceptors add cross-cutting request behavior, but they run at different points in the request lifecycle.

## Core concepts

Servlet filters wrap the servlet request/response and can run before Spring MVC. Handler interceptors run around mapped controller execution. Use filters for correlation IDs and security-chain concerns; use interceptors for handler-aware timing or metadata. Always clean up thread-local state.

## Tapri Cloud scenario

Attach a request ID to every Tapri Cloud request, include it in logs and return it in a response header. Do not use an interceptor as a replacement for Spring Security.

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

**Filter vs interceptor?** A filter belongs to the servlet chain and wraps the servlet; an interceptor is part of Spring MVC and can work with handler metadata.

## Stretch task

Add a test for a realistic edge case, then refactor one part to improve readability without changing behavior.


## Practice stub

Implement the chapter exercise in [`RequestIdPolicy.java`](src/main/java/com/tapri/practice/chapter14/RequestIdPolicy.java). The starter method intentionally throws `UnsupportedOperationException` until you complete the TODO. Add tests under `src/test/java` and verify normal and edge-case behavior.
