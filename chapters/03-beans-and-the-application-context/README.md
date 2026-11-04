# Chapter 3: Beans and the application context

**By the end of this chapter:** apply the core idea in a small Tapri Cloud feature and explain the design choice in an interview.

## Why you need this

A bean is an object whose creation and lifecycle are managed by Spring. The application context is the container that stores bean definitions, creates objects, injects dependencies and manages lifecycle callbacks.

## Core concepts

Use `@Component` for a class discovered by scanning, `@Bean` on a configuration method when you need to construct or configure an object explicitly, and `ApplicationContext` when you need to look up a bean. Prefer constructor injection over manual lookups in application code.

## Tapri Cloud scenario

Tapri Cloud needs a `MenuCatalog` shared by controllers and services. Register it as a bean and inject it into a service. Compare a Spring-managed object with `new MenuCatalog()` created manually: the latter is not automatically managed or injected.

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

**Why is a Spring bean different from an object created with `new`?** Spring owns its lifecycle and can apply dependency injection, proxies and configured post-processors.

## Stretch task

Add a test for a realistic edge case, then refactor one part to improve readability without changing behavior.
