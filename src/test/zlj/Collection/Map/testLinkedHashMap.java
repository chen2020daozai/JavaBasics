package zlj.Collection.Map;

import org.junit.Test;
import zlj.Person;

import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * @Classname MyException
 * @Date 2020/3/25 15:46
 * @Created by 陈刀仔
 * @Description TODO
 */

public class testLinkedHashMap {

    @Test
    public void testLinkedHashMap1() {
        LinkedHashMap m = new LinkedHashMap();
        m.put(new Person("zlj1", 20), "真牛逼");
        m.put(new Person("zlj2", 20), "太牛逼");
        m.put(new Person("xlj3", 20), "还行");
        m.put(new Person("jx4", 20), "中等");
        m.put(new Person("zlj5", 20), "牛逼");
        m.put(new Person("zlj6", 20), "真牛逼");
        m.put(new Person("zlj7", 20), "太牛逼");
        m.put(new Person("xlj8", 20), "还行");
        m.put(new Person("jx9", 20), "中等");
        m.put(new Person("zlj10", 20), "牛逼");
        m.put(new Person("zlj11", 20), "真牛逼");
        m.put(new Person("zlj12", 20), "太牛逼");
        m.put(new Person("xlj13", 20), "还行");
        m.put(new Person("jx14", 20), "中等");
        m.put(new Person("zlj15", 20), "牛逼");
        m.put(new Person("zlj16", 20), "真牛逼");
        m.put(new Person("zlj17", 20), "太牛逼");
        m.put(new Person("xlj18", 20), "还行");
        m.put(new Person("jx19", 20), "中等");
        m.put(new Person("zlj20", 20), "牛逼");
        long start = System.currentTimeMillis();
        System.out.println(m);
        long end = System.currentTimeMillis();
        System.out.println("**************" + (end - start));
    }

    @Test
    public void testLinkedHashMap2() {
        HashMap m2 = new HashMap();
        m2.put(new Person("zlj", 20), "牛逼");
        m2.put(new Person("zlj", 20), "真牛逼");
        m2.put(new Person("zlj", 20), "太牛逼");
        m2.put(new Person("xlj", 20), "还行");
        m2.put(new Person("jx", 20), "中等");
        long start = System.currentTimeMillis();
        System.out.println(m2);
        long end = System.currentTimeMillis();
        System.out.println("**************" + (end - start));
    }
}
