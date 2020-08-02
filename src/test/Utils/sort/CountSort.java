package Utils.sort;

import java.util.Arrays;
import java.util.Random;

/**
 * @Classname CountSort
 * @Date 2020/7/27
 * @Created by 陈刀仔
 * @Description TODO
 */

public class CountSort {
    public static void main(String[] args) {
        long s=System.currentTimeMillis();
        int n = 100000;
        int[] arr = new int[n];
        Random ran = new Random();
        long start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            arr[i] = ran.nextInt(n);
        }
        CountingSort(arr);
        System.out.println(Arrays.toString(arr));
        long e=System.currentTimeMillis();
        System.out.println(e-s);

    }

    /**
     * 计数排序
     *
     * @param array
     * @return
     */
    public static int[] CountingSort(int[] array) {
        if (array.length == 0) return array;
        int bias, min = array[0], max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];
            if (array[i] < min)
                min = array[i];
        }
        bias = 0 - min;
        int[] bucket = new int[max - min + 1];
        Arrays.fill(bucket, 0);//初始化为0
        for (int i = 0; i < array.length; i++) {
            bucket[array[i] + bias]++;//每个位置数的个数
        }
        int index = 0, i = 0;
        while (index < array.length) {
            if (bucket[i] != 0) {
                //i从0开始，bukket[i]为0，代表
                array[index] = i - bias;
                bucket[i]--;
                index++;
            } else
                i++;
        }
        return array;
    }
}
