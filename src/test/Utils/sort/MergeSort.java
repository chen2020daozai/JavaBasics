package Utils.sort;

import java.util.Arrays;

/**
 * @Classname MergeSort
 * @Date 2020/7/25
 * @Created by 陈刀仔
 * @Description TODO
 */

public class MergeSort {

    public static void main(String[] args) {
        int[] arr = new int[]{5, 7, 6, 9, 4, 2, 3, 8};
        System.out.println("原数组" + Arrays.toString(arr));
        mergeSort(arr, 0, arr.length - 1);
        System.out.println("排序后" + Arrays.toString(arr));
    }

    // 归并排序
    public static void mergeSort(int[] arr, int low, int high) {
        int middle = (high + low) / 2;
        if (low < high) {
            mergeSort(arr, low, middle);
            mergeSort(arr, middle + 1, high);
            // 两个数组被拆分完成,进行归并的操作
            merge(arr, low, middle, high);
        }
    }

    // 创造开始，中间，结束位置的变量，目的是把一个数组拆成两个
    public static void merge(int[] arr, int low, int middle, int high) {

        // 创造归并后的临时数组
        int[] temp = new int[high - low + 1];
        // 记录第一个数组需要遍历的下标
        int i = low;
        // 记录第二个数组需要遍历的下标
        int j = middle + 1;
        // 用于记录在临时数组中存放的下标
        int index = 0;
        // 遍历两个数组去除小弟数字，放入临时数组
        while (i <= middle && j <= high) {
            // 第一个数组的数更小
            if (arr[i] < arr[j]) {
                temp[index] = arr[i];
                // 下标后移
                i++;
                index++;
            } else {// 第二个数组更小
                temp[index] = arr[j];
                j++;
                index++;
            }
        }
        // 处理多余的数据（两个数组不等长，一方比完跳出循环）
        // 直接把剩余元素追加到数组之后
        while (j <= high) {
            temp[index] = arr[j];
            j++;
            index++;
        }

        while (i <= middle) {
            temp[index] = arr[i];
            i++;
            index++;
        }

        // 把临时数组赋给原数组
        for (int n = 0; n < temp.length; n++) {
            arr[n + low] = temp[n];
        }
    }

}






