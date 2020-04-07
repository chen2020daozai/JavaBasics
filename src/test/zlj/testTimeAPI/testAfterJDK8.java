package zlj.testTimeAPI;

import org.junit.Test;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;

/**
 * @Classname MyException
 * @Date 2020/3/25 15:46
 * @Created by 陈刀仔
 * @Description TODO
 */

public class testAfterJDK8 {

//    @Test
//    public void test() {
//        //1.偏移量问题
////        Date date = new Date(2020, 9, 8);
//        Date date = new Date(2020 - 1900, 9 - 1, 8);
//        System.out.println(date);
//
//    }

    /*
        java8引引入java.time.API

        LocalDate   LocalTime   LocalDateTime
    */
    @Test
    public void test1() {
        //now()
        LocalTime localTime = LocalTime.now();
        LocalDate localDate = LocalDate.now();
        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println(localTime);
        System.out.println(localDate);
        System.out.println(localDateTime);

        //of()
        LocalDateTime localDateTime1 = LocalDateTime.of(2020, 3, 29, 17, 35, 12);
        System.out.println(localDateTime1);

        //getxxx()
        System.out.println(localDateTime.getDayOfWeek());
        System.out.println(localDateTime.getDayOfMonth());
        System.out.println(localDateTime.getDayOfYear());
        System.out.println(localDateTime.getMonth());//MARCH
        System.out.println(localDateTime.getMonthValue());//3
        System.out.println(localDateTime.getYear());
        //不可变性
        System.out.println("不可变性");
        System.out.println(localDateTime1);
        System.out.println(localDateTime.withHour(5));
        System.out.println(localDateTime1);

        System.out.println(localDateTime1);
        System.out.println(localDateTime.plusHours(5));
        System.out.println(localDateTime1);

        System.out.println(localDateTime1);
        System.out.println(localDateTime.minusHours(5));
        System.out.println(localDateTime1);


    }

    //inatant
    @Test
    public void test2(){
        Instant now = Instant.now();
        System.out.println(now);//伦敦时间

        //添加时间偏移量
        OffsetDateTime offsetDateTime = now.atOffset(ZoneOffset.ofHours(8));
        System.out.println(offsetDateTime);
        OffsetDateTime offsetDateTime1 = now.atOffset(ZoneOffset.UTC);
        System.out.println(offsetDateTime1);
        OffsetDateTime offsetDateTime2 = now.atOffset(ZoneOffset.MAX);
        System.out.println(offsetDateTime2);

        //自1970年1月1日0时0分0秒开始的毫秒数    1585485211500
        long epochMilli = now.toEpochMilli();
        System.out.println(epochMilli);

        //用毫秒数创建对象
        Instant instant = Instant.ofEpochMilli(Long.parseLong("1585485211500"));
        System.out.println(instant);
    }


    /*
        DateTimeFormatter
        格式化与解析
     */
    @Test
    public void test3(){
        //
        //
        //自定义方式
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
        String s = formatter.format(LocalDateTime.now());
        System.out.println(s);

        //解析    2020-03-29 08:46:22     注意格式必须是formatter定义的格式
        TemporalAccessor temporalAccessor = formatter.parse("2020-03-29 08:46:22");
        System.out.println(temporalAccessor);
    }
}
