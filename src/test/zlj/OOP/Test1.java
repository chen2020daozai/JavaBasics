package zlj.OOP;

/**
 * @Classname n
 * @Date 2020/4/3
 * @Created by 陈刀仔
 * @Description TODO
 */

public class Test1 {

    public static int sum(int m) {
        if (m == 1) {
            return 1;
        } else {
            return m * sum(m - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(sum(5));
    }
}
