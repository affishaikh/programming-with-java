package com.learning.threads;

public class ThreadManager {

    private final Integer count;
    private Integer availableThreads;

    public ThreadManager(Integer count) {
        this.count = count;
        this.availableThreads = count;
    }

    public void free() {
        if (this.availableThreads < this.count) {
            this.availableThreads++;
        }
    }

    public void occupy() {
        this.availableThreads--;
    }

    public Integer availableThreads() {
        return availableThreads;
    }

}
