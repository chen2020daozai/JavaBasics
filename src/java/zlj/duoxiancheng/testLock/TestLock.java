package zlj.duoxiancheng.testLock;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @Classname TestLock
 * @Date 2020/8/3
 * @Created by 陈刀仔
 * @Description TODO
 */

public class TestLock {
    public static void main(String[] args) {
        tLock t = new tLock();
        Thread tLock = new Thread(t);
        Thread tLock1 = new Thread(t);
        Thread tLock2 = new Thread(t);

        tLock.start();
        tLock1.start();
        tLock2.start();

    }
}

class tLock implements Runnable {
    private final ReentrantLock lock = new ReentrantLock();

    private int ticket = 10;

    @Override
    public void run() {
        while (true) {
            lock.lock();
            if (ticket > 0) {
                try {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "获得" + ticket--);
                } finally {
                    lock.unlock();
                }
            } else break;
        }
    }
}