package ysu.zlj.UDP;

import org.junit.Test;

import java.io.IOException;
import java.net.*;

/**
 * @Classname TestUDP
 * @Date 2020/4/6
 * @Created by 陈刀仔
 * @Description TODO
 */

public class TestUDP {

    @Test
    public void sender() throws IOException {
        DatagramSocket socket = new DatagramSocket();

        byte[] data=new byte[100];
        data="这是UDP".getBytes();
        DatagramPacket packet = new DatagramPacket(data, 0, data.length, InetAddress.getLocalHost(), 60001);
        socket.send(packet);

        socket.close();
    }

    @Test
    public void receiver() throws IOException {
        DatagramSocket socket = new DatagramSocket(60001);

        byte[] buffer=new byte[100];
        DatagramPacket packet = new DatagramPacket(buffer, 0, buffer.length);
        socket.receive(packet);

        System.out.println(new String(packet.getData(),0,packet.getLength()));
        socket.close();
    }

    public static void main(String[] args) {

    }
}
