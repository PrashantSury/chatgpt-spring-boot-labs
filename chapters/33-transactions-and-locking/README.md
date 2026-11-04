# Chapter 33: Transactions and locking

**By the end of this chapter:** apply the concept in Tapri Cloud and explain the design decision in an interview.

## Why you need this

Concurrent requests can read and update the same data at the same time. Transaction isolation and locking protect invariants such as stock quantity and order state.

## Core concepts

Understand isolation levels, optimistic locking with `@Version`, pessimistic locks and lost updates. Keep transactions short and retry only operations that are safe to retry.

## Tapri Cloud scenario

Two customers attempt to buy the last available item. Prevent both transactions from successfully reserving the same stock.

## Build it — practical tasks

1. Add a version column; simulate concurrent updates; demonstrate optimistic-lock failure; implement a pessimistic lock for a critical reservation; test retry policy and transaction boundaries.
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

**Optimistic vs pessimistic locking? Optimistic detects conflicting updates at write time; pessimistic acquires a database lock before proceeding.**

## Stretch task

Review the feature as if it were going live: identify one failure mode, add a test or diagnostic for it, and document a mitigation.
