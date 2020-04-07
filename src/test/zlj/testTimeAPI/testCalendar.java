package zlj.testTimeAPI;

import org.junit.Test;

import java.util.Calendar;
import java.util.Date;

/**
 * jdk1.8之前
 * Calendar
 *
 * @Classname MyException
 * @Date 2020/3/25 15:46
 * @Created by 陈刀仔
 * @Description TODO
 *
 * 1月是0，2月是1，12月是11
 * 周日是1，周一是6，周二是2，周六是7
 */

public class testCalendar {
    /*
        1、实例化
            创建子类的对象
            调用静态方法
     */

    @Test
    public void test() {
        Calendar calendar = Calendar.getInstance();

        //常用方法
        //get()
        int i = calendar.get(Calendar.DAY_OF_MONTH);//3.29
        System.out.println(i);
        System.out.println(calendar.get(Calendar.DAY_OF_YEAR));//89

        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
        calendar.add(Calendar.DAY_OF_WEEK,5);
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));


        //set()
        calendar.set(Calendar.DAY_OF_MONTH,11);//把今天设置成本月11号    3.11
        i=calendar.get(Calendar.DAY_OF_MONTH);//71
        System.out.println(i);
        System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
        //add()
        calendar.add(Calendar.DAY_OF_MONTH,5);//11+5    3.16
//        calendar.set(Calendar.DAY_OF_MONTH,-3);
        i=calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(i);//16
        //getTime()     日历--->Date
        Date date = calendar.getTime();
        //setTime()     Date--->日历
        Date date1 = new Date();//2020.3.29
        calendar.setTime(date1);
        int i1 = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(i1);//29
    }
}
