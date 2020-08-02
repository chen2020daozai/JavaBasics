package Utils.sort;

import java.util.Arrays;

/**
 * @Classname HeapTest
 * @Date 2020/7/27
 * @Created by 陈刀仔
 * @Description TODO
 *
 * 堆排序
 *
 * 2019年2月16日
 */
public class HeapTest {

    public static void main(String[] args) {

        int[] arr = new int[] { 9, 6, 8, 7, 0, 1, 10, 4, 2 };
        heapSort(arr);

        System.out.println("堆排序结果：    " + Arrays.toString(arr));

    }

    // 堆排序
    public static void heapSort(int[] arr) {

        // 第一步：堆调整为大顶堆的方式
        // 开始的位置是最后一个叶子节点的父节点
        int start = (arr.length - 1) / 2;
        // 通过循环才可以全部查看调整
        for (int i = start; i >= 0; i--) {
            maxHeap(arr, arr.length, i);
        }
        System.out.println("调整为大顶堆：" + Arrays.toString(arr));

        // 第二步：把堆顶固定到末尾，递归
        for (int i = arr.length - 1; i > 0; i--) {
            // 交换，固定最大数
            int x = arr[0];
            arr[0] = arr[i];
            arr[i] = x;
            // 递归，把剩余重新排序
            // 父节点从零开始
            maxHeap(arr, i, 0);
        }
    }


    /**
     * 调整为大顶堆的方法
     *  arr为调整的堆
     *  length为长度
     *  parent为当前父节点
     */
    public static void maxHeap(int[] arr, int length, int parent) {

        // 取出它的左右子节点,根据顺序存储的二叉树
        int leftNode = 2 * parent + 1;
        int rightNode = 2 * parent + 2;

        int max = parent;
        // 找出最大
        if (leftNode < length && arr[leftNode] > arr[max]) {
            max = leftNode;
        }
        if (rightNode < length && arr[rightNode] > arr[max]) {
            max = rightNode;
        }
        // 交换变量
        int temp;
        // 如果最大值变化，代表需要移动
        if (max != parent) {
            temp = arr[max];
            arr[max] = arr[parent];
            arr[parent] = temp;
            // 交换之后，可能会破坏原来的顺序，需要继续向下查看
            maxHeap(arr, length, max);
        }
    }
}


