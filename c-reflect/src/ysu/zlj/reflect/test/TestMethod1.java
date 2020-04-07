package ysu.zlj.reflect.test;

import org.junit.Test;
import ysu.zlj.reflect.definition.Person;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.TypeVariable;

/**了解
 * @Classname TestMethod1
 * @Date 2020/4/6
 * @Created by 陈刀仔
 * @Description TODO
 */


public class TestMethod1 {

    @Test
    public void test1() {
        Class<Person> aClass = Person.class;
        //获取父类子类public方法
        Method[] methods = aClass.getMethods();
        for (Method m :
                methods) {
            System.out.println(m);
        }

        System.out.println("************");
        //获取本类中的方法
        Method[] declaredMethods = aClass.getDeclaredMethods();
        for (Method m :
                declaredMethods) {
            System.out.println(m);
        }
    }

    @Test
    public void test2() {
        Class<Person> aClass = Person.class;

        Method[] declaredMethods = aClass.getDeclaredMethods();
        for (Method dm :
                declaredMethods) {
            //方法的注解
            Annotation[] annotations = dm.getAnnotations();
            for (Annotation an :
                    annotations) {
                System.out.println(an);
            }

            //方法的权限修饰符
            int modifiers = dm.getModifiers();
            System.out.print(Modifier.toString(modifiers) + " ");

            //方法返回值类型
            Class<?> returnType = dm.getReturnType();
            System.out.print(returnType + " ");

            //方法名
            String name = dm.getName();
            System.out.print(name + " (");


            //参数列表
//            TypeVariable<Method>[] typeParameters = dm.getTypeParameters();
            Class<?>[] Parameters = dm.getParameterTypes();

            if (!(Parameters == null && Parameters.length == 0)) {
                for (int i = 0; i < Parameters.length; i++) {
                    if (i == Parameters.length - 1) {
                        System.out.print(Parameters[i] + " " + Parameters[i].getName());
                    } else {
                        System.out.print(Parameters[i] + " " + Parameters[i].getName() + ",");
                    }
                }
            }
            System.out.print(" )");

            //6.异常
            Class<?>[] exceptionTypes = dm.getExceptionTypes();
            if (!(exceptionTypes!=null&&exceptionTypes.length==0)){
                System.out.print("throws ");
                for (int i = 0; i < exceptionTypes.length; i++) {
                    if (i==exceptionTypes.length-1){
                        System.out.print(exceptionTypes[i]);
                    }else {
                        System.out.print(exceptionTypes[i]+",");
                    }
                }
            }


            System.out.println();
            System.out.println("****");
        }
    }

    public static void main(String[] args) {

    }
}

