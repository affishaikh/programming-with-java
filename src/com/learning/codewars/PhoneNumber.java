package com.learning.codewars;

// "(123) 456-7890"

import java.util.stream.IntStream;

public class PhoneNumber {

    public static void main(String[] args) {
        int[] n = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

        System.out.println(String.format("(%d%d%d) %d%d%d-%d%d%d%d", IntStream.of(n).boxed().toArray()));
    }
}
