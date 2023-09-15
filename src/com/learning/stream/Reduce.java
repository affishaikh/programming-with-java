package com.learning.stream;

import java.util.*;
import java.util.stream.Collectors;

public class Reduce {

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(13, 62, 87, 94, 82);

//        System.out.println(nums.parallelStream()
//                .reduce(Map.of("even", new ArrayList<Integer>(), "odd", new ArrayList<Integer>()),
//                        (oddEven, n) -> {
//                            String key = n % 2 == 0 ? "even" : "odd";
//                            oddEven.get(key).add(n);
//                            return oddEven;
//                        },
//                        (m, n) -> {
//                            System.out.println(m);
//                            System.out.println(n);
//                            return m;
//                        }
//                ));

//        nums.parallelStream().map(n -> {
//            System.out.printf("Thread %s\n", Thread.currentThread().getName());
//            return n;
//        }).collect(Collectors.toList());

//        System.out.println(nums.parallelStream().reduce(-1,
//                (acc, n) -> {
//                    System.out.printf("reduce -----> %d\n", acc);
//                    System.out.printf("reduce -----> %d\n", n);
//                    return acc + n;
//                },
//                (m, n) -> {
//                    System.out.printf("combiner -----> %d\n", m);
//                    System.out.printf("combiner -----> %d\n", n);
//                    return m + n;
//                }));

        Map<String, List<String>> gfs = new HashMap<>();

        gfs.put("Aniket", List.of("Ananya", "Kiara"));
        gfs.put("Aftab", List.of());
        gfs.put("TJ", List.of("Prachi"));

        System.out.println(gfs);
    }
}
