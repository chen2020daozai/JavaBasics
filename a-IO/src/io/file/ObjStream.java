package io.file;

import io.Person;
import org.junit.Test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @Classname ObjStream
 * @Date 2020/4/4
 * @Created by 陈刀仔
 * @Description TODO
 */

/*
 * 可序列化类的要求
 * 1.类实现Serializable接口
 * 2.类有serialVersionUID
 * 3.类中属性类型是可序列化
 * 4.不能序列化static和transient修饰的成员
 * 5.所以如果有不想被序列化的成员，类的成员可以用static标识，对象的成员可以用transient标识
 *
 * */

public class ObjStream {


    /*
     * 序列化过程
     * */
    @Test
    public void test() {
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("oos.dat"));

            oos.writeObject(new String("这是一个对象"));
            oos.flush();

            Person p = new Person();
            oos.writeObject(p);
            oos.flush();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }


    public static void main(String[] args) {

    }
}
