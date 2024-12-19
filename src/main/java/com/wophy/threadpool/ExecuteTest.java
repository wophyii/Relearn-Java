package com.wophy.threadpool;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ExecuteTest {

    private static final ThreadPoolExecutor threadPoolExecutor =
            new ThreadPoolExecutor(10, 10, 0, TimeUnit.MINUTES, new ArrayBlockingQueue<>(5));

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            CountDownLatch countDownLatch = new CountDownLatch(6);
            for (int k = 0; k < 6; k++) {
                threadPoolExecutor.execute(()->{
                    System.out.println("任务执行中");
                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }finally {
                        countDownLatch.countDown();
                    }
                });

            }

            try {
                countDownLatch.await();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("任务执行完成");
        }

    }
}
