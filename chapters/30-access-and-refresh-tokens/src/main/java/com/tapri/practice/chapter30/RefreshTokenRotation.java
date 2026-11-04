package com.tapri.practice.chapter30;

/**
 * Chapter 30 practice stub.
 * Goal: Rotate refresh-token identifiers and reject reuse.
 *
 * Complete each TODO and add tests in src/test/java.
 * UnsupportedOperationException is intentional until you implement the exercise.
 */
public class RefreshTokenRotation {

    public Rotation rotate(String presented, String stored, boolean alreadyUsed) { throw new UnsupportedOperationException("TODO: validate and rotate token"); }
        public record Rotation(boolean accepted, String nextToken) {}
}
