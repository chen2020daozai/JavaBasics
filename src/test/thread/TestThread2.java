package thread;

import java.util.*;

/**
 * @Classname TwoClass
 * @Date 2020/8/2
 * @Created by 陈刀仔
 * @Description TODO
 */

public class TestThread2 {

    public static void main(String[] args) {

        List list = new ArrayList();
        list.add("zlj");
        list.add("hfieowj");
        list.add("zlj");
        list.add("iiiiiiij");
        for (Object o : list) {
            System.out.println(o.toString());
        }
        Object[] objects = list.toArray();
        for (Object o : objects) {
            System.out.println(o.toString());
        }
        List<Object> objects1 = Arrays.asList(objects);

        MyThread2 my=new MyThread2();
        my.run();
        Thread thread = new Thread(my);
        thread.start();
    }
}

class MyThread2 implements Runnable{

    @Override
    public void run() {
        System.out.println("多线程");
    }
}


