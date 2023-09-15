package com.learning.basics;

public class Expressions {

    public static void main(String[] args) {
        int d = 20 + +9 - -12 + +4 - -13 + +19;
        String s = "ONE" + (1 + 2) + "TWO" + "THREE" + (3 + 4) + "FOUR" + "FIVE" + 5;
        System.out.println(s);

        int x = 9, y = 12;
        int a = 2, b = 4, c = 6;

        int exp = (3 + 4 * x)/5 - 10 * (y - 5) * (a + b + c)/x + 9 * (4/x + (9 + x)/y);
        // 7 - 93 + 9
        System.out.println(exp);
    }
}
/***
 * Operators - https://docs.oracle.com/javase/tutorial/java/nutsandbolts/operators.html
 */
