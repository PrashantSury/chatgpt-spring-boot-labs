# Chapter 39: Project: secure ordering

**By the end of this chapter:** apply the concept in Tapri Cloud and explain the design decision in an interview.

## Why you need this

This capstone adds authentication and authorization to the orders service, including customer ownership and manager operations.

## Core concepts

Integrate database-backed users, password hashing, JWT access tokens, refresh-token lifecycle, role checks and object-level authorization. Security must be enforced at both request and service boundaries.

## Tapri Cloud scenario

Customers can view only their own orders. Managers can view orders for their café. Administrators can manage accounts. Token expiry and logout must have defined behavior.

## Build it — practical tasks

1. Add registration and login; hash passwords; issue and validate access tokens; rotate refresh tokens; protect endpoints; enforce order ownership; implement consistent 401/403 responses; write security integration tests; document threat assumptions.
2. Add automated tests for success, failure and at least one concurrency or boundary condition where relevant.
3. Capture useful evidence: HTTP response, SQL statement count, metric, log entry or test assertion.
4. Write down the main trade-off and what you would monitor in production.

## Acceptance checklist

- [ ] The stated scenario works end to end.
- [ ] Error paths and edge cases are covered.
- [ ] Tests verify behavior, not implementation details.
- [ ] Operational or security concerns are documented.
- [ ] You can explain the design and its limitations aloud.

## Interview check

**Why is checking only the role insufficient? A customer role does not prove ownership of a particular order; object-level authorization must verify the resource belongs to that user.**

## Stretch task

Review the feature as if it were going live: identify one failure mode, add a test or diagnostic for it, and document a mitigation.


## Practice stub

Implement the chapter exercise in [`OrderAccessPolicy.java`](src/main/java/com/tapri/practice/chapter39/OrderAccessPolicy.java). The starter method intentionally throws `UnsupportedOperationException` until you complete the TODO. Add tests under `src/test/java` and verify normal and edge-case behavior.
