package com.learning;

import java.util.Scanner;

/***
 * Input - 5
 *     * + 0
 *    *** + 1
 *   ***** + 2
 *  ******* + 3
 * ********* + 4
 *
 *   *****
 *    ***
 *     *
 *
 *     integer - 12
 *     float - 12.3
 *     string - ""
 *     char - ''
 *     boolean - true/false
 */

public class Pyramid {

    private static void pyramid(Integer height) {
        Integer starCount = 1;
        Integer spaceCount = height - 1;

        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= spaceCount; j++) {
                System.out.print(' ');
            }
            for (int j = 1; j <= starCount; j++) {
                System.out.print('*');
            }
            System.out.println();
            starCount = starCount + 2;
            spaceCount = spaceCount - 1;
        }
    }

    private static void reversePyramid(Integer height) {
        Integer starCount = (height * 2) - 1;
        Integer spaceCount = 0;

        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= spaceCount; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= starCount; j++) {
                System.out.print("*");
            }
            System.out.println();
            starCount = starCount - 2;
            spaceCount = spaceCount + 1;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer height = scanner.nextInt();
        pyramid(height);
//        reversePyramid(height);
    }
}
