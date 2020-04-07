package ysu.zlj;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @Classname TestInetAddress
 * @Date 2020/4/4
 * @Created by 陈刀仔
 * @Description TODO
 *
 * 本机地址127.0.0.1 对应localhost
 *
 * InetAddress类没有提供公共的构造器，而是提供了如下几个静态方法来获取InetAddress实例
 *
 * public static InetAddress getLocalHost()
 * public static InetAddress getByName(String host)
 *
 * InetAddress提供了如下几个常用的方法
 *
 * public String getHostAddress()：返回 IP 地址字符串（以文本表现形式）。
 * public String getHostName()：获取此 IP 地址的主机名
 * public boolean isReachable(int timeout)：测试是否可以达到该地址
 */

public class TestInetAddress {
    public static void main(String[] args) throws IOException {
        System.out.println(InetAddress.getLocalHost());//DESKTOP-IGGDSPG/192.168.137.1
        System.out.println(InetAddress.getByName("192.168.2.240"));

        InetAddress net=InetAddress.getByName("www.baidu.com");
        System.out.println(net);

        System.out.println(net.isReachable(10));
    }
}
