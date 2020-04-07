package zlj.testException;

import org.junit.Test;

import java.io.IOException;

/**
 * @Classname zlj.testException.testException
 * @Description TODO
 * @Date 2020/3/24 11:10
 * @Created by 陈刀仔
 */

public class testException {

    public static void main(String[] args) {
        try{
            t3();
        }catch (Exception e){
            System.out.println("throws");
        }

    }
//    @Test
    public static void t3() throws NullPointerException {
        //可能出现异常的代码
        String s = new String();
        s = null;
        System.out.println(s);
        System.out.println(s.toString());
    }

    @Test
    public void t4() {
//不知道什么异常，就直接     Exception e
//多个catch()中的异常类对象可以同名，因为每一个catch()里面的变量相当于局部变量
        try {
            //可能出现异常的代码
            String s = new String();
            s = null;
            System.out.println(s);
            System.out.println(s.toString());
        } catch (ArrayIndexOutOfBoundsException e) {
            //处理方式
            System.out.println("空指针异常");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            //一定执行的代码
            System.out.println("一定执行的代码");
            System.out.println("如果没有，可以没有finally");
        }
    }
}
