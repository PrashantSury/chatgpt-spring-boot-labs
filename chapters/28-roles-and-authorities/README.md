# Chapter 28: Roles and authorities

**By the end of this chapter:** apply the concept in Tapri Cloud and explain the design decision in an interview.

## Why you need this

Authorization rules use authorities to decide which operations an authenticated principal may perform. Roles are commonly represented as authorities with a `ROLE_` prefix.

## Core concepts

Distinguish `hasRole` from `hasAuthority`; model least privilege; map database roles to granted authorities; avoid trusting role values supplied by a client.

## Tapri Cloud scenario

A CUSTOMER can create and view their own orders; a CAFE_MANAGER can update menu items; an ADMIN can manage users. Each route must enforce the correct permission.

## Build it — practical tasks

1. Define role constants; map roles from database users; configure request matchers; test each role against each endpoint; ensure ownership checks are separate from broad role checks.
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

**Role vs authority? A role is a conventional authority name, typically prefixed with `ROLE_`; authorities are the actual permissions checked by Spring Security.**

## Stretch task

Add a production-style diagnostic: a metric, structured log, query-count assertion or security test that would help detect a regression.
