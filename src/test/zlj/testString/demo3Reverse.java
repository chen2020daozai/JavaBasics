package zlj.testString;

import org.junit.Test;

/**
 * 给定区间字符串反转
 *
 * @Classname MyException
 * @Date 2020/3/25 15:46
 * @Created by 陈刀仔
 * @Description TODO
 */

public class demo3Reverse {


    public String reverse(String s, int start, int end) {
        char[] chars = s.toCharArray();
        if (s != null) {
            for (int i = start, j = end; i < j; i++, j--) {
                char t = chars[i];
                chars[i] = chars[j];
                chars[j] = t;
            }
            return new String(chars);
        }

        return null;
    }

    //方式二
    public StringBuilder reverse1(String s, int start, int end) {
        if (s != null) {
            StringBuilder builder = new StringBuilder(s.length());
            builder.append(s, 0, start);
            for (int i = end; i >= start; i--) {
                builder.append(s.charAt(i));
            }
            if (end < s.length()) {
                builder.append(s, end + 1, s.length());
            }
            return builder;
        }
        return null;
    }

    @Test
    public void test0() {
        String string = "abcdefg";
        long starttime=System.currentTimeMillis();
        String reverse = reverse(string, 2, 5);
        long endtime=System.currentTimeMillis();
        System.out.println(reverse);
        System.out.println("用时："+(endtime-starttime));
        starttime=System.currentTimeMillis();
        StringBuilder builder = reverse1(string, 2, 5);
        endtime=System.currentTimeMillis();
        System.out.println(builder);
        System.out.println("用时："+(endtime-starttime));
    }
}
