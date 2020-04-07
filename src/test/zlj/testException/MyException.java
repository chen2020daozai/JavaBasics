package zlj.testException;

/**
 * @Classname MyException
 * @Date 2020/3/25 15:46
 * @Created by 陈刀仔
 * @Description TODO 自定义异常类
 * 1    继承现有的异常类
 * 2    提供一个序列号（不一定，反正我现在写的没用，但是可能有用）  提供几个构造器
 */

public class MyException extends RuntimeException {
    public MyException(){

    }
    public MyException(String msg){
        super(msg);
    }
}
