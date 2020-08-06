package com.zlj.duoxiancheng.collection;

import java.util.HashMap;
import java.util.Map;

/**
 * @Classname TestMap
 * @Date 2020/8/6
 * @Created by 陈刀仔
 * @Description TODO
 */

public class TestMap {
    public static void main(String[] args) {
        Map map=new HashMap();
        for (int i = 0; i < 1 << 30; i++) {
            map.put(i,i);
            System.out.println(map.size());
        }
        System.out.println(map.toString());
    }
}
