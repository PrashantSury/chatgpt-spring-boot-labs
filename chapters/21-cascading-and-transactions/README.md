# Chapter 21: Cascading and transactions

**By the end of this chapter:** apply the concept in Tapri Cloud and explain the design decision in an interview.

## Why you need this

Transactions group database operations into one atomic unit. Cascades propagate selected persistence operations across relationships.

## Core concepts

Understand `@Transactional`, propagation, isolation, rollback rules and cascade types. Put transaction boundaries around service use cases. Remember that unchecked exceptions trigger rollback by default; checked exceptions need explicit policy when rollback is required.

## Tapri Cloud scenario

Creating an order must save the order and all its items together. If inventory reservation fails, the database changes should roll back as one unit.

## Build it — practical tasks

1. Create an order service transaction; force a failure after saving the header and verify rollback; compare cascade persist with explicit saves; test rollback rules; explain why controller methods are poor transaction boundaries.
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

**Why put `@Transactional` on a service method? It defines an atomic business operation independent of the HTTP transport layer.**

## Stretch task

Add a production-style diagnostic: a metric, structured log, query-count assertion or security test that would help detect a regression.


## Practice stub

Implement the chapter exercise in [`OrderCreation.java`](src/main/java/com/tapri/practice/chapter21/OrderCreation.java). The starter method intentionally throws `UnsupportedOperationException` until you complete the TODO. Add tests under `src/test/java` and verify normal and edge-case behavior.
