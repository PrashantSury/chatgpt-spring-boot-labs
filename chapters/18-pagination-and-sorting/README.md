# Chapter 18: Pagination and sorting

**By the end of this chapter:** apply the concept in Tapri Cloud and explain the design decision in an interview.

## Why you need this

Pagination limits database and network work when collections grow. Sorting makes results deterministic and useful to clients.

## Core concepts

Use `Pageable`, `PageRequest`, `Sort`, `Page` and `Slice`. Validate page size and sort fields from clients; always use a stable order with a unique tie-breaker.

## Tapri Cloud scenario

A café dashboard lists hundreds of menu items. Return 20 rows per page sorted by name and id, rather than loading every row into memory.

## Build it — practical tasks

1. Add pageable repository and controller methods; test first, middle and final pages; reject unreasonable page sizes; whitelist sortable fields; compare Page and Slice behavior.
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

**Page vs Slice? Page includes total-element and total-page metadata, often requiring a count query; Slice tells whether another slice exists.**

## Stretch task

Add a production-style diagnostic: a metric, structured log, query-count assertion or security test that would help detect a regression.


## Practice stub

Implement the chapter exercise in [`PageRequestPolicy.java`](src/main/java/com/tapri/practice/chapter18/PageRequestPolicy.java). The starter method intentionally throws `UnsupportedOperationException` until you complete the TODO. Add tests under `src/test/java` and verify normal and edge-case behavior.
