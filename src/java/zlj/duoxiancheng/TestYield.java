package zlj.duoxiancheng;

import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @Classname TestYield
 * @Date 2020/8/3
 * @Created by 陈刀仔
 * @Description TODO
 */

//线程礼让
public class TestYield {
    public static void main(String[] args) {
        MyYield myYield = new MyYield();
        new Thread(myYield,"a").start();
        new Thread(myYield,"b").start();


    }
}

class MyYield implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"开始");
        Thread.yield();
        System.out.println(Thread.currentThread().getName()+"jiesshu");
    }
}