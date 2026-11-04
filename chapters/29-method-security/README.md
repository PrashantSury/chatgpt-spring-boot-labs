# Chapter 29: Method security

**By the end of this chapter:** apply the concept in Tapri Cloud and explain the design decision in an interview.

## Why you need this

Method security protects service operations even when they are called from different controllers, scheduled jobs or other beans.

## Core concepts

Enable method security and use `@PreAuthorize`, `@PostAuthorize` or filtering annotations where appropriate. Remember proxy-based invocation limitations and avoid self-invocation assumptions.

## Tapri Cloud scenario

Only a manager assigned to a café can change that café's menu. Enforce the rule at the service boundary so alternate entry points cannot bypass it.

## Build it — practical tasks

1. Enable method security; protect a service method; pass principal identity into an ownership check; test allowed and denied callers; demonstrate that self-invocation does not cross the proxy.
2. Add focused unit or integration tests for the happy path and at least two failure or edge cases.
3. Inspect the generated SQL, HTTP response or runtime behavior relevant to this chapter.
4. Document the assumptions and one alternative approach.

## Acceptance checklist

- [ ] The scenario works end to end.
- [ ] Inputs and failure cases are handled deliberately.
- [ ] Tests demonstrate expected behavior.
- [ ] No secrets or sensitive values are logged or returned.
- [ ] You can explain the trade-off and operational impact.

## Interview check

**Why add method security if URL security already exists? It protects business operations at the service boundary regardless of which entry point invokes them.**

## Stretch task

Add a production-style diagnostic: a metric, structured log, query-count assertion or security test that would help detect a regression.


## Practice stub

Implement the chapter exercise in [`OrderOwnershipPolicy.java`](src/main/java/com/tapri/practice/chapter29/OrderOwnershipPolicy.java). The starter method intentionally throws `UnsupportedOperationException` until you complete the TODO. Add tests under `src/test/java` and verify normal and edge-case behavior.
