package com.learning.basics;

import java.util.Scanner;

public class Examples {

    /*** Write a program to print following pattern:
     Input -> 5
     *
     ***
     *****
     *******
     *********
     */

//    public static void triangle(String[] args) {
//        String stars = "*";
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//
//        for (int i = 1; i <= n; i++) { // i -> 2
//            System.out.println(stars);
//            stars = stars + "*";
//        }
//    }

//    public static void diamond(String[] args) {
//        String stars = "*";
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int spaces = n - 1;
//
//        for (int j = 1; j <= n; j++) { // j -> 1
//            for (int i = 1; i <= n - 1; i++) { // i -> 3
//                System.out.print(" ");
//            }
//            System.out.println("*");
//        }
//    }

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int lines = scanner.nextInt();
//
//        for (int j = 1; j <= lines; j++) { // j -> 1
//            for (int i = 1; i <= n; i++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }

//    public static void main(String[] args) {
//        for (int j = 1; j <= 10; j++) {
//            for (int i = 1; i <= j; i++) {
//                System.out.print(i + " ");
//            }
//            System.out.println();
//        }
//    }

    public static void main(String[] args) {

        int weeks = 3;
        int days = 7;

        // outer loop
        for (int i = 1; i <= weeks; ++i) {
            System.out.println("Week: " + i);

            // inner loop
            for (int j = 1; j <= days; ++j) {

                // break inside the inner loop
                if (i != 2) {
                    System.out.println("  Days: " + j);
                }
            }
        }
    }
}

/***
 * j -> 7
 * i -> 1
 * 1
 * 1 2
 * 1 2 3
 * 1 2 3 4
 * 1 2 3 4 5
 * 1 2 3 4 5 6
 * 1 2 3 4 5 6 7
 * 1 2 3 4 5 6 7 8
 * 1 2 3 4 5 6 7 8 9
 * 1 2 3 4 5 6 7 8 9 10
 * One instruction at a time
 */
