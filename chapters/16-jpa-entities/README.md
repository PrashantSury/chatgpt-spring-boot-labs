# Chapter 16: JPA entities

**By the end of this chapter:** apply the concept in Tapri Cloud and explain the design decision in an interview.

## Why you need this

JPA maps Java objects to relational tables. Entities represent persistent state and must follow persistence rules.

## Core concepts

Use `@Entity`, `@Id`, `@GeneratedValue`, column constraints and a protected no-argument constructor. Choose field or property access consistently. Avoid putting API-specific formatting or business orchestration into entities.

## Tapri Cloud scenario

Represent a menu item as a persistent entity with identity, name, price and availability. Decide which fields are required and which columns need uniqueness or indexes.

## Build it — practical tasks

1. Create the entity and schema mapping; add constraints; persist and reload an entity in a repository test; inspect generated SQL; explain entity identity versus Java object equality.
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

**What makes a class an entity? It is a persistence-managed type with a stable identity mapped to a database table.**

## Stretch task

Add a production-style diagnostic: a metric, structured log, query-count assertion or security test that would help detect a regression.


## Practice stub

Implement the chapter exercise in [`MenuItemEntity.java`](src/main/java/com/tapri/practice/chapter16/MenuItemEntity.java). The starter method intentionally throws `UnsupportedOperationException` until you complete the TODO. Add tests under `src/test/java` and verify normal and edge-case behavior.
