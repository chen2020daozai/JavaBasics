package zlj.testString;

/**
 * @Classname MyException
 * @Date 2020/3/25 15:46
 * @Created by 陈刀仔
 * @Description TODO
 */

public class StringBuilderDebug {

    public static void main(String[] args) {
        System.out.println((int)(Math.random()*10));

        String string = null;

        StringBuilder builder1=new StringBuilder();
        builder1.append(string);
        System.out.println(builder1);//"null"
        System.out.println(builder1.length());//4

        StringBuilder builder2=new StringBuilder(string);//java.lang.NullPointerException
        System.out.println(builder2);

    }
}
