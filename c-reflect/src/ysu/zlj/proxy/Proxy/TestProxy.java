package ysu.zlj.proxy.Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理
 *
 * @Classname TestProxy
 * @Date 2020/4/7
 * @Created by 陈刀仔
 * @Description TODO
 */

interface Human {
    String play();

    void eat(String food);
}

class SuperMan implements Human {

    @Override
    public String play() {
        return "play ball";
    }

    @Override
    public void eat(String food) {
        System.out.println("正在吃" + food);
    }
}

/*
    要实现动态代理，需要完成：
    问题1.如何根据加载到内存中的被代理类，动态的创建代理类
    问题2.通过调用代理类的方法a时，动态的间接调用被代理类的同名方法a
 */

class ProxyFactory {
    //调用此方法，根据被代理类，返回代理类
    public static Object getInstance(Object obj) {
        MYInvocationHandler handler = new MYInvocationHandler();

        //形参obj是被代理类
        handler.bind(obj);

        return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), handler);
    }
}

class MYInvocationHandler implements InvocationHandler {

    private Object obj;//被代理类 对象

    //代理工厂中 被代理类的对象 通过bind() 传过来
    public void bind(Object obj){
        this.obj=obj;
    }

    //解决问题2
    @Override
    //
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //method()是代理类对象调用的方法，间接成为被代理类对象调用的方法
        //obj:被代理类的对象
        Object invoke = method.invoke(obj, args);
        return invoke;
    }
}

public class TestProxy {
    public static void main(String[] args) {
        //被代理类的对象
        SuperMan superMan = new SuperMan();
        //代理类的对象
        Human instance = (Human) ProxyFactory.getInstance(superMan);

        String play = instance.play();
        System.out.println(play);
        instance.eat("shi");
    }
}
