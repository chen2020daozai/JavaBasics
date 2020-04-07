package zlj.basics.testExtend;

/**
 * @Classname person
 * @Description TODO
 * @Date 2020/3/18 下午3:58
 * @Created by 陈刀仔
 */
public class person {
    private int age=5;
    private String name;
    int id = 1;

    public person() {
    }

    public person(int id) {
        this.id = id;
    }

    public person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println("吃饭");
    }
}