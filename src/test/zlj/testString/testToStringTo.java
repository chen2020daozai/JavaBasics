package zlj.testString;

import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * @Classname MyException
 * @Date 2020/3/25 15:46
 * @Created by 陈刀仔
 * @Description TODO
 */

public class testToStringTo {

    @Test
    /*
    String 与 byte[]转换
    字符串 转 字节（二进制数据）
     */
    public void test3() throws UnsupportedEncodingException {
        //UTF-8编码中一个汉字3个数
        String string = "zljhnb123中国";

        byte[] bytes=string.getBytes();
        System.out.println(Arrays.toString(bytes));

        //指定编码  gbk针对汉字的
        byte[] gbks = string.getBytes("gbk");
        System.out.println(Arrays.toString(gbks));

        System.out.println("——————————————————————");
        String string2 = new String(bytes);
        System.out.println(string2);
        //字符集不一致会有乱码
        String string3 = new String(gbks);
        System.out.println(string3);
        String string4 = new String(gbks,"gbk");
        System.out.println(string4);
    }


    @Test
    /*
    String 转char[]      调用toCahrArray()方法
    char[] 转String      调用String的构造器
     */
    public void test2() {
        String string = "zljhnb";

        char[] chars = string.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char aChar = chars[i];
            System.out.print("  " + aChar);
        }


        System.out.println();
        String string2 = new String(chars);
        System.out.println(string2);
    }


    @Test
// * String--->基本数据类型、包装类     调用包装类的静态方法: parseXxx(str)
// * 基本数据类型、包装类--->String     String类的静态方法valueOf(x)
    public void test1() {
        Integer a = 50;
        String s = String.valueOf(a);
        System.out.println(s);
        String string = a + "";//放在堆里
        System.out.println(string);

        int b = Integer.parseInt(s);
        System.out.println(b);
    }
}
