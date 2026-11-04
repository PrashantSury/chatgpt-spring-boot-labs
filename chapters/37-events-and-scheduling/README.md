# Chapter 37: Events and scheduling

**By the end of this chapter:** apply the concept in Tapri Cloud and explain the design decision in an interview.

## Why you need this

Application events decouple components in one process; scheduled jobs run recurring work. Both need clear delivery, concurrency and failure semantics.

## Core concepts

Use `ApplicationEventPublisher` and `@EventListener` for in-process notifications; use `@Scheduled` with explicit timezone and lock strategy for jobs. In-memory events are not durable across crashes. Use an outbox or message broker when reliable cross-service delivery is required.

## Tapri Cloud scenario

After an order is placed, notify an in-process reporting component. A nightly job marks expired reservations, ensuring multiple app instances do not process the same record twice.

## Build it — practical tasks

1. Publish and consume a domain event; test listener behavior; configure a scheduled task; define timezone; prevent duplicate execution across instances; document when to use a durable queue instead.
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

**Are Spring application events durable? No. They are in-process notifications and can be lost if the process stops.**

## Stretch task

Review the feature as if it were going live: identify one failure mode, add a test or diagnostic for it, and document a mitigation.
