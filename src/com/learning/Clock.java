package com.learning;

import java.util.Scanner;

public class Clock {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter hours");
        int hour = scanner.nextInt();
        System.out.println("Enter minutes");
        int minute = scanner.nextInt();
        System.out.println("Enter seconds");
        int seconds = scanner.nextInt();
        int result = (hour * 60 * 60 * 1000) + (minute * 60 * 1000) + (seconds * 1000);
        System.out.println(result);
    }
}

/***
 * Take 5 numbers input from user and find its average
 */
