package com.learning.data_structures;

import java.util.Arrays;

public class Queue2 {
    private Integer[] data = new Integer[10];
    private Integer tail = 0;

    public void add(Integer element) {
        if (tail == data.length) {
            data = Arrays.copyOf(data, tail + 10);
        }

        this.data[tail++] = element;
    }

    public Integer remove() {
        Integer result = this.data[0];

        for (int i = 0; i < tail - 1; i++) {
            this.data[i] = this.data[i + 1];
        }

        if (this.tail != 0) {
            this.tail--;
        }
        this.data[tail] = null;
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
}
