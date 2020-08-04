package thread;

/**
 * @Classname TestThread1
 * @Date 2020/8/2
 * @Created by 陈刀仔
 * @Description TODO
 */

public class TestThread1 {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
    }
}

class MyThread extends Thread{
    @Override
    public void run() {
        //重写run方法
        super.run();
        System.out.println("线程开始");
    }
}