package com.learning;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

public class References {

    public static void main(String[] args) throws InterruptedException {
        String hello_world = "Hello world";
        ReferenceQueue<String> queue = new ReferenceQueue<>();
        WeakReference<String> wf = new WeakReference<>(hello_world, queue);

        System.gc();
        queue.poll();

        boolean stop = false;
        while (!stop) {
            String greeting = wf.get();

            if (greeting == null) {
                stop = true;
                System.out.println("Object collected by gc");
            } else {
                System.out.println("Object was not collected by gc");
                System.out.println(greeting);
                Thread.sleep(1000L);
            }
        }
    }
}
