package zlj.basics.testThis;

/**
 * @Classname person
 * @Description TODO
 * @Date 2020/3/18 上午10:50
 * @Created by 陈刀仔
 */
public class testThis {
    public static void main(String[] args) {

    }
}

class person{
    int age;
    String name;

    public int getAge() {
        return age;
    }
//形参名称跟属性名称相同的时候需要用到this否则赋值不了
//    public void setAge(int age) {
//        age = age;
//    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}