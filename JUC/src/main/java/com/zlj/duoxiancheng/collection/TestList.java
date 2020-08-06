package com.zlj.duoxiancheng.collection;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @Classname TestList
 * @Date 2020/8/6
 * @Created by 陈刀仔
 * @Description TODO
 */

public class TestList {
    public static void main(String[] args) {
//        List list=new ArrayList();

//        List<Object> list = Collections.synchronizedList(new ArrayList<>());

        CopyOnWriteArrayList list = new CopyOnWriteArrayList();
        for (int i = 0; i < 50; i++) {
            new Thread(()->{
                list.add(UUID.randomUUID().toString().substring(0,5));
                System.out.println(list.size());
            },"i").start();
        }
    }
}
