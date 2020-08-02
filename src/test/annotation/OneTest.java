package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * @Classname OneTest
 * @Date 2020/8/2
 * @Created by 陈刀仔
 * @Description TODO
 */

public class OneTest {

    @MyAnnotation(value = "zlj")
    public static void main(String[] args) throws CloneNotSupportedException {

        OneTest oneTest = new OneTest();
        OneTest oneTest2 = (OneTest) oneTest.clone();
    }

    @MyAnnotation(age = 3)
    public void method(){

    }

}

@Target(ElementType.METHOD)
@interface MyAnnotation {
    String value() default "";

    int age() default -1;

    int id() default -1;

    String[] school() default {"清华", "北大"};
}