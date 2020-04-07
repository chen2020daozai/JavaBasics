package zlj.Collection.Map;

import org.junit.Test;
import zlj.Person;

import java.util.*;

/**
 * @Classname MyException
 * @Date 2020/3/25 15:46
 * @Created by 陈刀仔
 * @Description TODO
 * HashMap类主要方法
 * Object put(Object key, Object value)    --添加
 * Object remove(Object key)
 * void putAll(Map t)
 * void clear()
 * Object get(Object key)
 * boolean containKey(Object key)
 * boolean containValue(Object value)
 * int size()
 * boolean isEmpty()
 * boolean equals(Object obj)
 * 元视图操作的方法(遍历)
 * Set keySet()
 * Collection values()
 * Set entrySet()
 */

public class testHashMap {

    @Test
    public void testHashMap1() {
        Map m = new HashMap();
        m.put(new Person("zlj", 20), "牛逼");
        m.put(new Person("zlj", 20), "真牛逼");
        m.put(new Person("zlj", 20), "太牛逼");
        m.put(new Person("xlj", 20), "还行");
        m.put(new Person("jx", 20), "中等");
        System.out.println(m.size());
        System.out.println(m);
    }

    @Test
    public void testHashMap2() {
        Map m = new HashMap();

        m.put(new Person("zlj", 20), "太牛逼");
        m.put(new Person("xlj", 20), "还行");
        m.put(new Person("jx", 20), "中等");

        //遍历key
        Set set = m.keySet();
        for (Object obj :
                set) {
            System.out.println(obj);
        }

        //遍历value
        Collection collection = m.values();
        for (Object o :
                collection) {
            System.out.println(o);
        }

        //遍历key-value对
        Set set2=m.entrySet();
        for (Object o :
                set2) {
            System.out.println(o);
        }
    }

    @Test
    public void testHashMap3() {
        //定制一个比较类对象
        Comparator com = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof Person && o2 instanceof Person) {
                    int i = ((Person) o1).getAge().compareTo(((Person) o2).getAge());
                    return (i == 0) ? (((Person) o1).getName().compareTo(((Person) o2).getName())) : i;
                }
                return 0;
            }
        };

        Map m = new TreeMap(com);
        m.put(new Person("zlj1", 19), "牛逼");
        m.put(new Person("zlj2", 20), "真牛逼");
        m.put(new Person("zlj", 20), "太牛逼");
        m.put(new Person("xlj", 27), "还行");
        m.put(new Person("jx", 24), "中等");
        Set set=m.entrySet();
        for (Object o :
                set) {
            System.out.println(o);
        }

    }
}
