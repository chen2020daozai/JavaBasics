package zlj.hTestThread;

/**
 * @Classname MyException
 * @Date 2020/3/25 15:46
 * @Created by 陈刀仔
 * @Description TODO
 */

class Clerk {
    private int productNum = 0;

    //生产产品
    public synchronized void produceProt() {
        if (productNum < 20) {
            productNum++;
            System.out.println(Thread.currentThread().getName() + "正在生产第  " + productNum + "  个产品");

            notify();
        } else {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
//        if (productNum == 1) {
//            notify();
//        }
    }

    //消费产品
    public synchronized void consumeProt() {
        if (productNum > 0) {
            System.out.println(Thread.currentThread().getName() + "正在消费第  " + productNum + "  个产品");
            productNum--;

//            notify();
        } else {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        if (productNum < 20) {
            notify();
        }
    }
}

class Producer extends Thread {
    private Clerk clerk;

    public Producer(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "   开始生产产品:");

        while (true) {
            clerk.produceProt();
        }
    }
}

class Consumer extends Thread {
    private Clerk clerk;

    public Consumer(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "   开始消费产品:");

        while (true) {
            clerk.consumeProt();
        }
    }
}

public class zljProductTest {
    public static void main(String[] args) {
        Clerk clerk = new Clerk();

        Producer producer = new Producer(clerk);
        producer.setName("生产者1");

        Consumer consumer = new Consumer(clerk);
        consumer.setName("消费者1");

        producer.start();
        consumer.start();
    }
}
