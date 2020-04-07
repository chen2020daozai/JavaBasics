package ysu.zlj.reflect.test;

import org.junit.Test;
import ysu.zlj.reflect.definition.Person;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * @Classname TestField
 * @Date 2020/4/6
 * @Created by 陈刀仔
 * @Description TODO
 */

public class TestField {

    @Test
    public void test1() {
        Class<Person> aClass = Person.class;

        /*结果是
        * public int ysu.zlj.reflect.definition.Person.id
          public java.lang.String ysu.zlj.reflect.definition.Generate.kind
          * 1.本类和父类中public属性
        */
        Field[] fields = aClass.getFields();
        for (Object o :
                fields) {
            System.out.println(o);
        }
        System.out.println("**********************************");
        /*
         * 2.返回本类中所有属性
         * */
        Field[] fields1 = aClass.getDeclaredFields();
        for (Object o :
                fields1) {
            System.out.println(o);
        }
    }

    //权限修饰符 数据类型 变量名
    //本类
    @Test
    public void test2() {
        Class<Person> bClass = Person.class;
        Method[] methods = bClass.getDeclaredMethods();
        Field[] fields = bClass.getDeclaredFields();
        for (Field f :
                fields) {
            //权限修饰符
            int modifiers = f.getModifiers();
            System.out.println(modifiers);
            System.out.println(Modifier.toString(modifiers));

            //数据类型
            Class<?> type = f.getType();
            System.out.println(type);

            //变量名
            String name = f.getName();
            System.out.println(name);
            System.out.println("**");
        }

    }

    public static void main(String[] args) {

    }
}
