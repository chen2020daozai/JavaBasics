package zlj.testString;

/**获取一个字符串在另一个字符串中出现的次数
 * @Classname MyException
 * @Date 2020/3/25 15:46
 * @Created by 陈刀仔
 * @Description TODO
 */

public class demo2 {
    public static void main(String[] args) {
        String string1 = "aaaaa";
        String string2 = "aaa";
        System.out.println(numS(string1,string2));
    }

    public static int numS(String s1,String s2){
        //这样做可以保证不遗漏    如："aaaa"中有两个"aaa"
        if (s1.length()<s2.length()){
            int out=0;
            while (s1.length()>=s2.length()){
                if (s1.startsWith(s2)){
                    out++;
                }
                s1=s1.substring(1);

            }
            return out;
        }else return 0;

    }
}
