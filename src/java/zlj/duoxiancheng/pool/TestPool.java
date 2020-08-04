package zlj.duoxiancheng.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Classname TestPool
 * @Date 2020/8/3
 * @Created by 陈刀仔
 * @Description TODO
 */

public class TestPool {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        executorService.execute(new Thread());

        executorService.shutdown();
    }
}
