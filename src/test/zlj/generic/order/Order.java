package zlj.generic.order;

import java.util.ArrayList;
import java.util.List;

/**自定义泛型类
 * @Classname MyException
 * @Date 2020/3/25 15:46
 * @Created by 陈刀仔
 * @Description TODO
 */

public class Order<T> {
    String orderName;
    int orderId;

//    T orderT;

    //返回值是泛型的方法
    public T get(T o){
        return o;
    }

    //泛型方法
    //泛型方法的泛型跟类的泛型没有关系
    //Integer[] arr
    //返回值是List，List中元素的类型是<E>
    public <E> List<E> show(E[] arr){
        List<E> list=new ArrayList<>();
        for (E e :
                arr) {
            list.add(e);
        }
        return list;
    }

    public Order(){

    }

    public Order(String name,int id,T t){
        this.orderName=name;
        this.orderId=id;
//        this.orderT=t;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

//    public T getOrderT() {
//        return orderT;
//    }
//
//    public void setOrderT(T orderT) {
//        this.orderT = orderT;
//    }

    @Override
    public String toString() {
        return "Order{" +
                "orderName='" + orderName + '\'' +
                ", orderId=" + orderId +
//                ", orderT=" + orderT +
                '}';
    }
}
