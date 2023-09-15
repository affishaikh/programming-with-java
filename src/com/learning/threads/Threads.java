package com.learning.threads;

public class Threads {

    public static void main(String[] args) {
        System.out.printf("starting on %s \n", Thread.currentThread().getName());
        new Thread(new Printer("first")).start();
        System.out.printf("continuing on %s \n", Thread.currentThread().getName());
        new Thread(new Printer("second")).start();
        System.out.printf("ending on %s \n", Thread.currentThread().getName());
    }
}

class Printer implements Runnable {
    String name;

    Printer(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            System.out.printf("%s %s %d \n", Thread.currentThread().getName(), this.name, i);
        }
    }
}
