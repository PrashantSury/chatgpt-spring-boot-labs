# Chapter 34: Aspect-oriented programming

**By the end of this chapter:** apply the concept in Tapri Cloud and explain the design decision in an interview.

## Why you need this

AOP separates cross-cutting behavior such as timing, audit logging and tracing from business methods.

## Core concepts

Understand aspects, join points, pointcuts, advice types and proxies. Use narrow pointcuts, avoid changing business outcomes in logging advice, and know proxy limitations such as self-invocation.

## Tapri Cloud scenario

Record execution time for service methods and log a safe operation name and correlation ID without scattering stopwatch code across every service.

## Build it — practical tasks

1. Create an aspect with `@Around`; target selected service methods; measure elapsed time; preserve return values and exceptions; test pointcut scope; compare AOP with an explicit decorator.
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

**What does `@Around` advice do? It wraps a method invocation, can run logic before and after `proceed()`, and must preserve or intentionally alter the result.**

## Stretch task

Review the feature as if it were going live: identify one failure mode, add a test or diagnostic for it, and document a mitigation.
