package zlj.generic;

import zlj.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * 1、泛型在继承方面的表现
 * @Classname TestGeneric2
 * @Date 2020/4/2
 * @Created by 陈刀仔
 * @Description TODO
 */

class testT{
    public void show1(List<Object> list){

    }

    public void show2(List<String> list){

    }
}

class Student extends Person{

}

public class TestGeneric2 {
    public static void main(String[] args) {
        //具有子父类关系，可以赋值
        Object o=null;
        String s=null;
        o=s;

        //不具有子父类关系，不可以赋值
        //这个类型指的是元素的类型，对象都是List
        List<Object> list=null;
        List<String> list1=null;

        //具有子父类关系，可以赋值
        List<String> list2=null;
        ArrayList<String> list3=null;

        //-------------------通配符："?"
        List<Object> list4=null;
        List<String> list5=null;
        list5.add("AA");
        list5.add("BB");
        list5.add("CC");

        List<?> list6=null;

        list6=list4;
        list6=list5;

        //写入：不能添加除了null
//        list6.add("ss");
        list6.add(null);

        //读取：
        Object o1=list6.get(0);
        System.out.println(o1);


        /*
        * 有限制的通配符
        * */

        List<? extends Person> list7=null;
        List<? super Person> list8=null;

        List<Object> list9=null;
        List<Person> list10=null;
        List<Student> list11=null;

//        list7=list9;
        list7=list10;
        list7=list11;

        list8=list9;
        list8=list10;
//        list8=list11;
        
        list8.add(new Person());
        list8.add(new Student());

        //读取：<?>相当于任何类型，这个都可以读取，那么所有都可以读取
        //写入：list7是所有小于等于Person的类型，所以可能是最小的类型，就不能把任何一个值赋给list7
        //    ：list8是所有大于等于Person的类型，可以把所有小于等于Person的类型的对象赋给list8

    }
}
