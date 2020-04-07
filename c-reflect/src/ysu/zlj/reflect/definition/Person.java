package ysu.zlj.reflect.definition;

/**
 * @Classname Person
 * @Date 2020/4/6
 * @Created by 陈刀仔
 * @Description TODO
 */

@MyAnnotation
public class Person extends Generate<String> implements MyInterface,Comparable<String> {

    private String name;
    int age;
    public int id;

    public Person() {
    }

    @MyAnnotation(value = "修饰构造器")
    public Person(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private void show(String nation){
        System.out.println("我是一个"+nation+"人");
    }

    @MyAnnotation(value = "修饰方法")
    public String display(String interest){
        return interest;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }

    public static void main(String[] args) {

    }

    @Override
    public int compareTo(String o) {
        return 0;
    }

    @Override
    public void info() {
        System.out.println("实现自定义接口");
    }
}
