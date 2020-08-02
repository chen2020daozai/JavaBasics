package Utils.sort;

import java.util.Arrays;

/**
 * @Classname ShellSort
 * @Date 2020/7/25
 * @Created by 陈刀仔
 * @Description TODO
 */

/**
 * 希尔排序：大的数组划分为多个小的部分，每个部分按照插入排序
 * 拆分的原则是：刚开始两部分，步长为总长除以二
 * 之后步长不断除以二
 * 2019年2月10日
 */
public class ShellSort {


    public static void main(String[] args) {

        int[] arr = new int[]{5, 8, 3, 9, 7, 6, 4, 0, 2, 1};
        shellSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    //希尔排序
    public static void shellSort(int[] arr) {

        //挨个遍历步长，缩短步长，直到步长为零
        for (int d = arr.length / 2; d > 0; d = d / 2) {
            //遍历所有的元素   d之后的，因为是j和j-d比较
            for (int i = d; i < arr.length; i++) {
                //遍历本组中所有的元素,从第一个元素开始
                for (int j = i - d; j >= 0; j -= d) {
                    //j=j-d本组前面的那个元素    前面再有就继续
                    //如果当前元素大于加上步长之后的那个元素,（前面的比后面的大了）交换
                    if (arr[j] > arr[j + d]) {
                        int temp = arr[j];
                        arr[j] = arr[j + d];
                        arr[j + d] = temp;
                    }
                }
            }
        }
    }

}



