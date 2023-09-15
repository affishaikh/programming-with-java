package com.learning;

public class GuessStatisticsMessage {

    public static String make(char candidate, int count) {
        if (count == 0) {
            return withNoLetters(candidate);
        } else if (count == 1) {
            return withOneLetter(candidate);
        } else {
            return withMultipleLetters(candidate, count);
        }
    }

    private static String withMultipleLetters(char candidate, int count) {
        return message(candidate, "are", count, "s");
    }

    private static String withOneLetter(char candidate) {
        return message(candidate, "is", 1, "");
    }

    private static String withNoLetters(char candidate) {
        return message(candidate, "are", 0, "s");
    }

    private static String message(char candidate, String verb, int number, String pluralModifer) {
        return String.format("There %s %s %s%s", verb, number, candidate, pluralModifer);
    }

    public static void main(String[] args) {
        System.out.println(GuessStatisticsMessage.make('a', 4));
    }
}

