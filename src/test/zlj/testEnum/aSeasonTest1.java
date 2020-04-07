package zlj.testEnum;

import static zlj.testEnum.Season1.SPRING;
import static zlj.testEnum.Season1.SUMMER;

/**
 * @Classname MyException
 * @Date 2020/3/25 15:46
 * @Created by 陈刀仔
 * @Description TODO
 * 1.tostring()方法
 * 2.values()
 * 3.valueOf(String objName)
 *
 * 实现接口方法
 */

public class aSeasonTest1 {

    public static void main(String[] args) {
        //1.tostring()方法
        System.out.println(SPRING);
        System.out.println(Season1.class.getClass());

        //2.values()
        System.out.println("values**********************");
        Season1[] values=Season1.values();
        for (int i = 0; i < values.length; i++) {
            Season1 value = values[i];
            System.out.println(value);

        }

        //3.valueOf(String objName)
        System.out.println("valueOf**********************");
        Season1 winter=Season1.valueOf("WINTER");
        System.out.println(winter);

        //4.实现接口方法
        SPRING.show();//SPRING对象实现接口的方法
        SUMMER.show();//枚举类的实现接口方法
    }
}

//实现接口
interface info{
    void show();
}

//enum关键字定义枚举类
enum Season1 implements info{
    //1.对象
    SPRING("春天","春暖花开"){
        @Override
        public void show() {
            System.out.println("SPRING对象实现接口的方法");
        }
    },
    SUMMER("夏天","夏日炎炎"),
    AUTOMN("秋天","秋高气爽"),
    WINTER("冬天","漫天飞雪");

    //2.属性
    private final String name;
    private final String desc;

    //3.构造器
    Season1(String name, String desc) {
        this.name=name;
        this.desc=desc;
    }

    //4.方法
    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }


    //5.不重写toString方法也行，会输出对象名
    @Override
    public String toString() {
        return "Season1{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }

    @Override
    public void show() {
        System.out.println("枚举类的实现接口方法");
    }
}
