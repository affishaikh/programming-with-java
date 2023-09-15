package com.learning;

import java.util.Scanner;

public class Arrays {
//    public static void main(String[] args) {
//       int[] numbers;
//       numbers = new int[] {87, 101, 56, 42, 43};
//
//       for (int i = numbers.length - 1; i >= 0; i = i -1) {
//           System.out.println(numbers[i]);
//       }
//    }

    /***
     * Given a list of integers, determine whether the sum of its elements is odd or even.
     * Give your answer as a string matching "odd" or "even".
     * If the input array is empty consider it as: [0] (array with a zero).
     * Examples:
     * Input: [0]
     * Output: "even"
     * Input: [0, 1, 4]
     * Output: "odd"
     * Input: [0, -1, -5]
     * Output: "even"
     */
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int sum = 0;
//
//        System.out.print("Enter size of array: ");
//
//        int size = sc.nextInt();
//        int[] numbers = new int[size];
//
//        for (int i = 0; i < size; i++) {
//            System.out.println("Enter number " + (i + 1));
//            numbers[i] = sc.nextInt();
//            sum = sum + numbers[i];
//        }
//        System.out.println("Sum = " + sum);
//
//        String result = "Odd number";
//        if (sum % 2 == 0) {
//            result = "even number";
//        }
//
//        System.out.println(result);
//    }

//    static int find(int[] numbers, int n) {
//        int index = -1;
//
//        for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i] == n) {
//                index = i;
//                break;
//            }
//        }
//
//        return index;
//    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        do {
//            Integer number = scanner.nextInt();
//
//            if (number % 2 == 0) {
//                System.out.println(number + " is an even number.");
//            } else {
//                System.out.println(number + " is an odd number.");
//            }
//        } while (true);

        System.out.println(java.util.Arrays.toString("h a   ".split(" ")));
    }
}
