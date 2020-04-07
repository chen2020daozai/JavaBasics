package ysu.zlj.reflect.test;

import org.junit.Test;
import ysu.zlj.reflect.definition.Person;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * @Classname TestOther
 * @Date 2020/4/6
 * @Created by 陈刀仔
 * @Description TODO
 *
 * aClass.getContructors()
 * aClass.getDeclaredContructors()
 *
 * aClass.getSuperclass
 *
 * 获取运行时类的接口
 * aClass.getInterface
 * aClass.getSuperclass.getInterface
 * 获取运行时类所在的包
 * aClass.getPackage()
 * 获取运行时类的注解
 * aClass.getAnnotations()
 *
 */

public class TestOther {

    //获取运行时类 的 带泛型的父类的泛型
    @Test
    public void test1(){
        Class<Person> aClass = Person.class;
        Type genericSuperclass = aClass.getGenericSuperclass();
        ParameterizedType type= (ParameterizedType) genericSuperclass;
        //获取泛型
        Type[] actualTypeArguments = type.getActualTypeArguments();
        for (Type ty :
                actualTypeArguments) {
            System.out.println(ty);
            System.out.println(ty.getTypeName());
        }
    }

    public static void main(String[] args) {

    }
}
