# Chapter 5: Configuration and profiles

**By the end of this chapter:** apply the core idea in a small Tapri Cloud feature and explain the design choice in an interview.

## Why you need this

Configuration separates environment-specific settings from application code. Profiles let Spring activate beans and properties for local, test, staging or production environments.

## Core concepts

Read values with `@Value` for simple cases and prefer `@ConfigurationProperties` for grouped, validated settings. Set defaults carefully. Activate profiles with `spring.profiles.active` or deployment environment variables; do not commit secrets to YAML files.

## Tapri Cloud scenario

Tapri Cloud connects to different database URLs in local and production. Bind `tapri.payment` properties to a typed configuration record and provide local and prod property files. Keep passwords outside source control.

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

**How do you override a Spring property in production?** Use externalized configuration such as environment variables or a secret/config service, not a source-code edit.

## Stretch task

Add a test for a realistic edge case, then refactor one part to improve readability without changing behavior.


## Practice stub

Implement the chapter exercise in [`TapriSettings.java`](src/main/java/com/tapri/practice/chapter05/TapriSettings.java). The starter method intentionally throws `UnsupportedOperationException` until you complete the TODO. Add tests under `src/test/java` and verify normal and edge-case behavior.
