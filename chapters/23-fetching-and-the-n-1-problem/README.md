# Chapter 23: Fetching and the N+1 problem

**By the end of this chapter:** apply the concept in Tapri Cloud and explain the design decision in an interview.

## Why you need this

The N+1 problem occurs when loading a collection triggers one query for the parent list and additional queries for each row's relationship.

## Core concepts

Inspect SQL logs; understand lazy/eager loading; use fetch joins, entity graphs, batch fetching and DTO projections deliberately. Avoid changing every association to eager as a blanket fix.

## Tapri Cloud scenario

An order-history endpoint loads 50 orders and then separately fetches each order's items. Replace the repeated queries with a targeted fetch strategy.

## Build it — practical tasks

1. Reproduce N+1; count SQL statements; fix it with an entity graph or DTO query; test pagination constraints with fetch joins; document expected query count.
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

**Why not mark every relationship eager? It can load unnecessary data, create huge joins and move performance problems to unrelated use cases.**

## Stretch task

Add a production-style diagnostic: a metric, structured log, query-count assertion or security test that would help detect a regression.


## Practice stub

Implement the chapter exercise in [`QueryCountBudget.java`](src/main/java/com/tapri/practice/chapter23/QueryCountBudget.java). The starter method intentionally throws `UnsupportedOperationException` until you complete the TODO. Add tests under `src/test/java` and verify normal and edge-case behavior.
