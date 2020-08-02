package reflect;

import java.lang.annotation.*;
import java.lang.reflect.Method;

/**
 * @Classname Test12
 * @Date 2020/8/2
 * @Created by 陈刀仔
 * @Description TODO
 */

@MyAnnotation("zlj")
public class Test12 {
    @MyAnnotation
    public void method(){

    }

    public static void main(String[] args) throws NoSuchMethodException, ClassNotFoundException {
        Class<?> c = Class.forName("reflect.Test12");
        Method method = c.getDeclaredMethod("method");
        Annotation[] annotations1 = c.getAnnotations();
        for (Annotation annotation : annotations1) {
            System.out.println(annotation);
        }

        MyAnnotation annotation = c.getAnnotation(MyAnnotation.class);
        System.out.println(annotation.value());

    }
}
@Target({ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation {
    String value() default "";

    int age() default -1;

    int id() default -1;

    String[] school() default {"清华", "北大"};
}