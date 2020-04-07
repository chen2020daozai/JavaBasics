package ysu.zlj.proxy.staticProxy;

/**
 * @Classname TestStaticProxy
 * @Date 2020/4/6
 * @Created by 陈刀仔
 * @Description TODO
 */

interface clothFactory{
    void produce();
}

//代理类
class proxyFactory implements clothFactory {

    private clothFactory cf;

    public proxyFactory(clothFactory cf) {
        this.cf = cf;
    }

    @Override
    public void produce() {
        System.out.println("代理工厂");
        cf.produce();
    }
}

//被代理类
class Nike implements clothFactory{

    @Override
    public void produce() {
        System.out.println("Nike生产");
    }
}

public class TestStaticProxy {

    public static void main(String[] args) {
        Nike nike=new Nike();
        proxyFactory proxy = new proxyFactory(nike);
        proxy.produce();
    }
}
