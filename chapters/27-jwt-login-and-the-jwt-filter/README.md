# Chapter 27: JWT login and the JWT filter

**By the end of this chapter:** apply the concept in Tapri Cloud and explain the design decision in an interview.

## Why you need this

A JWT filter extracts a bearer token, validates it and places an authenticated principal into Spring Security's context for the current request.

## Core concepts

Use `Authorization: Bearer`; validate signature and standard claims; build an `Authentication`; set the security context; continue the filter chain. Handle missing, malformed, expired and invalid tokens safely.

## Tapri Cloud scenario

A manager calls `GET /admin/orders` with a bearer token. The filter authenticates the token before authorization rules decide whether the user can access the endpoint.

## Build it — practical tasks

1. Implement a login endpoint; issue a signed token; add a `OncePerRequestFilter`; validate claims; populate authorities; test missing, malformed, expired and tampered tokens; clear context correctly.
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

**Where should JWT validation happen? In the security filter chain before authorization, not duplicated inside every controller.**

## Stretch task

Add a production-style diagnostic: a metric, structured log, query-count assertion or security test that would help detect a regression.


## Practice stub

Implement the chapter exercise in [`BearerTokenParser.java`](src/main/java/com/tapri/practice/chapter27/BearerTokenParser.java). The starter method intentionally throws `UnsupportedOperationException` until you complete the TODO. Add tests under `src/test/java` and verify normal and edge-case behavior.
