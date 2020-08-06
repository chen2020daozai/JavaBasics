package com.zlj.duoxiancheng.otherClass;

import java.util.concurrent.CountDownLatch;

/**
 * @Classname CountDownLanch
 * @Date 2020/8/6
 * @Created by 陈刀仔
 * @Description TODO
 */

public class CountDownLatchTest {
    public static void main(String[] args) throws InterruptedException {
        // 总数是6，必须要执行任务的时候，再使用！
        CountDownLatch countDownLatch = new CountDownLatch(6);


        for (int i = 1; i <= 6; i++) {
            new Thread(() -> {
                System.out.println(Thread.currentThread().getName() + " Go out");
                countDownLatch.countDown(); // 数量-1
            }, String.valueOf(i)).start();
        }

        countDownLatch.await(); // 等待计数器归零，然后再向下执行

        System.out.println("Close Door");
    }
}
