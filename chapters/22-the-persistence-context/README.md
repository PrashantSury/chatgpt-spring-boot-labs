# Chapter 22: The persistence context

**By the end of this chapter:** apply the concept in Tapri Cloud and explain the design decision in an interview.

## Why you need this

The persistence context is the first-level cache that tracks managed entities and synchronizes their changes with the database.

## Core concepts

Understand managed, detached, transient and removed states; dirty checking; flush versus commit; `clear`, `refresh` and identity guarantees. Beware of long transactions and hidden queries.

## Tapri Cloud scenario

Load a menu item, change its price and commit without calling repository save again. Observe dirty checking and inspect when SQL is sent.

## Build it — practical tasks

1. Write a transaction that modifies a managed entity; compare managed and detached updates; call flush and clear deliberately; demonstrate first-level caching; test stale detached state.
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

**What is dirty checking? Hibernate detects changes to managed entities and writes the required SQL during flush.**

## Stretch task

Add a production-style diagnostic: a metric, structured log, query-count assertion or security test that would help detect a regression.


## Practice stub

Implement the chapter exercise in [`DirtyChecking.java`](src/main/java/com/tapri/practice/chapter22/DirtyChecking.java). The starter method intentionally throws `UnsupportedOperationException` until you complete the TODO. Add tests under `src/test/java` and verify normal and edge-case behavior.
