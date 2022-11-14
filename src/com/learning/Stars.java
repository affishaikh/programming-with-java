package com.learning;

public class Stars {

    public void pattern(int numberOfLines, String symbol) {
        String result = symbol;
        for (int i = 1; i <= numberOfLines; i++) {
            System.out.println(result);
            result = result + symbol;
        }
    }

    public static void main(String[] args) {
        String firstName = "sourabh";
        String lastName = "gomare";
        String fullName = firstName + " " + lastName + (10 + 20) * 40/2;

        System.out.println(fullName);
    }
}

/***
 * *
 * **
 * ***
 * ****
 * *****
 */

/***
 *    *
 *   ***
 *  *****
 * *******
 */
