package test;

import java.util.Map;
import java.util.TreeMap;

/**
 * @Classname User
 * @Date 2020/7/29
 * @Created by 陈刀仔
 * @Description TODO
 */

public class User {

    public static void main(String[] args) {
        Integer a[] = new Integer[10];
        int length = a.length;
        System.out.println(a[5]);

        Map<Integer, String> map = new TreeMap<>();
        map.put(5, "zlj");
        map.put(5, "zlj");
        map.put(4, "zlj");
        System.out.println(map);

        String s = "zlj";
        s.length();
    }

    String name;
    Integer age;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public User() {
    }

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
