# Chapter 8: How Spring handles requests

**By the end of this chapter:** apply the core idea in a small Tapri Cloud feature and explain the design choice in an interview.

## Why you need this

Spring MVC routes HTTP requests through the servlet container and `DispatcherServlet`, which finds a handler, resolves arguments, invokes it and converts the return value into an HTTP response.

## Core concepts

Understand the request path: servlet filter chain, `DispatcherServlet`, handler mapping, handler adapter, argument resolvers, controller, return-value handlers, message converters and exception resolvers. Filters run outside the MVC controller pipeline.

## Tapri Cloud scenario

Trace `GET /menu?category=hot` from the embedded server to the controller and back as JSON. Identify where authentication filters, parameter conversion and JSON serialization occur.

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

**What is the role of `DispatcherServlet`?** It is the front controller that coordinates handler mapping, invocation and response processing for Spring MVC.

## Stretch task

Add a test for a realistic edge case, then refactor one part to improve readability without changing behavior.


## Practice stub

Implement the chapter exercise in [`RequestTrace.java`](src/main/java/com/tapri/practice/chapter08/RequestTrace.java). The starter method intentionally throws `UnsupportedOperationException` until you complete the TODO. Add tests under `src/test/java` and verify normal and edge-case behavior.
