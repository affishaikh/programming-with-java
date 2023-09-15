package com.learning;

import java.util.HashSet;
import java.util.Set;

public class Methods {

    public static Boolean isOdd(Integer n) {
        return n % 2 == 0;
    }

    public static Integer add(Integer n1, Integer n2, Integer n3) {
        return n1 + n2 + n3;
    }

    public static Double subtract(Integer n1, Integer n2, Double n3) {
        return n1 - n2 - n3;
    }

    // 33.4 % 33 -> 0.4 > 0.5
    public static Integer floor(Double n) {
        Integer x = n.intValue();
        Double remainder = n % x;
        Integer result = x;

        if (remainder >= 0.5) {
            result = x + 1;
        }

        return result;
    }

    static Double cube(Double n) {
        Double result = n * n * n;

        return result;
    }

    public static void main(String[] args) {
        System.out.println("--------> Subtraction started<------------");
        System.out.println(subtract(20, 5, 9.1));
        System.out.println("--------> Subtraction ended<------------");
        System.out.println(Symbol.X.toString());

        Set<Integer> moves = new HashSet<>();
        moves.add(1);
    }
}

enum Symbol {
    X,
    O
}

/***
 * Method starts running when it is called
 * Syntax: className/objectName.methodName(input...);
 *
 * Method call -> starting a machine

 * Advantages:
 * 1. Reuse
 * 2. Readable/Understandable

 * Method definition: -> structure
 * static return_type method_name(Paramet_Type p1, Parameter_Type p2, ...) {
 *         // body
 *         return statement;
 * }

 * Try out all methods in Math class, and find out what they do
 */
