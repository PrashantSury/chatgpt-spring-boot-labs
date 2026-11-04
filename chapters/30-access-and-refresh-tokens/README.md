# Chapter 30: Access and refresh tokens

**By the end of this chapter:** apply the concept in Tapri Cloud and explain the design decision in an interview.

## Why you need this

Short-lived access tokens limit exposure; refresh tokens allow a user to obtain a new access token without signing in repeatedly.

## Core concepts

Understand token lifetimes, refresh rotation, revocation, reuse detection and secure storage. Store refresh-token state or identifiers securely when revocation is required; never log tokens.

## Tapri Cloud scenario

A café manager uses a short-lived access token and a longer-lived refresh token. On refresh, rotate the refresh token and invalidate the previous one.

## Build it — practical tasks

1. Implement refresh endpoint; persist a hashed refresh-token identifier with expiry; rotate on use; reject reused and expired tokens; implement logout/revocation; test concurrent refresh behavior.
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

**Why rotate refresh tokens? It limits the usefulness of a stolen token and helps detect replay when an already-used token appears again.**

## Stretch task

Add a production-style diagnostic: a metric, structured log, query-count assertion or security test that would help detect a regression.
