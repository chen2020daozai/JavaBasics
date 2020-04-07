package ysu.zlj;

import org.junit.Test;

import javax.xml.namespace.QName;
import java.lang.annotation.ElementType;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Classname TestReflection
 * @Date 2020/4/6
 * @Created by 陈刀仔
 * @Description TODO
 */

public class TestReflection {

    /*
        不使用反射
    */
    @Test
    public void test1() {
        Person p = new Person("noRef", 19);

        p.age = 20;
        p.toString();
        p.show();
    }

    /*
     *   使用反射
     *
     * */
    @Test
    public void test2() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        Class pClass = Person.class;
        Constructor constructor = pClass.getConstructor(String.class, Integer.class);
        //通过反射创建对象
        Object p = constructor.newInstance("tom", 12);
        System.out.println(p);
        //通过反射调用属性
        Field age = pClass.getDeclaredField("age");
        age.set(p, 10);
        System.out.println(p);
        //通过反射调用方法
        Method show = pClass.getDeclaredMethod("show");
        show.invoke(p);

        System.out.println("**********************************************");
        /*
            反射调用私有属性、方法、构造器
        * */

        //构造器
        Constructor privateconstructor = pClass.getDeclaredConstructor(String.class);
        privateconstructor.setAccessible(true);
        Person jerry = (Person) privateconstructor.newInstance("jerry");
        System.out.println(jerry);

        //调用 私有属性
        Field name = pClass.getDeclaredField("name");
        //
        name.setAccessible(true);//保证当前属性可以修改
        name.set(jerry, "notjerry");
        System.out.println(jerry);

        //调用私有方法
        Method showNation = pClass.getDeclaredMethod("showNation", String.class);
        showNation.setAccessible(true);
        String o = (String) showNation.invoke(jerry, "中国");
        System.out.println(o);
    }

    /*
     * 2.Class实例对应一个运行时类
     * 3.运行时类运行时已经存在内存中，这只是获取
     */

    //获取Class的实例
    @Test
    public void test3() throws ClassNotFoundException {
        //1.
        Class<Person> class1 = Person.class;
        System.out.println(class1);
        ///2.
        Person person = new Person();
        Class<? extends Person> class2 = person.getClass();
        System.out.println(class2);
        //3.    使用频率最高
        Class<?> class3 = Class.forName("ysu.zlj.Person");
        System.out.println(class3);

        System.out.println(class1 == class2);//true
        System.out.println(class1 == class3);//true
    }

    @Test
    public void test4() {
        Class c1 = Object.class;
        Class c2 = Comparable.class;
        Class c3 = String[].class;
        Class c4 = int[][].class;
        Class c5 = ElementType.class;
        Class c6 = Override.class;
        Class c7 = int.class;
        Class c8 = void.class;
        Class c9 = Class.class;


        int[] a = new int[10];
        int[] b = new int[100];
        Class c10 = a.getClass();
        Class c11 = b.getClass();
        // 只要元素类型与维度一样，就是同一个Class
        System.out.println(c10==c11);
    }

    public static void main(String[] args) {

    }
}
