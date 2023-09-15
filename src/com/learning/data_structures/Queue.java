package com.learning.data_structures;

import java.util.Arrays;

public class Queue {
    private String[] data = new String[10];
    private Integer tail = 0;

    public void add(String element) {
        if (this.tail == data.length) {
            this.data = Arrays.copyOf(data, this.tail + 10);
        }

        this.data[tail++] = element;
    }

    public String remove() {
        if (this.tail == 0) {
            return null;
        }

        String result = this.data[0];

        for (int i = 0; i < tail - 1; i++) {
            this.data[i] = this.data[i + 1];
        }

        this.data[tail - 1] = null;
        this.tail--;
        return result;
    }

    @Override
    public String toString() {
        if (this.tail == 0) {
            return "[]";
        }

        StringBuilder result = new StringBuilder("[");
        int i = 0;

        while (i < this.tail - 1) {
            result.append(this.data[i]).append(", ");
            i++;
        }

        result.append(this.data[i]).append("]");
        return result.toString();
    }

    public Integer length() {
        return this.tail;
    }
}
