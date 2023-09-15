package com.learning.threads;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.CountDownLatch;

public class DistributedProcessor {

    public static void main(String[] args) throws InterruptedException {
        final Queue<Task> queue = new LinkedList<>();

        CountDownLatch countDownLatch = new CountDownLatch(4);

        queue.add(new Task("1", countDownLatch));
        queue.add(new Task("2", countDownLatch));
        queue.add(new Task("3", countDownLatch));
        queue.add(new Task("4", countDownLatch));
        queue.add(new Task("5", countDownLatch));
        queue.add(new Task("6", countDownLatch));

        while (queue.size() > 0) {
            Task taskToBeExecuted = queue.remove();
            Thread thread = new Thread(taskToBeExecuted);
            thread.setDaemon(true);
            thread.start();
        }
        countDownLatch.await();
    }
}
