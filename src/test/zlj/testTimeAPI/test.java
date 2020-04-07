package zlj.testTimeAPI;

import org.junit.Test;

import java.util.Date;

/**
 * @Classname MyException
 * @Date 2020/3/25 15:46
 * @Created by 陈刀仔
 * @Description TODO
 */

public class test {

    @Test
    public void test1(){
        System.out.println(System.currentTimeMillis());
    }

    /*
    java.util.Data类
    |-----java.sql.Data类

    1.两个构造器的使用
        new Date();
        指定毫秒数的new Date();
    2.两个方法的使用
        toString()方法
        getTime()方法

    java.sql.Data类
        多数用于数据库
        把java.sql.Date的对象转成java.util.Date对象
     */
    @Test
    public void test2(){
        Date date = new Date();
        System.out.println(date.toString());//Sat Mar 28 18:46:14 CST 2020
        System.out.println(date.getTime());//1585392374278      时间戳

        Date date1 = new Date(1585392374278L);
        System.out.println(date1);//Sat Mar 28 18:46:14 CST 2020

        //java.sql.Data类
        java.sql.Date date2 = new java.sql.Date(1585392374278L);
        System.out.println(date2);

        //把java.sql.Date的对象转成java.util.Date对象
        //情况一：new子类的对象，赋给父类，这个父类的声明可以强转成子类对象
        Date date3 = new java.sql.Date(1585392374278L);
        java.sql.Date date4= (java.sql.Date) date3;
        //情况二：
        java.sql.Date date5 = new java.sql.Date(date.getTime());
        System.out.println(date5);
    }
}
