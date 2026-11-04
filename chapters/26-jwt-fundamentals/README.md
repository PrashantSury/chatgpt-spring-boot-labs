# Chapter 26: JWT fundamentals

**By the end of this chapter:** apply the concept in Tapri Cloud and explain the design decision in an interview.

## Why you need this

A JSON Web Token is a signed token carrying claims. It can let a stateless API validate caller identity without looking up a server-side session for every request.

## Core concepts

Understand header, payload and signature; issuer, subject, audience, issued-at and expiry claims; signing versus encryption; algorithm selection; key rotation and token leakage risks. A signed JWT is not encrypted by default.

## Tapri Cloud scenario

After successful login, Tapri Cloud issues a short-lived access token. APIs validate signature and claims before trusting its subject and authorities.

## Build it — practical tasks

1. Decode a sample token; identify claims; verify signature and expiry; reject wrong issuer and audience; explain why sensitive data must not be placed in a readable payload.
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

**Is a JWT encrypted? Usually no: a signed JWT protects integrity, but its payload is base64url-encoded and readable.**

## Stretch task

Add a production-style diagnostic: a metric, structured log, query-count assertion or security test that would help detect a regression.


## Practice stub

Implement the chapter exercise in [`JwtClaimsPolicy.java`](src/main/java/com/tapri/practice/chapter26/JwtClaimsPolicy.java). The starter method intentionally throws `UnsupportedOperationException` until you complete the TODO. Add tests under `src/test/java` and verify normal and edge-case behavior.
