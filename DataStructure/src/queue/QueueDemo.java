package queue;

import java.util.Scanner;

/**
 * @Classname QueueDemo
 * @Date 2020/7/26
 * @Created by 陈刀仔
 * @Description TODO
 */

public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> queue = new Queue<String>(5);

        System.out.println("队列测试开始：");
        System.out.println("push: 添加元素");
        System.out.println("pop: 取出元素");
        System.out.println("peek: 查看队首元素");
        System.out.println("show: 打印队列");
        System.out.println("exit: 退出");
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (true) {
            String cmd = scanner.next();
            switch (cmd) {
                case "push":
                    System.out.println("====添加元素====");
                    queue.push(scanner.next());
                    break;
                case "pop":
                    System.out.println("====取出元素====");
                    System.out.println(queue.pop());
                    break;
                case "peek":
                    System.out.println("====查看队首元素====");
                    System.out.println(queue.peek());
                    break;
                case "show":
                    System.out.println("====打印队列====");
                    queue.show();
                    break;
                case "exit":
                    flag = false;
                    break;
                default:
                    System.out.println("****不能识别的指令****");
                    break;
            }
            if(! flag) {
                break;
            }
            System.out.println("push: 添加元素");
            System.out.println("pop: 取出元素");
            System.out.println("peek: 查看队首元素");
            System.out.println("show: 打印队列");
            System.out.println("exit: 退出");
        }
        scanner.close();
        System.out.println("测试结束");
    }
}
