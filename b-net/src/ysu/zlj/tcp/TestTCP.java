package ysu.zlj.tcp;

import org.apache.commons.io.output.ByteArrayOutputStream;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @Classname TestTCP
 * @Date 2020/4/5
 * @Created by 陈刀仔
 * @Description TODO
 */

public class TestTCP {

    //客户端
    @Test
    public void testClient() {
        Socket socket = null;
        OutputStream socketOutputStream = null;
        try {
            //1.IP+端口号=socket
            InetAddress inetAddress = InetAddress.getByName("127.0.0.1");
            socket = new Socket(inetAddress, 8888);
            //2.输出流
            socketOutputStream = socket.getOutputStream();
            socketOutputStream.write("我是客户端".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (socketOutputStream!=null){
                try {
                    socketOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (socket!=null){
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    //服务器
    @Test
    public void testServer() {
        //1.
        ServerSocket ss = null;
        Socket socket = null;
        InputStream socketInputStream = null;
        ByteArrayOutputStream baos= null;
        try {
            ss = new ServerSocket(8888);
            //accept()
            socket = ss.accept();
            socketInputStream = socket.getInputStream();

            //错误写法,有汉字
//        byte[] bytes=new byte[20];
//        int len;
//        while ((len=socketInputStream.read(bytes))!=-1){
//            System.out.println(new String(bytes,0,len));
//        }

            //2
            //正确写法
            byte[] bytes=new byte[20];
            int len;
            baos = new ByteArrayOutputStream();
            while ((len=socketInputStream.read(bytes))!=-1){
                baos.write(bytes,0,len);
            }
            System.out.println(baos.toString());

            System.out.println(socket.getInetAddress().getHostAddress());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //3.资源关闭
            if (baos!=null) {
                try {
                    baos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (socketInputStream!=null) {
                try {
                    socketInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (socket!=null) {
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (ss!=null) {
                try {
                    ss.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    public static void main(String[] args) {

    }
}
