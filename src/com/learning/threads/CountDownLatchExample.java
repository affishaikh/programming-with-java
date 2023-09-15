package com.learning.threads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class CountDownLatchExample {

    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(5);
        List<Thread> workers = Stream
                .generate(() -> new Thread(new Runnable() {
                    @Override
                    public void run() {
                        System.out.println(Thread.currentThread().getName());
                        try {
                            Thread.sleep(10000L);
                            countDownLatch.countDown();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }))
                .limit(5)
                .collect(toList());
        workers.forEach(thread -> {
            thread.setDaemon(true);
            thread.start();
        });
        countDownLatch.await();
    }
}
