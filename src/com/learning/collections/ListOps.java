package com.learning.collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListOps {

    public static void main(String[] args) {
        List<ArrayList<Integer>> integers = List.of(new ArrayList<>(), new ArrayList<>());

        Stream<ArrayList<Integer>> peek = integers.stream()
                .peek(ns -> {
                    System.out.println("------->");
                })
                .peek(System.out::println);
//                .toList();

        System.out.println(peek.toList());
        System.out.println(integers);


        Stream.iterate(10, (i) -> 2 * i).limit(10).forEach(System.out::println);

        System.out.println(new ArrayList<Integer>().stream().mapToInt(n -> n).max().orElse(1));

        List.of(2, 4).stream().collect(Collectors.toList());

        System.out.println(List.of(new Person(1110000L), new Person(2110000L))
                .stream()
                .reduce(0L, (p1, p2) -> p1 + p2.salary, Long::max)
        );
    }
}

class Person {
    Long salary;

    public Person(Long salary) {
        this.salary = salary;
    }

    public Long getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Person{" +
                "salary=" + salary +
                '}';
    }
}
