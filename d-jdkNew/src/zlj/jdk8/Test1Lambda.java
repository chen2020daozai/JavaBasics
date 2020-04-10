package zlj.jdk8;

import org.junit.Test;

import java.util.Comparator;

/**
 * @Classname Test1Lambda
 * @Date 2020/4/7
 * @Created by 陈刀仔
 * @Description TODO
 */

public class Test1Lambda {

    @Test
    public void test() {
        Comparator<Integer> comparator = new Comparator<>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1, o2);
            }
        };
        System.out.println(comparator.compare(5, 1));

        System.out.println("***********Lambda***********");

        //Lambda表达式
        Comparator<Integer> comparator1 = (o1, o2) -> Integer.compare(o1, o2);

        System.out.println(comparator1.compare(5, 1));

        //方法引用
        Comparator<Integer> comparator3 = Integer::compare;

    }

    public static void main(String[] args) {

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("普通run");
            }
        };
        runnable.run();

        System.out.println("***********Lambda***********");
        Runnable runnable1 = () -> System.out.println("Lambda的run");
        runnable1.run();
    }
}
