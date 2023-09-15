package com.learning;

import java.util.Arrays;

public class Capitalize {

    public static String[] capitalize(String str) {
        String[] result = new String[] {"", ""};

        for (int i = 0; i < str.length(); i++) {
            char smallChar = str.charAt(i);
            int correspondingAscii = smallChar - 32;
            char capitalChar = (char) correspondingAscii;

            if (i % 2 == 0) {
                result[0] = result[0] + capitalChar;
                result[1] = result[1] + smallChar;
            } else {
                result[1] = result[1] + capitalChar;
                result[0] = result[0] + smallChar;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(capitalize("abcdef")));
    }
}
