package com.tapri.practice.chapter39;

/**
 * Chapter 39 practice stub.
 * Goal: Authorize customer ownership and manager café scope.
 *
 * Complete each TODO and add tests in src/test/java.
 * UnsupportedOperationException is intentional until you implement the exercise.
 */
public class OrderAccessPolicy {

    public boolean canAccess(Role role, long principalId, long ownerId, long principalCafeId, long orderCafeId) { throw new UnsupportedOperationException("TODO: enforce role and resource ownership"); }
        public enum Role { CUSTOMER, CAFE_MANAGER, ADMIN }
}
