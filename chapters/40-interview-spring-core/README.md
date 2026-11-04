# Chapter 40: Interview: Spring core

**By the end of this chapter:** apply the concept in Tapri Cloud and explain the design decision in an interview.

## Why you need this

This chapter consolidates the Spring container and core framework concepts into concise, technically accurate interview answers.

## Core concepts

Prepare to explain IoC, DI, bean scopes, bean lifecycle, component scanning, configuration classes, `@Bean` versus `@Component`, auto-configuration, proxies, AOP and transaction management. Give a definition, practical example and trade-off.

## Tapri Cloud scenario

Explain how a request reaches a service bean, how its dependencies are supplied, how transactions are applied through proxies and how a test can replace a dependency.

## Build it — practical tasks

1. Answer each topic aloud in 60–90 seconds; draw the bean creation lifecycle; compare constructor injection and field injection; explain proxy/self-invocation; debug a missing-bean scenario; write one small code example per weak topic.
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

**How do you structure an interview answer? Define the concept, explain why it matters, give a concrete project example and mention one limitation or trade-off.**

## Stretch task

Review the feature as if it were going live: identify one failure mode, add a test or diagnostic for it, and document a mitigation.


## Practice stub

Implement the chapter exercise in [`SpringCoreFlashcards.java`](src/main/java/com/tapri/practice/chapter40/SpringCoreFlashcards.java). The starter method intentionally throws `UnsupportedOperationException` until you complete the TODO. Add tests under `src/test/java` and verify normal and edge-case behavior.
