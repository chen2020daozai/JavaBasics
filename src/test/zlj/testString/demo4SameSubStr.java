package zlj.testString;

import java.util.HashSet;
import java.util.Set;

/**找出两个字符串的最大相同子串(可能有多个相同长度的）
 * @Classname MyException
 * @Date 2020/3/25 15:46
 * @Created by 陈刀仔
 * @Description TODO
 */

public class demo4SameSubStr {

    public static void main(String[] args) {
        String string1 = "fiahvoihellojfhehvieaubuacnuhelleidjvneuhqfueinjkasdnvuhvahvuiheruibfvuisahvkjncuerubviaugvcuinviuhbveuaobuibnajkbvlavlleejaonovn";
        String string2 = "jfiohellevnheiivbaibcuehubfjlahvubejvkbalgvjfjshduahfjhfuewhvjnsakjlbvuebwvbeuihpvnackjhuiehfajskvniwehvoqflohellohello";
        Set set = SameSubStr(string1, string2);
        for (Object o :
                set) {
            System.out.println(o);
        }
    }

    public static Set SameSubStr(String str1, String str2) {
        long sta=System.currentTimeMillis();
        String maxStr = (str1.length() >= str2.length()) ? str1 : str2;
        String minStr = (str1.length() < str2.length()) ? str1 : str2;
        boolean ifone=true;
        int max=0;
        Set set=new HashSet();
        for (int i = minStr.length(); i > 0; i--) {
            if (i<max){
                break;
            }
            for (int j = 0; j < i; j++) {
                if (i-j>=max){
                    if (maxStr.contains(minStr.substring(j, i))&&(i-j)>=max) {
                        if (ifone){
                            max=i-j;
                            ifone=false;
                        }
                        set.add(minStr.substring(j, i));
                    }
                }
                else break;
            }
        }
        long end=System.currentTimeMillis();
        System.out.println(end-sta);
        return set;
    }
}
