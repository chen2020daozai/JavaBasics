package zlj.testString;

import org.junit.Test;

/**
 * @Classname MyException
 * @Date 2020/3/25 15:46
 * @Created by 陈刀仔
 * @Description TODO
 */

public class testString {

    @Test
    public void test2(){

    }

    @Test
    public void test1() {
/*
    在内存中创建了两个对象
    1、堆中new
    2、char[]对应常量池中的结构"abc"
 */
        String s=new String("abc");
        System.out.println(s);

        //string3 string4存储地址
        String str3 = "123";
        String str4 = new String("123");

        //string1 string2声明在字符串常量池中
        String string1 = "123";
        String string2 = "456";
/*
    不同拼接方式结果相同，底层不同

    常量与常量拼接是放在常量池
    只要有变量，就存在堆里
 */
        String string3 = "123456";
        String string4 = "123"+"456";
        String string5 = string1+"456";
        String string6 = "123"+string2;
        String string7 = string1+string2;
        String string10 = new String("123456");
        /*
        string5 string6 string7 string10构造的底层构造相同
         */
        final String string11 = "123";
        String string9 = string11+"456";
        System.out.println(string3==string4);//t
        System.out.println(string3==string5);//f
        System.out.println(string3==string6);//f
        System.out.println(string3==string7);//f
        System.out.println(string5==string6);//ff
        System.out.println(string3==string9);//t

        System.out.println(string3==string10);//f

        //把返回值在常量池中
        String string8 = string5.intern();
        System.out.println(string8==string3);//t
    }
}
