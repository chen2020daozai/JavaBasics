package ysu.zlj;

import org.junit.Test;

import java.io.*;
import java.util.Properties;

/**
 * @Classname TestClassLoader
 * @Date 2020/4/6
 * @Created by 陈刀仔
 * @Description TODO
 */

public class TestClassLoader {

    /*
    * 类加载器：把类加载到内存中
    * */
    @Test
    public void test(){
        //自定义类，用系统类加载器进行加载
        ClassLoader classLoader = TestClassLoader.class.getClassLoader();
        System.out.println(classLoader);
        //扩展类加载器
        ClassLoader classLoader1 = classLoader.getParent();
        System.out.println(classLoader1);
        //无法获取引导类加载器,有，只是获取不到
        //引导类加载器主要负责加载Java的核心类库
        ClassLoader classLoader2 = classLoader1.getParent();
        System.out.println(classLoader2);
    }

    @Test
    public void test1() throws IOException {
        Properties prop = new Properties();

        //1.方式一:相对路径在module
//        FileInputStream fis = new FileInputStream("jdbc.properties");
//        prop.load(fis);

        //方式二:相对路径在src
        ClassLoader classLoader = TestClassLoader.class.getClassLoader();
        InputStream resourceAsStream = classLoader.getResourceAsStream("jdbc1.properties");

        prop.load(resourceAsStream);

        String name = prop.getProperty("user");
        String password = prop.getProperty("password");
        System.out.println(name+"  "+password);
    }

    public static void main(String[] args) {

    }
}
