package zlj.basics.basic;

import org.junit.Test;

public class primeNumber {
    @Test
    public void fun(){
        //找出质数
        long start = System.currentTimeMillis();
        int f = 0;
        for (int i = 2; i <= 10000; i++) {
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    f = 1;
                    break;
                }
            }
            if (f == 0) {
                System.out.println(i);
            }
            f = 0;
        }
        long end = System.currentTimeMillis();
        System.out.println("All Time:" + (end - start));
//        System.out.println(0);
    }
}
