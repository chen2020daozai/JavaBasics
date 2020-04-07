package zlj.testString;

/**模拟trim()方法
 * @Classname MyException
 * @Date 2020/3/25 15:46
 * @Created by 陈刀仔
 * @Description TODO
 */

public class demo1 {
    public static void main(String[] args) {
        String string0 = "  fkajfkjrio vjioaj  ";
        System.out.println(string0);
        System.out.println(sub(string0));
    }

    //模拟trim()方法
    public static String sub(String s) {
        int numl = 0;
        int numr = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                numl++;
            } else {
                break;
            }
        }
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                numr++;
            } else {
                break;
            }
        }
        String string = s.substring(numl, s.length()-numr);
        return string;
    }
}
