# Chapter 25: Users from the database

**By the end of this chapter:** apply the concept in Tapri Cloud and explain the design decision in an interview.

## Why you need this

Production authentication usually loads users and their encoded passwords from a persistent user store rather than hard-coded in-memory accounts.

## Core concepts

Implement `UserDetailsService`; map database roles to authorities; encode passwords with `PasswordEncoder`; handle disabled or locked users; avoid exposing password hashes in API responses.

## Tapri Cloud scenario

Café managers sign in using accounts stored in the database. The authentication layer loads the account and checks the submitted password against its encoded form.

## Build it — practical tasks

1. Create User and Role entities; implement a repository-backed `UserDetailsService`; encode on registration; test valid, invalid, disabled and unknown users; ensure API DTOs omit password hashes.
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

**Why use a password encoder? It stores a one-way password hash and verifies submitted passwords without storing recoverable plaintext.**

## Stretch task

Add a production-style diagnostic: a metric, structured log, query-count assertion or security test that would help detect a regression.
