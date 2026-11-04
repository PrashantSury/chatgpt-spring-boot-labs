# Chapter 7: The bean lifecycle

**By the end of this chapter:** apply the core idea in a small Tapri Cloud feature and explain the design choice in an interview.

## Why you need this

Spring creates beans, injects dependencies, runs initialization callbacks, makes them available, and eventually invokes destruction callbacks for managed scopes.

## Core concepts

Know constructor execution, dependency population, aware callbacks, bean post-processors, initialization callbacks such as `@PostConstruct`, and destruction callbacks such as `@PreDestroy`. Keep initialization quick and avoid network calls in constructors.

## Tapri Cloud scenario

A `MenuCache` loads a small reference dataset at startup and closes a background resource at shutdown. Add lifecycle logging and verify callback order without relying on fragile timing.

## Build it — practical tasks

1. Implement the smallest working example of the chapter concept in a focused package.
2. Integrate it into the Tapri Cloud menu or order use case without mixing unrelated responsibilities.
3. Add tests for the successful path and at least two failure or edge cases.
4. Add useful logging or diagnostics without exposing secrets or personal data.
5. Write a short note explaining the trade-off you made and one alternative.

## Acceptance checklist

- [ ] The feature works for the stated scenario.
- [ ] Responsibilities are separated and names express intent.
- [ ] Success and failure cases are covered by tests.
- [ ] HTTP or application behavior is documented with an example.
- [ ] You can explain the implementation without reading the code.

## Interview check

**When does `@PostConstruct` run?** After dependency injection and before the bean is made available for normal use.

## Stretch task

Add a test for a realistic edge case, then refactor one part to improve readability without changing behavior.
