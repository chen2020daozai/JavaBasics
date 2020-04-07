package zlj.hTestThread;

/**
 * 2.同步方法
 *
 * @Classname MyException
 * @Date 2020/3/25 15:46
 * @Created by 陈刀仔
 * @Description TODO
 */

class win3 implements Runnable {

    private int tickte = 100;

    @Override
    public void run() {
        while (true) {
            show();
            if (tickte == 0) break;
        }
    }

    private synchronized void show() {
        if (tickte > 0) {
            System.out.println(Thread.currentThread().getName() + "卖票     " + tickte);
            tickte--;
        }
    }
}

public class zljThreadWindowsTest3 {

    public static void main(String[] args) {
        win3 win3 = new win3();

        Thread thread1 = new Thread(win3);
        Thread thread2 = new Thread(win3);
        Thread thread3 = new Thread(win3);

        thread1.start();
        thread2.start();
        thread3.start();


    }

}
