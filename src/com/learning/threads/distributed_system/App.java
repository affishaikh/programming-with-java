package com.learning.threads.distributed_system;

public class App {
    public static void main(String[] args) throws InterruptedException {
        TaskManager taskManager = new TaskManager();

        // Submit tasks to the task manager
        for (int i = 1; i <= 10; i++) {
            TaskProcessor task = new TaskProcessor(i);
            taskManager.submitTask(task);
        }

        // Wait for all tasks to complete
        taskManager.awaitTermination();

        // Shutdown the task manager
        taskManager.shutdown();
    }
}
