# Chapter 38: Project: the orders service

**By the end of this chapter:** apply the concept in Tapri Cloud and explain the design decision in an interview.

## Why you need this

This capstone combines REST design, validation, layered architecture, persistence and transactions into a working order-management service.

## Core concepts

Design the order aggregate, request and response DTOs, service use cases, repository queries, database constraints and error contract. Keep transaction boundaries around complete use cases.

## Tapri Cloud scenario

Build an API for customers to place orders, retrieve order details and list order history. Calculate totals on the server and persist order header and lines atomically.

## Build it — practical tasks

1. Create schema and entities; implement create-order validation; persist order and lines in one transaction; expose GET by ID and paginated history; add error handling; test repository, service and controller layers; document API examples.
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

**Where should the order total be calculated? In trusted server-side business logic, not accepted from the client as an authoritative value.**

## Stretch task

Review the feature as if it were going live: identify one failure mode, add a test or diagnostic for it, and document a mitigation.


## Practice stub

Implement the chapter exercise in [`OrderTotalCalculator.java`](src/main/java/com/tapri/practice/chapter38/OrderTotalCalculator.java). The starter method intentionally throws `UnsupportedOperationException` until you complete the TODO. Add tests under `src/test/java` and verify normal and edge-case behavior.
