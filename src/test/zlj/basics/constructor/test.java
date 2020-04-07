package zlj.basics.constructor;

/**
 * @Classname test
 * @Description TODO
 * @Date 2020/3/17 下午9:07
 * @Created by 陈刀仔
 */
public class test {
    public static void main(String[] args) {
        person p1=new person();
        person p2=new person("zlj");
        System.out.println(p2.name);
    }
}

class person{
    int age;
    String name;
    public person(){};
    public person(String n){
        name=n;
    }
}