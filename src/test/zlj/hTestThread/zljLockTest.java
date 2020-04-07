package zlj.hTestThread;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Lock
 *
 * @Classname MyException
 * @Date 2020/3/25 15:46
 * @Created by 陈刀仔
 * @Description TODO
 */

class LockTest implements Runnable {

    private int tickte = 100;
    private ReentrantLock lock = new ReentrantLock(true);

    @Override
    public void run() {
        while (true) {
            try {

                lock.lock();

                if (tickte > 0) {
                    System.out.println(Thread.currentThread().getName() + "卖票     " + tickte);
                    tickte--;
                } else break;
            } finally {
                lock.unlock();
            }
        }
    }
}


public class zljLockTest {
    public static void main(String[] args) {
        LockTest Thread = new LockTest();

        Thread thread1 = new Thread(Thread);
        Thread thread2 = new Thread(Thread);
        Thread thread3 = new Thread(Thread);

        thread1.setName("窗口1");
        thread2.setName("窗口2");
        thread3.setName("窗口3");

        thread1.start();
        thread2.start();
        thread3.start();
    }

}
