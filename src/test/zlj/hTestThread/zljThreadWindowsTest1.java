package zlj.hTestThread;

/**
 * @Classname MyException
 * @Date 2020/3/25 15:46
 * @Created by 陈刀仔
 * @Description TODO
 *
 * 出现重票、错票等线程安全问题
 *
 * 解决方法：同步方式
 *      1.同步代码块
 *
 *      synchronized(同步监视器){
 *          //需要同步的代码，操作共同数据
 *      }
 *      >同步监视器：锁，可以是任何一个对象(多个线程必须用同一个锁)
 *
 *      2.同步方法
 */

class win1 implements Runnable {

    //因为只有一个win1对象，所以直接是100，不是300
    private int tickte = 100;

    Integer i=0;

    @Override
    public void run() {
        while (true) {
            synchronized(i) {
                if (tickte > 0) {
                    System.out.println(Thread.currentThread().getName() + "卖票     " + tickte);
                    tickte--;
                } else break;
            }
        }
    }
}

public class zljThreadWindowsTest1 {

    public static void main(String[] args) {
        win1 win1 = new win1();

        Thread thread1 = new Thread(win1);
        Thread thread2 = new Thread(win1);
        Thread thread3 = new Thread(win1);

        thread1.start();
        thread2.start();
        thread3.start();


    }

}
