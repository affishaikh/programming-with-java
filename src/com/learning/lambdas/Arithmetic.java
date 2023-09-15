package com.learning.lambdas;

@FunctionalInterface
public interface Arithmetic<I, R> {
    R perform(I n1, I n2);
}
