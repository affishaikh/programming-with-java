package com.learning.threads.distributed_system;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class TaskManager {
    private static final int NUM_THREADS = 4;
    private ExecutorService executor;

    public TaskManager() {
        executor = Executors.newFixedThreadPool(NUM_THREADS);
    }

    public void submitTask(Runnable task) {
        executor.submit(task);
    }

    public void shutdown() {
        executor.shutdown();
    }

    public void awaitTermination() throws InterruptedException {
        executor.awaitTermination(Long.MAX_VALUE, java.util.concurrent.TimeUnit.NANOSECONDS);
    }
}

class TaskProcessor implements Runnable {
    private int taskId;

    public TaskProcessor(int taskId) {
        this.taskId = taskId;
    }

    @Override
    public void run() {
        // Perform the processing logic for the task
        System.out.println("Task " + taskId + " started.");
        // ... Do the actual processing work here ...
        System.out.println("Task " + taskId + " completed.");
    }
}
