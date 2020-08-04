package com.zlj.ProductorConsumer;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Classname ProductorConsumerTest
 * @Date 2020/8/4
 * @Created by 陈刀仔
 * @Description TODO
 */

public class ProductorConsumerJUC {
    public static void main(String[] args) {
        Data2 data2 = new Data2();

        new Thread(()->{
            for (int i = 0; i < 10; i++) {
                try {
                    data2.product();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"A").start();
        new Thread(()->{
            for (int i = 0; i < 10; i++) {
                try {
                    data2.consume();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"花B").start();
        new Thread(()->{
            for (int i = 0; i < 10; i++) {
                try {
                    data2.product();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"C").start();
        new Thread(()->{
            for (int i = 0; i < 10; i++) {
                try {
                    data2.consume();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"花D").start();
    }

}

class Data2 {
    int num = 0;

    Lock lock = new ReentrantLock();
    Condition condition = lock.newCondition();

    //生产
    public void product() throws InterruptedException {
        lock.lock();
        try {
            //避免虚假唤醒
            while (num != 0) {
                condition.await();
            }
            num++;//生产
            System.out.println(Thread.currentThread().getName() + "生产" + num);
            condition.signalAll();
        } finally {
            lock.unlock();
        }
    }

    //消费
    public void consume() throws InterruptedException {
        lock.lock();
        try {
            while (num == 0) {
                condition.await();
            }
            System.out.println(Thread.currentThread().getName() + "消费" + num);
            num--;//消费
            condition.signalAll();
        } finally {
            lock.unlock();
        }
    }
}