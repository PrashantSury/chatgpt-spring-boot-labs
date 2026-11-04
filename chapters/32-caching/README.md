# Chapter 32: Caching

**By the end of this chapter:** apply the concept in Tapri Cloud and explain the design decision in an interview.

## Why you need this

Caching avoids repeating expensive work when the same data is requested frequently. It improves latency but introduces freshness and invalidation concerns.

## Core concepts

Use `@EnableCaching`, `@Cacheable`, `@CachePut` and `@CacheEvict`; choose stable cache keys; set TTL and size limits in the cache provider; avoid caching sensitive or user-specific data without careful keying.

## Tapri Cloud scenario

Menu items are read far more often than they change. Cache the menu by café and category, and evict or update the cache when a manager edits an item.

## Build it — practical tasks

1. Configure a cache; cache a read method; test cache hit and miss; evict after update and delete; use café ID in the key; inspect hit/miss metrics; document stale-data tolerance.
2. Add automated tests for success, failure and at least one concurrency or boundary condition where relevant.
3. Capture useful evidence: HTTP response, SQL statement count, metric, log entry or test assertion.
4. Write down the main trade-off and what you would monitor in production.

## Acceptance checklist

- [ ] The stated scenario works end to end.
- [ ] Error paths and edge cases are covered.
- [ ] Tests verify behavior, not implementation details.
- [ ] Operational or security concerns are documented.
- [ ] You can explain the design and its limitations aloud.

## Interview check

**Why is cache invalidation difficult? The cached value can become stale after writes, so every mutation path must maintain or expire the relevant entries.**

## Stretch task

Review the feature as if it were going live: identify one failure mode, add a test or diagnostic for it, and document a mitigation.
