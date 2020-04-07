package zlj.basics.testMulti;

/**
 * @Classname person
 * @Description TODO
 * @Date 2020/3/18 下午8:32
 * @Created by 陈刀仔
 */
public class person {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat(){
        System.out.println("吃");
    }

    public String toString(){
        return "重写toString方法";
    }
}