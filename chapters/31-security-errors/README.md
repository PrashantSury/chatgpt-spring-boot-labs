# Chapter 31: Security errors

**By the end of this chapter:** apply the concept in Tapri Cloud and explain the design decision in an interview.

## Why you need this

Security failures happen before controller execution in many cases, so they need dedicated authentication and access-denied handlers.

## Core concepts

Use `AuthenticationEntryPoint` for unauthenticated access and `AccessDeniedHandler` for authenticated callers lacking permission. Return consistent JSON and avoid leaking token-validation details.

## Tapri Cloud scenario

An expired or missing token should produce a 401 response; a valid customer token calling an admin endpoint should produce 403. Keep the error contract consistent with other APIs.

## Build it — practical tasks

1. Implement JSON entry-point and access-denied handlers; distinguish 401 and 403; test expired, malformed and insufficient-role requests; ensure no stack trace or token value is returned.
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

**401 vs 403? 401 means valid authentication is absent; 403 means the caller is authenticated but not permitted.**

## Stretch task

Add a production-style diagnostic: a metric, structured log, query-count assertion or security test that would help detect a regression.
