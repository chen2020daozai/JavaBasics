package io;

import java.io.Serializable;

/**
 * @Classname Person
 * @Date 2020/4/4
 * @Created by 陈刀仔
 * @Description TODO
 *
 * 序列化要求
 * 1.实现Serializable标识接口
 * 2.类提供常量：序列版本号
 * 3.属性可以序列化（属性可能是自定义类的对象）
 */

public class Person implements Comparable, Serializable {

    //序列化机制中使用，可以在反序列化中判断是否是版本一致
    //识别这个类
    private static final long serialVersionUID=123456L;

    private Integer age;
    private String name;

    public Person() {

    }

    public Person(String name, Integer age) {
        this.age = age;
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    //重写equals()方法
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Person person = (Person) o;
//        return Objects.equals(age, person.age) &&
//                Objects.equals(name, person.name);
//    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(age, name);
//    }

    @Override
    /*
        自然排序方法
     */
    public int compareTo(Object o) {
        if (o instanceof Person) {
            int i = this.age.compareTo(((Person) o).age);
            return (i == 0) ? (this.name.compareTo(((Person) o).name)) : i;
        }
        return 0;
    }


}
