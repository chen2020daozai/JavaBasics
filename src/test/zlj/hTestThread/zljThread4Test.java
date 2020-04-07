package zlj.hTestThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * 4、创建线程方式之四：线程池
 *
 * @Classname MyException
 * @Date 2020/3/25 15:46
 * @Created by 陈刀仔
 * @Description TODO
 */

class ThreadNum extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + "   " + i);
        }
    }
}

public class zljThread4Test {
    public static void main(String[] args) {
        //线程数
        ExecutorService service = Executors.newFixedThreadPool(10);

        ThreadPoolExecutor service1= (ThreadPoolExecutor) service;
        service.execute(new ThreadNum());//适合Runnable
//        service.submit();//适合Callable

        //关闭线程
        service.shutdown();
    }
}
