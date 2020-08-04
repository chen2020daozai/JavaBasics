package com.zlj.test;

import java.util.concurrent.TimeUnit;

/**
 * @Classname Test1
 * @Date 2020/8/3
 * @Created by 陈刀仔
 * @Description TODO
 */

public class Test1 {
    public static void main(String[] args) throws InterruptedException {
        // 获取cpu的核数
        // CPU 密集型，IO密集型
        System.out.println(Runtime.getRuntime().availableProcessors());


    }
}
