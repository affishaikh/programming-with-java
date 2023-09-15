package com.learning.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sample {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> greaterThan5 = numbers.stream()
                .filter(n -> {
                    System.out.printf("filtering %d\n", n);
                    return n > 5;
                })
                .map(n -> {
                    System.out.printf("mapping %d\n", n);
                    return n * 2;
                })
                .collect(Collectors.toList());

        System.out.println(greaterThan5);
    }
}

/***
 * Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
 * Change even position to odd and vice versa
 *
 * reduce
 * findFirst
 * sorted
 *
 * Collectors
 *
 * Optional
 */
