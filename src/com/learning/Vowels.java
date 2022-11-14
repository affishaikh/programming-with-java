package com.learning;

import java.util.Scanner;

public class Vowels {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String alphabet = scanner.next();

        switch(alphabet) {
            case "A": System.out.println("Vowel0");
                        break;
            case "E": System.out.println("Vowel1");
                        break;
            case "I": System.out.println("Vowel2");
                        break;
            case "O": System.out.println("Vowel3");
                        break;
            case "U": System.out.println("Vowel4");
                        break;
            default: System.out.println("Consonant");
        }
    }
}

/***
 * Take 5 numbers input from user and find its average
 */
