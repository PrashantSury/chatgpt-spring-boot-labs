# Chapter 17: Repositories and query methods

**By the end of this chapter:** apply the concept in Tapri Cloud and explain the design decision in an interview.

## Why you need this

Spring Data repositories reduce persistence boilerplate and provide derived queries, explicit JPQL and native SQL when needed.

## Core concepts

Understand `JpaRepository`, query derivation from method names, `@Query`, parameter binding and repository boundaries. Choose derived queries for simple predicates and explicit queries for complex joins or aggregates.

## Tapri Cloud scenario

Find available menu items by category and price, and look up an order by its external reference. Handle the possibility that a query returns zero or multiple results.

## Build it — practical tasks

1. Create a repository; implement derived finders; write a JPQL query; add a pageable query; test empty, single and multiple match behavior; avoid `Optional` for methods that may legitimately return many rows.
2. Add focused unit or integration tests for the happy path and at least two failure or edge cases.
3. Inspect the generated SQL, HTTP response or runtime behavior relevant to this chapter.
4. Document the assumptions and one alternative approach.

## Acceptance checklist

- [ ] The scenario works end to end.
- [ ] Inputs and failure cases are handled deliberately.
- [ ] Tests demonstrate expected behavior.
- [ ] No secrets or sensitive values are logged or returned.
- [ ] You can explain the trade-off and operational impact.

## Interview check

**When should you use `@Query` instead of a derived method? When the query is complex or a derived method name becomes hard to understand.**

## Stretch task

Add a production-style diagnostic: a metric, structured log, query-count assertion or security test that would help detect a regression.
