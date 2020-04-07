package ysu.zlj;

import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.util.Random;

/**
 * @Classname TestNewInstance
 * @Date 2020/4/6
 * @Created by 陈刀仔
 * @Description TODO
 */

public class TestNewInstance {

    @Test
    public void test() throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        /*
        * newInstance():创建运行时类的对象
        * */
        Class<Person> aClass = Person.class;

        /*
            实际上调用空参构造器，所以
            1.要有空参构造器
            2.空参构造器访问权限足够
        */
        Person p = aClass.getDeclaredConstructor().newInstance();
        System.out.println(p);
    }

    //体会反射的动态性
    @Test
    public void test2() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        for (int i = 0; i < 100; i++) {
            int num = new Random().nextInt(3);
            switch (num){
                case 0:
                    System.out.println(randomNewInstance("java.lang.String").getDeclaredConstructor().newInstance());
                    break;
                case 1:
                    System.out.println(randomNewInstance("java.util.Date").getDeclaredConstructor().newInstance());
                    break;
                case 2:
                    System.out.println(randomNewInstance("java.lang.Object").getDeclaredConstructor().newInstance());
                    break;
            }
        }
    }

    public Class randomNewInstance(String classPath) throws ClassNotFoundException {
        Class<?> aClass = Class.forName(classPath);
        return aClass;
    }

    public static void main(String[] args) {

    }
}
