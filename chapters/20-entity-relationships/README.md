# Chapter 20: Entity relationships

**By the end of this chapter:** apply the concept in Tapri Cloud and explain the design decision in an interview.

## Why you need this

Entity relationships model associations between tables, but they also influence SQL, fetching, serialization and update behavior.

## Core concepts

Understand `@ManyToOne`, `@OneToMany`, `@OneToOne`, `@ManyToMany`, owning side and `mappedBy`. Prefer lazy loading for associations by default where appropriate; use helper methods to keep both sides synchronized.

## Tapri Cloud scenario

An Order has many OrderItems; each OrderItem refers to one MenuItem. Model the foreign key on the many-to-one side and decide whether the order owns its items.

## Build it — practical tasks

1. Map Order and OrderItem; set the owning side correctly; implement helper methods; persist and reload a graph; test foreign-key constraints; avoid serializing entity graphs directly.
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

**What is the owning side? The side that writes the relationship's foreign key or join-table mapping; updates to the inverse side alone may not persist the association.**

## Stretch task

Add a production-style diagnostic: a metric, structured log, query-count assertion or security test that would help detect a regression.


## Practice stub

Implement the chapter exercise in [`OrderAggregate.java`](src/main/java/com/tapri/practice/chapter20/OrderAggregate.java). The starter method intentionally throws `UnsupportedOperationException` until you complete the TODO. Add tests under `src/test/java` and verify normal and edge-case behavior.
