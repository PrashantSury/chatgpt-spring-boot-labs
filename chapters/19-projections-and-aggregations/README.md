# Chapter 19: Projections and aggregations

**By the end of this chapter:** apply the concept in Tapri Cloud and explain the design decision in an interview.

## Why you need this

Projections retrieve only the fields a use case needs. Aggregations let the database compute counts, sums and grouped results efficiently.

## Core concepts

Use interface or DTO projections and JPQL/SQL aggregate functions such as `COUNT`, `SUM`, `AVG` and `GROUP BY`. Check query plans and avoid loading full entity graphs for summary screens.

## Tapri Cloud scenario

A merchant dashboard needs daily order count and revenue by status. Return compact summary DTOs rather than every Order entity.

## Build it — practical tasks

1. Create a menu summary projection; write a grouped order revenue query; map results to a DTO; test empty groups and numeric precision; compare projection SQL with loading full entities.
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

**Why use projections? They reduce transferred columns and avoid materializing entities when the use case only needs a view of data.**

## Stretch task

Add a production-style diagnostic: a metric, structured log, query-count assertion or security test that would help detect a regression.


## Practice stub

Implement the chapter exercise in [`OrderSummary.java`](src/main/java/com/tapri/practice/chapter19/OrderSummary.java). The starter method intentionally throws `UnsupportedOperationException` until you complete the TODO. Add tests under `src/test/java` and verify normal and edge-case behavior.
