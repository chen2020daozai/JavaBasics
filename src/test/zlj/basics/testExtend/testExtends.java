package zlj.basics.testExtend;

/**
 * @Classname testExtends
 * @Description TODO
 * @Date 2020/3/18 下午4:02
 * @Created by 陈刀仔
 */
public class testExtends {

    public static void main(String[] args) {
        student stu=new student(22,"zlj");

        student stu1=new student(0);
        student stu2=new student();
        System.out.println("student stu=new student(22,\"zlj\"):"+stu.getName()+"："+stu.getAge());
        stu.eat();

        System.out.println("student stu1=new student(0);"+stu1.getName()+"："+stu1.getAge());
        System.out.println("student stu2=new student(0);"+stu2.getName()+"："+stu2.getAge());
    }
}