package com.learning;

public class Lottery {

    public static void main(String[] args) {
        int[] numbers = {5, 999, 14, 2, 3, 0, 1, 67, 18};
        int index = (int) ((Math.random() * 10) % numbers.length);
        System.out.println(numbers[index]);
    }
}
