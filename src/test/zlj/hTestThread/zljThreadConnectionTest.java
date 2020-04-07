package zlj.hTestThread;

/**两个线程交替打印1-100
 * @Classname MyException
 * @Date 2020/3/25 15:46
 * @Created by 陈刀仔
 * @Description TODO
 */

class ConTest implements Runnable {

    private int num=1;

    @Override
    public void run() {
        while (num <= 100) {
            synchronized (this) {
                //唤醒其他线程,调用它的对象是this，如果notify的对象跟锁不是同一个对象，会报异常
                notify();

                if (num <= 100) {
                    System.out.println(Thread.currentThread().getName() + "  " + num);
                    num++;
                    if (num > 100)break;
                }


                //wait():阻塞当前线程，放弃当前线程持有的锁，给其他线程
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

public class zljThreadConnectionTest {
    public static void main(String[] args) {
        ConTest conTest = new ConTest();

        Thread thread = new Thread(conTest);
        Thread thread1 = new Thread(conTest);

        thread.setName("线程1");
        thread1.setName("线程2");

        thread.start();
        thread1.start();
    }
}
