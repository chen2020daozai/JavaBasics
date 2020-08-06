package com.zlj.duoxiancheng.eightQ;

/**
 * @Classname Test1
 * @Date 2020/8/4
 * @Created by 陈刀仔
 * @Description TODO
 */

public class Test1 {
    public static void main(String[] args) {
        t2 t = new t2();

        new Thread(()->{
            t.call();
        }).start();
    }

    public static void t3(){

    }
}

class t2{

    public static synchronized void call(){
        com.zlj.test.Test1 test1 = new com.zlj.test.Test1();

        System.out.println("打电话");
    }
}
