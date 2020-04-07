package zlj.basics.basic;

import org.junit.Test;

import java.util.Random;

public class selectsort {

    @Test
    public void selectsort() {
        int[] arr = new int[5];
        Random r = new Random(-10);
        for (int i = 0; i < 5; i++) {
            int rd = r.nextInt(50);
            arr[i] = rd;
            System.out.print(arr[i]+"  ");
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            int min = i;
            for (int j = i; j < 5; j++) {
                if (arr[j] < arr[min]) min = j;
            }
            if (min != i) {
                int t = arr[i];
                arr[i] = arr[min];
                arr[min] = t;
            }
            System.out.print(arr[i]+"  ");
        }
    }
}
