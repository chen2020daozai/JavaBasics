package zlj.testString;

/**
 * @Classname MyException
 * @Date 2020/3/25 15:46
 * @Created by 陈刀仔
 * @Description TODO
 * <p>
 *     常用
 * int length()
 * char charAt(int index）
 * boolean isEmpty()
 * String toUpperCase()
 * String toLowerCase()
 * String trim()    返回字符串的副本，忽略前导空白和尾部空白
 * boolean equals(Object obj)     比较字符串是否相同
 * boolean equalsIgnoreCase(Object obj)     比较字符串是否相同，忽略大小写
 * String concat(String str)        拼接字符串
 * int compareTo(String anotherString)      比较字符串大小
 * String substring(int baginIndex)     截取字符串
 * String substring(int beginIndex,int endIndex)
 *
 * boolean endsWith(String suffix)      是否以指定后缀结束
 * boolean startsWith(String prefix)    是否以指定前缀开始
 * boolean startsWith(String prefix, int toffset)    从指定位置开始的子字符串是否以指定前缀开始
 *
 * boolean contains(charSequences s)    是否包含s字符串中的每个字符，并不是包含s字符串
 * int indexOf(String s)    子字符串第一次出现的索引
 * int indexOf(String s ,int index)    子字符串第一次出现的索引,从指定索引开始
 * int lastIndexOf(String s)    子字符串在字符串最后一次出现的索引
 * int lastIndexOf(String s, int index)    子字符串在字符串最后一次出现的索引,从指定索引开始反向搜索
 *
 * String replace(char oldChar, char newChar)   字符替换所有
 * String replace(CharSequence old, CharSequence new)   字符序列替换所有
 * String replaceAll(String regex, String replacement)  用replacement替换所有匹配给定正则表达式的子字符串
 * String replaceFirst(String regex, String replacement)  用replacement替换第一个匹配给定正则表达式的子字符串
 *
 * boolean matches(String regex)    是否匹配给定正则表达式
 *
 * String[] spilt(String regex)     使用正则表达式拆分
 * String[] spilt(String regex, int limit)     使用正则表达式拆分字符串，最后最多不超过limit个字符串，多余的放进最后一个
 */

public class testStringMethod {

    public static void main(String[] args) {
        String string = "  12   3  ";
        String string2 = "123";
        System.out.println(string.length());
        System.out.println(string.trim().length());
        System.out.println(string.concat(string));
        System.out.println(string);

        String string3 = "he.ll.o.java";
        String[] strs=string3.split("\\.",2);
        for (int i = 0; i < strs.length; i++) {
            String str = strs[i];
            System.out.println(str);
        }
    }
}
