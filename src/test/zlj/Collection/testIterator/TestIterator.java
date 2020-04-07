package zlj.Collection.testIterator;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * 遍历collection
 *
 * @Classname MyException
 * @Date 2020/3/25 15:46
 * @Created by 陈刀仔
 * @Description TODO
 */

public class TestIterator {

    @Test
    public void testCompa(){
        Integer a=5;
        Integer b=10;
        System.out.println(a.compareTo(b));
    }

    /*
    面试题
    String s : str
    s是局部变量，是str[i]赋值给s
     */
    @Test
    public void testFor2() {
        String[] str = new String[]{"aa", "bb", "cc"};
        for (String s : str
        ) {
            System.out.println(s);
            s = "mm";
        }
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }
    }

    @Test
    public void testFor1() {
        Collection collection = new ArrayList();
        collection.add(123);
        collection.add("aaa");
        collection.add("bbb");
        collection.add("aaa");
        for (Object o : collection
        ) {
            System.out.println(o);
        }
    }

    @Test
    public void test1() {
        Collection collection = new ArrayList();
        collection.add(123);
        collection.add("aaa");
        collection.add("bbb");
        collection.add("aaa");

        Iterator i = collection.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }

        System.out.println();
        Iterator i2 = collection.iterator();
        //错误写法
        try {
            while (i2.next() != null) {
                System.out.println(i2.next());
            }
        } catch (NoSuchElementException e) {
            System.out.println("错误写法");
        }

    }
}
