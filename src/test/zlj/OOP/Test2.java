package zlj.OOP;

/**
 * 已知有一个数列：f(0) = 1,f(1) = 4,f(n+2)=2*f(n+1) + f(n),其中n是大于0的整数，求f(10)的值。
 *
 * @Classname Test2
 * @Date 2020/4/3
 * @Created by 陈刀仔
 * @Description TODO
 */

public class Test2 {

    public static int method(int n) {
        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return 4;
        } else {
            return 2 * method(n - 1) + method(n - 2);
        }
    }

    public static void main(String[] args) {
        System.out.println(method(10));
        System.out.println(method(4));
    }
}
