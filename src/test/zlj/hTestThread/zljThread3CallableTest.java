package zlj.hTestThread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 创建线程方式之三：实现Callable接口，可以获取返回值
 *
 * @Classname MyException
 * @Date 2020/3/25 15:46
 * @Created by 陈刀仔
 * @Description TODO
 */

class TestThread3 implements Callable {
    @Override
    public Object call() throws Exception {
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
            sum += i;
        }
        return sum;
    }
}

public class zljThread3CallableTest {
    public static void main(String[] args) {
        TestThread3 testThread3 = new TestThread3();

        FutureTask futureTask = new FutureTask(testThread3);
        //Thread()参数只能是Runnable接口实现类，FutureTask实现了
        new Thread(futureTask).start();

        //获取返回值
        try {
            //get()方法返回值就是：Callable接口的实现类的  重写call方法的返回值
            Object sum = futureTask.get();
            System.out.println("和为：" + sum);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
