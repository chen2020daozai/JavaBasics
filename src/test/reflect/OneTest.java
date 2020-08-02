package reflect;

/**
 * @Classname OneTest
 * @Date 2020/8/2
 * @Created by 陈刀仔
 * @Description TODO
 */

public class OneTest {
    public static void main(String[] args) throws ClassNotFoundException {
        Person p = new Person();
        Class<? extends Person> aClass = p.getClass();
        Class<?> aClass1 = Class.forName("reflect.Person");
        Class<Person> personClass = Person.class;

        //基本类型包装类有一个TYPE
        Class<Integer> type = Integer.TYPE;
    }
}

class Person{
    int age;
}
