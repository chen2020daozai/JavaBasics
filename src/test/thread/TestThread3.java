package thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @Classname ThreeTest
 * @Date 2020/8/2
 * @Created by 陈刀仔
 * @Description TODO
 */

public class TestThread3 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask task = new FutureTask(new MyThread3());
        Thread thread = new Thread(task);
        thread.start();
        System.out.println(task.get());
    }
}

class MyThread3 implements Callable{

    @Override
    public Object call() throws Exception {
        System.out.println("duoxiancheng ");
        return new String("得到");
    }
}
