package com.learning;

import java.util.Arrays;

public class Deque<T> extends Queue<T> {

    public void insetAtBeg(T element) {
        if (isFull()) {
            data = Arrays.copyOf(data, this.data.length + 11);
        }
        this.tail++;

        for (int i = tail; i > 0; i--) {
            this.data[i] = this.data[i - 1];
        }
        this.data[0] = element;
    }

    public T removeFromEnd() throws Exception {
        if (isEmpty()) {
            throw new Exception();
        }

        T result = this.data[tail];

        this.tail--;
        return result;
    }

    public static void main(String[] args) throws Exception {
        Deque<Integer> dq = new Deque<>();
        dq.add(1);

        Integer name = dq.remove();
        System.out.println(name);
    }
}