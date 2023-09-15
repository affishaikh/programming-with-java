package com.learning.basics;

import java.util.Scanner;

public class ControlStatements {

    public static void main(String[] args) {
        int[] a = new int[new Scanner(System.in).nextInt()];

        for (int i = 0; i < a.length; i++) {
            a[i] = (i + 1) * 10;
        }

        System.out.println(java.util.Arrays.toString(a));
    }
}

// Object - bundle of data and functionality
