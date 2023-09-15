package com.learning;

import java.util.*;

public class Student {
    String name;
    Integer yearOfBirth;
    Integer rollNumber;
    Float weight;
    Float height;
    Integer division;

    Student(String name, Integer yearOfBirth) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    public Integer age() {
        Integer age = 2022 - yearOfBirth;
        return age;
    }

    public static void main(String[] args) {
        Student student = new Student("sourabh", 2000);
        System.out.println(student.age());

        String name = "thomas";
        System.out.println("thomas" == ("" + "thomas"));
        System.out.println("thomas" == ("" + name));

        new Object().hashCode();

        new HashMap<>();
        new Hashtable<>();

        HashSet<Integer> objects = new HashSet<>();
        objects.add(1);
        objects.removeIf((e) -> e.equals(1));
        System.out.println(objects);
        new WeakHashMap<>();

        new Strings().isEqual("" + name);
    }
}
