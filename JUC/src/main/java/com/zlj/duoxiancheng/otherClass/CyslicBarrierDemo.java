package com.zlj.duoxiancheng.otherClass;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * @Classname CyslicBarrierDemo
 * @Date 2020/8/6
 * @Created by 陈刀仔
 * @Description TODO
 */

public class CyslicBarrierDemo {
    public static void main(String[] args) {
        /**
         * 集齐7颗龙珠召唤神龙
         */
        // 召唤龙珠的线程
        CyclicBarrier cyclicBarrier = new CyclicBarrier(7, () -> {
            System.out.println("召唤神龙成功！");
        });

        for (int i = 1; i <= 7; i++) {
            final int temp = i;
            // lambda能操作到 i 吗
            new Thread(() -> {
                System.out.println(Thread.currentThread().getName() + " 收 集" + temp + "个龙珠");
                try {
                    cyclicBarrier.await(); // 等待
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (BrokenBarrierException e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }
}
