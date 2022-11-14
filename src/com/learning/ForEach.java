package com.learning;

import java.util.ArrayList;
import java.util.List;

public class ForEach {

    public static void main(String[] args) {
        List<Integer> marks = new ArrayList<>();
        marks.add(10);
        marks.add(20);
        marks.add(30);
        marks.add(40);

        marks.forEach((number) -> {
            System.out.println(number);
        });
    }
}
