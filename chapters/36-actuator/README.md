# Chapter 36: Actuator

**By the end of this chapter:** apply the concept in Tapri Cloud and explain the design decision in an interview.

## Why you need this

Actuator exposes operational endpoints that help operators understand application health, metrics and runtime state.

## Core concepts

Use health, info, metrics and environment endpoints selectively. Expose only required endpoints, secure sensitive ones, and add custom health indicators for critical dependencies. Health checks should be fast and meaningful.

## Tapri Cloud scenario

Operations needs liveness and readiness signals plus JVM and HTTP metrics. Public users should not be able to inspect environment variables or configuration secrets.

## Build it — practical tasks

1. Add Actuator; expose health and info only; create a custom partner-service health indicator; secure management endpoints; inspect metrics; verify readiness changes when a required dependency is unavailable.
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

**Liveness vs readiness? Liveness asks whether the process should be restarted; readiness asks whether it should receive traffic.**

## Stretch task

Review the feature as if it were going live: identify one failure mode, add a test or diagnostic for it, and document a mitigation.


## Practice stub

Implement the chapter exercise in [`HealthPolicy.java`](src/main/java/com/tapri/practice/chapter36/HealthPolicy.java). The starter method intentionally throws `UnsupportedOperationException` until you complete the TODO. Add tests under `src/test/java` and verify normal and edge-case behavior.
