package zlj.testString;


import org.junit.Test;

/**
 * @Classname MyException
 * @Date 2020/3/25 15:46
 * @Created by 陈刀仔
 * @Description TODO
 * <p>
 * StringBuffer append(xxx)     字符串拼接
 * StringBuffer delete(int start, int end)
 * StringBuffer replace(int start, int end, String str)     [start,end)区间替换字符串
 * StringBuffer insert(int offset, xxx)      指定位置插入str
 * StringBuffer reverse()   逆转当前序列
 * <p>
 * public setCharAt(int n, char ch)
 */

public class testStringBufferBuilder {

    @Test
    public void test() {
//初始设置
        long startTime = 0L;
        long endTime = 0L;
        String text = "";
        StringBuffer buffer = new StringBuffer("");
        StringBuilder builder = new StringBuilder("");
//开始对比
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            buffer.append(String.valueOf(i));
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuffer的执行时间:" + (endTime - startTime));
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            builder.append(String.valueOf(i));

        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuilder的执行时间:" + (endTime - startTime));


        startTime = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            text=text+i;
        }
        endTime = System.currentTimeMillis();
        System.out.println("String的执行时间:" + (endTime - startTime));
    }
}
