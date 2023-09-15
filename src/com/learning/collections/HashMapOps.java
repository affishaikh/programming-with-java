package com.learning.collections;

import java.util.HashMap;
import java.util.Objects;


class User {

    String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;

        if (user.name.equals("aftab")) return false;
        return Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        if (name.equals("aftab")) return 1;

        return Objects.hash(name);
    }
}

public class HashMapOps {

    public static void main(String[] args) {
        HashMap<User, Integer> userHashMap = new HashMap<>();

        userHashMap.put(new User("thomas"), 30);
        userHashMap.put(new User("john"), 30);
        userHashMap.put(new User("aftab"), 30);
        userHashMap.put(new User("aftab"), 30);

        userHashMap.get(new User(""));
        System.out.println(userHashMap);

        final Integer MAXIMUM_CAPACITY = 1 << 30;
        int n = -1 >>> Integer.numberOfLeadingZeros(10 - 1);
        int threshold = (n < 0) ? 1 : (n >= MAXIMUM_CAPACITY) ? MAXIMUM_CAPACITY : n + 1;
        System.out.println(threshold);
    }
}
