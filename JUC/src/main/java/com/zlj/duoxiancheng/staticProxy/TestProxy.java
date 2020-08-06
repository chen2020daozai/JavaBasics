package com.zlj.duoxiancheng.staticProxy;

/**
 * 静态代理
 *      代理接口
 *      真实对象和代理对象实现同一个接口
 *      真实对象作为属性给代理对象,实现同样的方法
 * 好处：代理对象可以做真实对象做不了的事
 * @Classname TestProxy
 * @Date 2020/8/3
 * @Created by 陈刀仔
 * @Description TODO
 */

public class TestProxy {
    public static void main(String[] args) {
        Wedding you=new You();
        Company company = new Company(you);
        company.HappyWedding();
    }
}

interface Wedding{
    void HappyWedding();
}

class You implements Wedding{

    public void HappyWedding() {
        System.out.println("真实对象结婚");
    }
}

class Company implements Wedding{

    private Wedding target;

    Company(Wedding target){
        this.target=target;
    }

    public void HappyWedding() {
        before();
        this.target.HappyWedding();//真实对象
    }

    private void before() {
        System.out.println("代理对象在真实对象业务基础上做更多事");
    }
}







