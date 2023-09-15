package com.learning;

import java.util.HashMap;

public class Occureneces {

    static HashMap<Character, Integer> calculate(String str) {
        HashMap<Character, Integer> result = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            result.computeIfPresent(str.charAt(i), (key, val) -> val + 1);
            result.putIfAbsent(str.charAt(i), 1);
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(calculate("aaaabbcddefggh"));
    }
}
