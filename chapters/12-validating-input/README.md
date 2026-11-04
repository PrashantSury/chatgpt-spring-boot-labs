# Chapter 12: Validating input

**By the end of this chapter:** apply the core idea in a small Tapri Cloud feature and explain the design choice in an interview.

## Why you need this

Validation rejects invalid client data at the API boundary before it becomes a database or business-rule problem.

## Core concepts

Use Jakarta Bean Validation constraints such as `@NotBlank`, `@NotNull`, `@Positive`, `@Size` and custom validators. Add `@Valid` to request bodies and translate violations into a stable error response.

## Tapri Cloud scenario

An order must contain at least one item, each quantity must be positive, and customer contact information must meet defined constraints. Separate field-level validation from business rules that require database state.

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

**What does `@Valid` do on `@RequestBody`?** It asks the validation provider to validate the bound object and raises a validation exception when constraints fail.

## Stretch task

Add a test for a realistic edge case, then refactor one part to improve readability without changing behavior.
