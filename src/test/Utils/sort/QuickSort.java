package Utils.sort;

import java.util.Arrays;
import java.util.Random;

/**
 * @Classname QuickSort
 * @Date 2020/7/27
 * @Created by 陈刀仔
 * @Description TODO
 */

public class QuickSort {
    public static void main(String[] args) {
        long s=System.currentTimeMillis();
        int n = 100000;
        int[] arr = new int[n];
        Random ran = new Random();
        long start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            arr[i] = ran.nextInt(n);
        }
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
        long e=System.currentTimeMillis();
        System.out.println(e-s);
    }

    public static void sort(int[] a, int l, int r) {
        if (r<=l)return;
        int i = l;
        int j = r;
        int temp = a[l];

        while (i!=j) {

            while (i < j && temp <= a[j]) {
                j--;
            }

            while (i < j && temp >= a[i]) {
                i++;
            }
            if (i<j) {
                int t = a[i];
                a[i] = a[j];
                a[j] = t;
            }
        }
        if (i == j) {
            int t = a[l];
            a[l] = a[i];
            a[i] = t;
            sort(a, l, i - 1);
            sort(a, i + 1, r);
        }

    }
}
