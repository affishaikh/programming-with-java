package com.learning;

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
    }
}
