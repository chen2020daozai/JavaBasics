package zlj.hTestThread;

/**
 * 两个线程，分别输出100内的偶数和奇数
 *
 * @Classname MyException
 * @Date 2020/3/25 15:46
 * @Created by 陈刀仔
 * @Description TODO
 */

//class zljThread1 extends Thread {
//    @Override
//    public void run() {
//        for (int i = 0; i < 100; i++) {
//            if (i % 2 == 0) {
//                System.out.println("thread1     " + i);
//            }
//        }
//    }
//}

class zljThread2 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.println(Thread.currentThread().getName() + i);
            }
        }
    }
}

public class zljThreadDemo {
    public static void main(String[] args) {
//        zljThread1 zljThread1 = new zljThread1();

        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    if (i % 2 == 0) {
                        System.out.println("thread1     " + i);
                    }
                }
            }
        }.start();
        zljThread2 zljThread2 = new zljThread2();

//        zljThread1.start();
        zljThread2.start();
    }
}
