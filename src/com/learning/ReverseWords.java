package com.learning;

import java.util.Arrays;

class ReverseWords {
    public static String[] reverse(String[] numbers) {
        String[] result = new String[numbers.length];
        int lastIndex = numbers.length - 1;

        for (int i = lastIndex; i >= 0; i--) {
            result[lastIndex - i] = numbers[i];
        }

        return result;
    }

    public static String reverseWords(String s) {
        String[] words = s.split(" ");
        System.out.println(java.util.Arrays.toString(words));
        String reverse = "";

        for (String word: reverse(words)) {
            reverse = reverse + " " + word;
        }

        return reverse;
    }

    public static void main(String[] args) {
//        System.out.println(reverseWords("  hello world  "));
        System.out.println(Arrays.toString("  h  j   ".split(" ")));
    }
}