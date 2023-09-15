package com.learning;

import java.util.Arrays;

/***
 * 5 -> [1, 2, 4, 8, 16, 32] -> [2 ^ 0, 2 ^ 1, 2 ^ 2, 2 ^ 3, 2 ^ 4, 2 ^ 5]
 * result[3] * 2
 */

public class PowersOf2 {

    public static int[] until(int base, int exponent) {
        int[] result = new int[exponent + 1];
        result[0] = 1;

        for (int i = 1; i <= exponent; i++) {
            result[i] = result[i - 1] * base;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(PowersOf2.until(3, 5)));
    }
}
