package com.zlj.ProductorConsumer;

/**
 * @Classname ProductorConsumerTest
 * @Date 2020/8/4
 * @Created by 陈刀仔
 * @Description TODO
 */

public class ProductorConsumerTest {
    public static void main(String[] args) {
        Data data = new Data();

        new Thread(()->{
            for (int i = 0; i < 10; i++) {
                try {
                    data.consume();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"消费者").start();

        new Thread(()->{
            for (int i = 0; i < 10; i++) {
                try {
                    data.product();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"生产者").start();
    }
}

class Data{
    int num=0;

    //生产
    public synchronized void product() throws InterruptedException {
        //避免虚假唤醒
        while (num!=0){
            this.wait();
        }
        num++;//生产
        System.out.println(Thread.currentThread().getName()+"生产"+num);
        notifyAll();//唤醒
    }

    //消费
    public synchronized void consume() throws InterruptedException {
        while (num==0){
            this.wait();
        }
        num--;//生产
        System.out.println(Thread.currentThread().getName()+"消费"+num);
        notifyAll();//唤醒
    }
}