package com.learning;

public class Names {

    public static String shortcut(String input) {
        return input.replaceAll("[aeiou]", "");
    }

    public static void main(String[] args) {
        System.out.println(shortcut("It's magic!"));
    }
}
