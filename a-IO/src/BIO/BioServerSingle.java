package BIO;

import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @Classname BioServerSingle
 * @Date 2020/4/7
 * @Created by 陈刀仔
 * @Description TODO
 */

public class BioServerSingle {

    @Test
    public void test1() throws IOException {
        Socket socket = new Socket("127.0.0.1",8080);
        OutputStream os = socket.getOutputStream();
        os.write("1客户端".getBytes());
        os.close();
        socket.close();
    }

    @Test
    public void test0() throws IOException {
        Socket socket = new Socket("127.0.0.1",8080);
        OutputStream os = socket.getOutputStream();
        os.write("0客户端".getBytes());
        os.close();
        socket.close();
    }

    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        OutputStream os = null;
        Socket socket = null;
        InputStream is = null;
        try {
            while (true) {
                serverSocket = new ServerSocket(8080);
                System.out.println("start");
                socket = serverSocket.accept();
                is = socket.getInputStream();

//                int len;
//                byte[] buffer = new byte[1024];
//                while ((len = is.read(buffer)) != -1) {
//                    System.out.println(new String(buffer, 0, len));
//                    os = socket.getOutputStream();
//                    os.write("success".getBytes());
//                }

                new Thread(new SocketHandler(socket)).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                serverSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
