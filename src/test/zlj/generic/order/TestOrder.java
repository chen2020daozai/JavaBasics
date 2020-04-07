package zlj.generic.order;

import org.junit.Test;

import java.util.List;

/**
 * @Classname MyException
 * @Date 2020/3/25 15:46
 * @Created by 陈刀仔
 * @Description TODO
 */

public class TestOrder {

    @Test
    public void test(){
        Order<Integer> order=new Order<>();
        Order<String> order1=new Order<>();

//        order.setOrderT(123);

        System.out.println(order.getOrderId());
        System.out.println(order.orderId);

        Integer integer=5;
        System.out.println(order.get(integer));

        String string = "str";
        System.out.println(order1.get(string));
//        System.out.println(order.orderT);
    }

    @Test
    public void test1(){
        Order<String> order=new Order<>();

        Integer[] arr=new Integer[]{1,2,3,4,5};
        List<Integer> list = order.show(arr);
        System.out.println(list);
    }

    public static void main(String[] args) {

    }
}
