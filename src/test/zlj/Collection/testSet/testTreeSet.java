package zlj.Collection.testSet;

import org.junit.Test;
import zlj.Person;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 * @Classname MyException
 * @Date 2020/3/25 15:46
 * @Created by 陈刀仔
 * @Description TODO
 */

public class testTreeSet {


    /*
        定制排序
     */
    @Test
    public void testTreeSet2() {
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

        Set set = new TreeSet(com);
        set.add(new Person("zlj", 20));
        set.add(new Person("zsf", 31));
        set.add(new Person("zjl", 41));
        set.add(new Person("lb", 17));
        set.add(new Person("zf", 19));
        set.add(new Person("zwj", 19));
        for (Object o :
                set) {
            System.out.println(o);
        }
    }


    /*
        自然排序
     */
    @Test
    public void testTreeSet1() {
        Set set = new TreeSet();
        set.add(new Person("zlj", 20));
        set.add(new Person("zsf", 31));
        set.add(new Person("zjl", 41));
        set.add(new Person("lb", 17));
        set.add(new Person("zf", 19));
        set.add(new Person("zwj", 19));
        for (Object o :
                set) {
            System.out.println(o);
        }
    }
}
