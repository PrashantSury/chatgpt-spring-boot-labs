# Chapter 41: Interview: data and web

**By the end of this chapter:** apply the concept in Tapri Cloud and explain the design decision in an interview.

## Why you need this

This chapter consolidates REST, validation, exception handling, JDBC, JPA, transactions and query performance into scenario-based interview practice.

## Core concepts

Prepare to explain HTTP status semantics, DTOs, request lifecycle, validation, global errors, repository query choices, persistence context, fetching, N+1, locking, pagination and SQL tuning.

## Tapri Cloud scenario

An order-history API becomes slow after launch. Explain how you would inspect request latency, SQL logs, query count, indexes, pagination, fetch strategy and connection-pool metrics before changing code.

## Build it — practical tasks

1. Solve a slow-query scenario; design an order REST contract; explain a transaction rollback; compare JDBC and JPA; fix an N+1 query; write a pageable repository method; perform a mock interview and record gaps.
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

**How would you troubleshoot a slow Spring Boot API? Start with evidence: endpoint latency, traces, logs, DB query timings, query count, pool saturation and resource metrics; then isolate the bottleneck.**

## Stretch task

Review the feature as if it were going live: identify one failure mode, add a test or diagnostic for it, and document a mitigation.


## Practice stub

Implement the chapter exercise in [`ApiTroubleshooter.java`](src/main/java/com/tapri/practice/chapter41/ApiTroubleshooter.java). The starter method intentionally throws `UnsupportedOperationException` until you complete the TODO. Add tests under `src/test/java` and verify normal and edge-case behavior.
