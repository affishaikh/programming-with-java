package com.learning.threads;

import java.util.concurrent.CountDownLatch;

public class Task implements Runnable {

    private final String task;
    private final CountDownLatch countDownLatch;

    public Task(String task, CountDownLatch countDownLatch) {
        this.task = task;
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        System.out.printf("Starting task %s\n", this.task);
        try {
            Thread.sleep(5 * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.printf("Completed task %s\n", this.task);
        this.countDownLatch.countDown();
    }
}
