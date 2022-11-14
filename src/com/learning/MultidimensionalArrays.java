package com.learning;

public class MultidimensionalArrays {

    public static void main(String[] args) {
        String[][] anArray = new String[2][2];
        anArray[0] = new String[]{"abc", "xyz", "cde"};
        anArray[1] = new String[]{"1"};
        anArray[1][1] = "1";

        for (String[] arr: anArray) {
            for (String str: arr) {
                System.out.print(str + " ");
            }
            System.out.println();
        }
    }
}
