package com.learning;

public class Strings {

    void isEqual(String s1) {
        String s2 = "hey";
        System.out.println(s2 == s1);
    }

    public static void main(String[] args) {

        String name = "aftab";
        String name1 = "aftab";

        System.out.println(name == ("" + name1));
    }
}
