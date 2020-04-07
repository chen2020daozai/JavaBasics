package zlj.testTimeAPI;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * SimpleDateFormat
 *
 * @Classname MyException
 * @Date 2020/3/25 15:46
 * @Created by 陈刀仔
 * @Description TODO
 * <p>
 * 1、格式化日期      解析
 */

public class testSimpleDateFormat {

    public static void main(String[] args) throws ParseException {
        //使用默认构造器
        SimpleDateFormat format = new SimpleDateFormat();

        //格式化
        Date date = new Date();
        System.out.println(date);

        String string = format.format(date);
        System.out.println(string);

        //解析    可能有异常，string格式不识别
        Date date1 = format.parse(string);
        System.out.println(date1);

        //指定格式化模式format1.format
        SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss aaa");//2020-03-29 03:32:13 下午
        String s = format1.format(date);
        System.out.println(s);

        //解析format1.parse    注意s的格式必须跟format1的指定模式匹配
        Date date2 = format1.parse(s);
        System.out.println(date2);
    }

    /*
    一、字符串"2020-03-29 03:32:13"转成java.sql.date
     */
    @Test
    public void test() throws ParseException {

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String string = "2020-03-29 03:32:13";
        Date date = format.parse("2020-03-29 03:32:13");
        System.out.println(date.getTime());
        java.sql.Date date1 = new java.sql.Date(date.getTime());
        System.out.println(date1);
    }

    /*
    二、三天打鱼两天晒网  1990-01-01是第一天  给定一天看是打鱼还是晒网
     */

    @Test
    public void test1() throws ParseException {
        long d = 24 * 60 * 60 * 1000;
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String string = "1990-01-01";
        Date date = format.parse(string);
        long start = date.getTime() - d;
        String string1 = "1990-01-05";
        Date date2 = format.parse(string1);
        long numDay = (date2.getTime() - start) / d;
        if (numDay % 5 == 0 || numDay % 5 == 4) {
            System.out.println("晒网");
        } else System.out.println("打鱼");
    }
}
