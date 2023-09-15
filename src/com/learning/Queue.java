package com.learning;

import java.util.Arrays;

public class Queue<T> {

    protected T[] data = (T[]) new Object[10];
    protected Integer tail = -1;

    public void add(T element) {
        if (isFull()) {
            data = Arrays.copyOf(data, this.data.length + 11);
        }

        this.data[++tail] = element;
    }

    public T remove() throws Exception {
        if (isEmpty()) {
            throw new Exception();
        }

        T result = this.data[0];  //why to cast?/

        for (int i = 0; i < tail; i++) {
            this.data[i] = this.data[i + 1];
        }

        this.tail--;
        return result;
    }

    public Boolean isEmpty() {
        return this.tail.equals(-1);
    }

    public Boolean isFull() {
        return this.size() == data.length;
    }

    public Integer size() {
        return this.tail + 1;
    }

    public void swap() throws Exception {
        if (isEmpty()) {
            throw new Exception();
        }
        for (int i = 0; i < tail; i += 2) {
            T temp = this.data[i];
            this.data[i] = this.data[i + 1];
            this.data[i + 1] = temp;
        }
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return "[]";
        }

        StringBuilder result = new StringBuilder("[");
        int i = 0;

        while (i < this.tail) {
            result.append(this.data[i]).append(", ");
            i++;
        }

        result.append(this.data[i]).append("]");
        return result.toString();
    }

    public static void main(String[] args) throws Exception {
        Queue<String> q = new Queue<>();
    }
}