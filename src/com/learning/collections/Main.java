package com.learning.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        List<String> l = new ArrayList<>(10);
        Set<String> s = new HashSet<>();
        l.add("A");
        l.add("B");
        l.add("C");
        System.out.println(l.size());
        List<String> l1 = new ArrayList<>(l);
        System.out.println(l1.remove(2));
        System.out.println(l);
        System.out.println(l1);
        l.set(1, "b");
        l.add(2, "c");
        System.out.println(l);
    }
}
