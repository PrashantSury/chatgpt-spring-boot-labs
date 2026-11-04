# Chapter 24: Spring Security basics

**By the end of this chapter:** apply the concept in Tapri Cloud and explain the design decision in an interview.

## Why you need this

Spring Security provides authentication, authorization and protection against common web threats through a configurable filter chain.

## Core concepts

Understand `SecurityFilterChain`, authentication versus authorization, `PasswordEncoder`, request matchers, CSRF and stateless versus session-based security. Never store plaintext passwords.

## Tapri Cloud scenario

Protect the Tapri Cloud admin endpoints while keeping menu browsing public. Configure a password encoder and explicit request authorization rules.

## Build it — practical tasks

1. Add the security starter; define public and protected paths; configure form/basic authentication only for a local learning profile; hash a password; test allowed and denied requests; inspect the filter chain.
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

**Authentication vs authorization? Authentication establishes who the caller is; authorization decides what that caller may do.**

## Stretch task

Add a production-style diagnostic: a metric, structured log, query-count assertion or security test that would help detect a regression.


## Practice stub

Implement the chapter exercise in [`SecurityPolicy.java`](src/main/java/com/tapri/practice/chapter24/SecurityPolicy.java). The starter method intentionally throws `UnsupportedOperationException` until you complete the TODO. Add tests under `src/test/java` and verify normal and edge-case behavior.
