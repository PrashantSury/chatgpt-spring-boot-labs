# Chapter 4: Dependency injection

**By the end of this chapter:** apply the core idea in a small Tapri Cloud feature and explain the design choice in an interview.

## Why you need this

Dependency injection means a class receives the collaborators it needs instead of constructing them itself. This reduces coupling and makes code easier to test.

## Core concepts

Use constructor injection for required dependencies. A single constructor needs no `@Autowired`. Use interfaces at boundaries where multiple implementations are meaningful; use `@Qualifier` or `@Primary` when multiple beans match one type. Avoid field injection because it hides required dependencies and complicates unit tests.

## Tapri Cloud scenario

Create `PaymentGateway` with `CashGateway` and `CardGateway`. Inject the selected gateway into `CheckoutService`; make the choice explicit with a qualifier and test the service with a fake gateway.

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

**What problem does constructor injection solve?** It makes required collaborators explicit, supports immutability and allows tests to provide substitutes without starting Spring.

## Stretch task

Add a test for a realistic edge case, then refactor one part to improve readability without changing behavior.


## Practice stub

Implement the chapter exercise in [`CheckoutService.java`](src/main/java/com/tapri/practice/chapter04/CheckoutService.java). The starter method intentionally throws `UnsupportedOperationException` until you complete the TODO. Add tests under `src/test/java` and verify normal and edge-case behavior.
