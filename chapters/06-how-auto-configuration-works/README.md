# Chapter 6: How auto-configuration works

**By the end of this chapter:** apply the core idea in a small Tapri Cloud feature and explain the design choice in an interview.

## Why you need this

Spring Boot auto-configuration registers useful beans based on the libraries and settings present at runtime. It reduces setup but remains conditional and overridable.

## Core concepts

Understand `@EnableAutoConfiguration`, classpath conditions, property conditions, bean conditions and auto-configuration back-off. Use the condition evaluation report and debug logging to see why a configuration matched or did not match.

## Tapri Cloud scenario

Adding the MVC starter makes web infrastructure available. Adding a datasource driver and datasource properties can trigger datasource setup. A user-defined bean can cause a conditional default to back off.

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

**What does `@ConditionalOnMissingBean` do?** It allows a default bean only when the application has not supplied a matching bean.

## Stretch task

Add a test for a realistic edge case, then refactor one part to improve readability without changing behavior.
