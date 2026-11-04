# Chapter 11: Updating and deleting

**By the end of this chapter:** apply the core idea in a small Tapri Cloud feature and explain the design choice in an interview.

## Why you need this

Update and delete endpoints must distinguish full replacement, partial modification, missing resources and idempotent behavior.

## Core concepts

Use PUT for replacement semantics and PATCH for partial changes. Check existence and business constraints before writing. Choose 404 for a missing resource and 204 when deletion succeeds without a response body.

## Tapri Cloud scenario

Allow a café manager to change menu item price and availability. Prevent a price update below zero and return a clear not-found response for an unknown item.

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

**What is the practical difference between PUT and PATCH?** PUT represents replacement of a resource; PATCH applies a partial change.

## Stretch task

Add a test for a realistic edge case, then refactor one part to improve readability without changing behavior.
