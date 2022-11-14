package com.learning;

/***
 * Input - 5
 *     * + 0
 *    *** + 1
 *   ***** + 2
 *  ******* + 3
 * ********* + 4
 */

public class Arrays {
    public static String[] reverse(String[] numbers) {
        String[] result = new String[numbers.length];
        int lastIndex = numbers.length - 1;

        for (int i = lastIndex; i >= 0; i--) {
            result[lastIndex - i] = numbers[i];
        }

        return result;
    }

    public static String[] merge(String[] s1, String[] s2) {
        String[] result = new String[s1.length + s2.length];
        for (int i = 0; i < s1.length; i++) {
            result[i] = s1[i];
        }

        for (int i = s1.length, j = 0; i < result.length; i++, j++) {
            result[i] = s2[j];
        }

        return result;
    }

    private static String repeat(char c, Integer count) {
        String result = "";
        for (int j = 1; j <= count; j++) {
            result = result + c;
        }
        return result;
    }

    public static String[] pyramid(Integer height) {
        Integer starCount = 1;
        Integer spaceCount = height - 1;
        String[] pyramid = new String[height];

        for (int i = 0; i < height; i++) {
            String row = repeat(' ', spaceCount);
            row = row + repeat('*', starCount);
            row = row + repeat(' ', spaceCount);
            pyramid[i] = row;
            starCount = starCount + 2;
            spaceCount = spaceCount - 1;
        }

        return pyramid;
    }

    public static void main(String[] args) {
        String[] pyramid = pyramid(5);
        for (int i = 0; i< pyramid.length; i++) {
            System.out.print(pyramid[i]);
            System.out.print(pyramid[i]);
            System.out.print(pyramid[i]);
            System.out.print(pyramid[i]);
            System.out.print(pyramid[i]);
            System.out.print(pyramid[i]);
            System.out.println(pyramid[i]);
        }
    }
}
