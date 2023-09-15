package com.learning.java_collections_learning;

import java.util.*;

public class ArrayListTryouts {

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = a;

        ArrayList<Integer> c = new ArrayList<>();
        c.add(1);

        b = c;
        System.out.println(b);
        System.out.println(a);
        System.out.println(10 >> 1);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
