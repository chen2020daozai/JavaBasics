package test;

import java.util.Random;
import java.util.TreeSet;

/**
 * @Classname ManyNumbers
 * @Date 2020/7/27
 * @Created by 陈刀仔
 * @Description TODO
 *
 * tx的面试题：1亿个数中取前100个最大的数
 *
 * 利用TreeSet这个有序树，100之前随便放，100后要进行替换的话只需要对比树的第一个节点就可以知道该不该放
 *
 */
public class ManyNumbers {
    public static void main(String[] args) {
        top100();
    }
    private static void top100(){
        TreeSet<Integer> tree = new TreeSet<Integer>();
        int n = 100000000;
        int[] arr = new int[n];
        Random ran = new Random();
        long start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            arr[i] = ran.nextInt(n);
        }
        System.out.println(System.currentTimeMillis() - start);
        start = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            if (tree.size() < 100) {
                tree.add(arr[i]);
            } else if (tree.first() < arr[i]) {
                tree.remove(tree.first());
                tree.add(arr[i]);
            }
        }
        System.out.println(System.currentTimeMillis() - start);
        System.out.println(tree);
    }

}


