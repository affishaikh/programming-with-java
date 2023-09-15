package com.learning.basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

/***
 * 1. You get an array of numbers, return the sum of all of the positives ones.
 *
 * Exampls: [1,-4,7,12] -> 1 + 7 + 12 = 20
 *
 * Note: if there is nothing to sum, the sum is default to 0.
 */

public class SumOfAllPositives {

    public static int[] countPositivesSumNegatives(int[] input)
    {
        int[] result = new int[2];

        for (int i = 0; i < input.length; i++) {
            if (input[i] > 0 ) {
                result[0]++;
            } else {
                result[1] = result[1] + input[i];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(countPositivesSumNegatives(new int[]{11, 23, -5, -10, 45, -2}))); // [3, -17]
        new ArrayList<String>().stream().collect(Collectors.joining(""));
    }
}
