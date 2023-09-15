package com.learning.lambdas;

import java.util.List;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Functions<I, R> {

    R perform(I n1, I n2, Arithmetic<I, R> arithmetic) {
        return arithmetic.perform(n1, n2);
    }

    public static void main(String[] args) {
        // Anonymous class
        System.out.println(
                new Functions<Integer, Integer>().perform(23, 46, new Arithmetic<Integer, Integer>() {
                            @Override
                            public Integer perform(Integer n1, Integer n2) {
                                return n1 / n2;
                            }
                        }
                ));

        System.out.println(new Functions<Integer, Integer>().perform(10, 20, (i1, i2) -> i1 * i2));

        Function<Integer, Integer> f1 = (Integer a) -> a + 1;
        Function<Integer, Integer> f2 = (a) -> a * a;

        System.out.println(List.of(1, 2, 5, 100).stream().map(f2.compose(f1)).collect(Collectors.toList()));

        System.out.println(IntStream.range(2, 56).parallel().noneMatch(new IntPredicate() {
            @Override
            public boolean test(int value) {
                System.out.println(Thread.currentThread().getName());
                return 113 % value == 0;
            }
        }));
    }
}
