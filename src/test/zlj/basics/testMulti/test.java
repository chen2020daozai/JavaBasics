package zlj.basics.testMulti;

/**
 * @Classname test
 * @Description TODO
 * @Date 2020/3/18 下午8:35
 * @Created by 陈刀仔
 */
public class test {
    public static void main(String[] args) {
        person p=new person();
        p.eat();

        man m=new man();
        m.eat();

        zlj.basics.testMulti.woman w=new zlj.basics.testMulti.woman();
        w.eat();

        person pm=new man();
        pm.eat();
    }
}