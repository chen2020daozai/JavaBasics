package queue;

/**
 * @Classname Queue
 * @Date 2020/7/26
 * @Created by 陈刀仔
 * @Description TODO
 */

class Queue<T> {
    int head;
    int tail;
    int maxSize;
    T [] dataArr;

    //环形队列，head指向当前队首元素，tail指向队尾元素的后一位

    public Queue(int maxSize) {
        this.maxSize = maxSize;
        this.dataArr = (T[]) new Object[maxSize];
    }

    //判断队列是否已满
    //tail+1表示添加一个元素后队列的tail指向，加% this.maxSize处理环形
    //可能tail指向1，head指向2
    public boolean isFull() {
        System.out.println(this.tail);
        return (this.tail + 1) % this.maxSize == this.head;
    }

    //判断队列是否为空
    //tail和head是否指向相同
    public boolean isEmpty() {
        return this.tail == this.head;
    }

    //添加元素
    public void push(T data) {
        if(isFull()) {
            System.out.println("队列已满，添加失败");
            return;
        }
        this.dataArr[tail] = data;
        this.tail = (this.tail + 1) % this.maxSize;
        System.out.println(this.tail);
    }

    //取出队首元素
    //head指向加一，加% this.maxSize处理环形
    public T pop() {
        if(isEmpty()) {
            System.out.println("队列已空，取出失败");
            return null;
        }
        int tmp = this.head;
        this.head = (this.head + 1) % this.maxSize;
        return this.dataArr[tmp];
    }

    //打印队列
    public void show() {
        if(isEmpty()) {
            System.out.println("队列为空");
            return;
        }
        for (int i = this.head; i < this.head + getRealSize(); i++) {
            System.out.println(this.dataArr[i % this.maxSize]);
        }
    }

    //查看队首元素
    public T peek() {
        if(isEmpty()) {
            System.out.println("队列为空，取出队首失败");
            return null;
        }
        return this.dataArr[this.head];
    }

    //获取队列有效元素个数
    public int getRealSize() {
        return (this.tail + this.maxSize - this.head) % this.maxSize;
    }
}




