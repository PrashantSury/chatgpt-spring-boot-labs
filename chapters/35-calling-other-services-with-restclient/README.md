# Chapter 35: Calling other services with RestClient

**By the end of this chapter:** apply the concept in Tapri Cloud and explain the design decision in an interview.

## Why you need this

A backend often calls partner services. A resilient HTTP client needs timeouts, clear error mapping, safe retries and observability.

## Core concepts

Use Spring's synchronous `RestClient`; configure base URLs, connect/read timeouts, headers and message conversion. Handle 4xx versus 5xx distinctly. Retry only transient failures and only when the operation is idempotent or protected by an idempotency key.

## Tapri Cloud scenario

Tapri Cloud requests a delivery quote from a partner service. A slow or unavailable partner must not hang request threads indefinitely or create duplicate charges.

## Build it — practical tasks

1. Create a typed client; configure timeouts; map partner responses; handle 404 and 5xx; add an idempotency key for retryable writes; test using a mock HTTP server; record latency and failure metrics.
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

**Why should you not retry every failed POST? The first request may have succeeded remotely even if its response was lost, causing duplicate side effects.**

## Stretch task

Review the feature as if it were going live: identify one failure mode, add a test or diagnostic for it, and document a mitigation.
