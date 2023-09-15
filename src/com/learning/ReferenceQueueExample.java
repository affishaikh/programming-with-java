package com.learning;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

public class ReferenceQueueExample {
    public static void main(String[] args) {
        Object obj = new Object();
        ReferenceQueue<Object> referenceQueue = new ReferenceQueue<>();

        WeakReference<Object> weakRef = new WeakReference<>(obj, referenceQueue);

        // Optional: You can use the reference queue to monitor the reference objects
        // and perform specific actions when they are enqueued.
        // In this example, we just print a message when the reference is enqueued.
        new Thread(() -> {
            try {
                while (true) {
                    java.lang.ref.Reference<?> ref = referenceQueue.remove();
                    System.out.println("Reference enqueued: " + ref);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }).start();

        // Clear the strong reference to the object
        obj = null;

        // Perform some other operations...

        // At this point, the object may become eligible for garbage collection
        // and the weak reference may be enqueued to the reference queue.
    }
}
