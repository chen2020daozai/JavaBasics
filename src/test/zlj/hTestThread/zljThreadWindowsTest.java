package zlj.hTestThread;

/**
 * 同步代码块解决线程不安全
 *
 * @Classname MyException
 * @Date 2020/3/25 15:46
 * @Created by 陈刀仔
 * @Description TODO
 */

class win extends Thread {
    //    private int tickte = 100;
    private static int tickte = 100;

    @Override
    public void run() {
        while (true) {
            //同步代码块解决线程不安全
            //类也是一个对象
            synchronized (win.class)
            {
                if (tickte > 0) {
                    System.out.println(Thread.currentThread().getName() + "卖票     " + tickte);
                    tickte--;
                } else break;
            }
        }
    }
}

public class zljThreadWindowsTest {

    public static void main(String[] args) {
//        win thread1 = new win();
//        win thread2 = new win();
//        win thread3 = new win();


        win thread4 = new win();
        win thread5 = new win();
        win thread6 = new win();


//        thread1.start();
//        thread2.start();
//        thread3.start();

        thread4.start();
        thread5.start();
        thread6.start();


    }

}
