package zlj.testEnum;

/**自定义枚举类
 * @Classname MyException
 * @Date 2020/3/25 15:46
 * @Created by 陈刀仔
 * @Description TODO
 */

public class aSeasonTest {

}

//自定义枚举类
class season{
    //1.私有属性
    private final String seasonName;
    private final String seasonDesc;

    //2.私有构造器，不能被外界调用，因为不能对象数目确定
    private season(String name,String desc){
        this.seasonName=name;
        this.seasonDesc=desc;
    }

    //3.创建确定的对象
    public static final season SPRING=new season("春天","春暖花开");
    public static final season SUMMER=new season("夏天","夏日炎炎");
    public static final season AUTOMN=new season("秋天","秋高气爽");
    public static final season WINTER=new season("冬天","漫天飞雪");

    //4.set方法
    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }

    //5.toString方法
    @Override
    public String toString() {
        return "season{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
    }
}