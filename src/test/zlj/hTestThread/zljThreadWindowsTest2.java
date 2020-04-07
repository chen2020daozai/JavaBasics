package zlj.hTestThread;

/**
 * @Classname MyException
 * @Date 2020/3/25 15:46
 * @Created by 陈刀仔
 * @Description TODO
 */

class win2 extends Thread {

    private static int tickte = 100;

    @Override
    public void run() {
        while (true) {
            show();
            if (tickte == 0) break;
        }
    }

    /*
        同步监视器是win2.class
        必须是静态的

        非静态的方法的同步监视器是类的对象
        静态方法的同步监视器是类
     */
    private static synchronized void show() {
        if (tickte > 0) {
            System.out.println(Thread.currentThread().getName() + "卖票     " + tickte);
            tickte--;
        }
    }
}


public class zljThreadWindowsTest2 {

    public static void main(String[] args) {
//        win thread1 = new win();
//        win thread2 = new win();
//        win thread3 = new win();

        win2 thread4 = new win2();
        win2 thread5 = new win2();
        win2 thread6 = new win2();


//        thread1.start();
//        thread2.start();
//        thread3.start();

        thread4.start();
        thread5.start();
        thread6.start();

    }
}
