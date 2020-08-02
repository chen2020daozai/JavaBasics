package Utils.sort;

import org.junit.runner.manipulation.Sortable;
import org.junit.runner.manipulation.Sorter;

import java.util.Arrays;

/**
 * @Classname RadixSort
 * @Date 2020/7/27
 * @Created by 陈刀仔
 * @Description TODO
 */

public class RadixSort {

    public static void main(String[] args) {
        int[] array = { 19, 82, 137, 22, 5, 431, 23, 20, 11, 109 };
        RadixSort.sort(array);
        System.out.println("排序后数组：" + Arrays.toString(array));
    }

    public static void sort(int[] a) {
        int digit = 0;// 数组的最大位数
        for (int i : a) {
            // 获取数组中数的最大位数
            digit = Math.max(digit, String.valueOf(i).length());
        }
        int k = 0;// 用户记录排序数组的索引
        int m = 1;// 当前的位数，个位用1表示，十位用2表示，以此类推
        int n = 1;// 用来表示当前位数的整数倍
        int type = 10;// 将余数从0-9分为10种类型
        int[][] temp = new int[type][a.length];// 第一维用来存储余数，第二维用来存储余数对应的数组值
        int[] order = new int[type];// 用户第二维数组值得索引计数
        while (m <= digit) {
            // 遍历数组中的每个元素，以当前位数依据余数进行归类
            for (int i = 0; i < a.length; i++) {
                int r = (a[i] / n) % 10;// 当前数值在当前位数的余数
                temp[r][order[r]] = a[i];// 第一次为temp[r][0],第二次为temp[r][1]......
                order[r]++;
            }
            // 遍历二维数组的第一维
            for (int i = 0; i < type; i++) {
                if (order[i] != 0) {// 当order[i]==0时，说明order[r]++没有执行，temp[r][]中没有存储数组值
                    // 遍历二维数组的第二维
                    for (int j = 0; j < order[i]; j++) {// order[i]表示当前i余数的类型存储的数组值的个数
                        a[k] = temp[i][j];
                        k++;
                    }
                }
                order[i] = 0;
            }
            k = 0;// 排序数组索引初始化
            m++;// 当前位数个数的索引
            n *= 10;// 当前位数向前推
        }
    }

}

