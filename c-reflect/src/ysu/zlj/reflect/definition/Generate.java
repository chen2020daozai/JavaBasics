package ysu.zlj.reflect.definition;

import java.io.Serializable;

/**
 * @Classname Generate
 * @Date 2020/4/6
 * @Created by 陈刀仔
 * @Description TODO
 */

public class Generate<T> implements Serializable {

    public String kind;
    protected int num;

    private void breath(){
        System.out.println("生物正在呼吸");
    }

    public void eat(){
        System.out.println("生物进食");
    }

    public static void main(String[] args) {

    }
}
