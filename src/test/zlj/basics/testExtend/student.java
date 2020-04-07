package zlj.basics.testExtend;

/**
 * @Classname test
 * @Description TODO
 * @Date 2020/3/18 下午3:57
 * @Created by 陈刀仔
 */
public class student extends person {
    int id = 2;

    public student() {
        super();
    }

    public student(int a) {
        super(100, "personName");
    }

    public student(int age, String name) {
        //不能这样使用
//        this.age = age;
//        this.name = name;
        this.setAge(age);
        this.setName(name);
    }

    public void eat() {
        System.out.println("多吃死胖子");

        System.out.println(id + " " + this.id + " " + super.id);

    }
}