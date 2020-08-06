package com.zlj.duoxiancheng;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @Classname TestCallable
 * @Date 2020/8/6
 * @Created by 陈刀仔
 * @Description TODO
 */

public class TestCallable {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MyThread myThread = new MyThread();
        FutureTask<String> task = new FutureTask<>(myThread);
        new Thread(task).start();
        new Thread(task).start();//结果会被缓存，
        /*
        * get方法可能产生阻塞，需要拿结果
        * */
        String s = task.get();
        System.out.println(s);
    }
}

class MyThread implements Callable<String>{

    @Override
    public String call() throws Exception {
        System.out.println("call");
        return null;
    }
}
