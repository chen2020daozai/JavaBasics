package zlj.Collection.TestCollections;

import org.junit.Test;
import zlj.Person;

import java.util.*;

/**
 * @Classname MyException
 * @Date 2020/3/25 15:46
 * @Created by 陈刀仔
 * @Description TODO
 * <p>
 * reverse(List):反转List中的元素
 * shuffle(List):对List集合中的元素随机排序
 * sort(List):对List集合中的元素进行升序排序
 * sort(List,Comparator):对List集合中元素按照指定规则排序
 * swap(List,int,int):交换集合List中的两个元素位置
 * <p>
 * Object max(Collection)
 * Object max(Collection,Comparator)
 * Object min(Collection)
 * Object min(Collection,Comparator)
 * int frequency(Collection,Object)返回集合中元素出现次数
 * void copy(List dest,List src):把src复制到dest中
 * boolean replaceAll(List list,Object oldVal,Object newVal):List集合中替换某个元素
 */

public class testCollections {

    @Test
    public void test1() {
        List list = new ArrayList();
        list.add(20);
        list.add(13);
        list.add(37);
        list.add(13);
        list.add(45);
        System.out.println(list);

        //1.集合反转
        Collections.reverse(list);
        System.out.println(list);

        //2.复制集合，
        //方式一：错误实现方法    因为这样做集合大小是0
//        List list1=new ArrayList();
        //方式二：正确实现方法
        List list1 = Arrays.asList(new Object[list.size()]);
        Collections.copy(list1, list);
        System.out.print("list1");
        System.out.println(list1);

        //3.线程安全
        //多个线程操作的时候
        List list2=Collections.synchronizedList(list);
        System.out.println(list2);
    }

    @Test
    public void test0(){
//        Set set = new TreeSet();

        List<Person> set=new LinkedList();
        set.add(new Person("zlj", 20));
        set.add(new Person("zsf", 31));
        set.add(new Person("zjl", 41));
        set.add(new Person("lb", 17));
        set.add(new Person("zf", 19));
        set.add(new Person("zwj", 19));
        for (Person p :
                set) {
            System.out.println(p);
        }

        List list=new ArrayList();
    }
}
