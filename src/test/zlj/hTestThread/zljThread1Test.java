package zlj.hTestThread;

/**
 * 方式一：继承Thread()类
 *
 * @Classname MyException
 * @Date 2020/3/25 15:46
 * @Created by 陈刀仔
 * @Description TODO
 * <p>
 * 1)  定义子类继承Thread类。
 * 2)  子类中重写Thread类中的run方法。
 * 3)  创建Thread子类对象，即创建了线程对象。
 * 4)  调用线程对象start方法：启动线程，调用run方法
 */

//1)  定义子类继承Thread类。
class zThread extends Thread {
    //2)  子类中重写Thread类中的run方法。
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println("继承Thread类   " + i);
            }
        }
    }
}

//二     实现Runnable()接口
class zThread1 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.println("实现Runnable接口    " + i);
            }
        }
    }
}


public class zljThread1Test {
    public static void main(String[] args) {
        zThread zThread = new zThread();

        //二  2  构造器方式  以Runnable的实现类的对象为参数创建线程
        zThread1 zThread1 = new zThread1();
        Thread thread = new Thread(zThread1);

        zThread.start();
        thread.start();

        for (int i = 0; i < 100; i++) {
            System.out.println("main    " + i);
        }
    }
}
