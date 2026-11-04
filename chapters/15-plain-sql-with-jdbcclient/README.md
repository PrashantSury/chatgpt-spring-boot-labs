# Chapter 15: Plain SQL with JdbcClient

**By the end of this chapter:** apply the concept in Tapri Cloud and explain the design decision in an interview.

## Why you need this

Use SQL directly when a use case needs precise queries, joins or database-specific features. JdbcClient provides a fluent Spring API over JDBC while keeping SQL visible.

## Core concepts

Use parameter binding rather than string concatenation; map rows explicitly; understand `query`, `queryForObject` and `update`; let Spring manage connection acquisition and release through the configured datasource.

## Tapri Cloud scenario

Build a menu search that filters by category and maximum price. Bind all user values as parameters, and return an empty result when no rows match.

## Build it — practical tasks

1. Create a table and seed data; implement list, find-by-id and update-price queries; bind named parameters; map a row to a DTO; test injection-shaped input and no-result behavior.
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

**Why bind SQL parameters? It prevents user input from becoming executable SQL and lets the driver handle values safely.**

## Stretch task

Add a production-style diagnostic: a metric, structured log, query-count assertion or security test that would help detect a regression.
