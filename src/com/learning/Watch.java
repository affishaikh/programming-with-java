package com.learning;

import java.util.Optional;
import java.util.Scanner;
public class Watch {
    public static void main(String[] args) {
        Optional<String> message = Optional.of("random message");

        String s = message.orElse("No msg");
        System.out.println(s);
    }
}

/***
 * Take 5 numbers input from user and find its average
 */
