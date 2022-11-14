package com.learning;

public class Threads {

    public static void main(String[] args) {
        new Printer("first").run();
        new Printer("second").run();
    }
}

class Printer extends Thread {
    String name;

    Printer(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            System.out.println(name + " " + i);
        }
    }
}
