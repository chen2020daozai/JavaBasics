package ysu.zlj.URL;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * @Classname TestURL
 * @Date 2020/4/6
 * @Created by 陈刀仔
 * @Description TODO
 *
 *  public String getProtocol( )	获取该URL的协议名
 *  public String getHost( )	获取该URL的主机名
 *  public String getPort( )	获取该URL的端口号
 *  public String getPath( )	获取该URL的文件路径
 *  public String getFile( )	获取该URL的文件名
 *  public String getQuery(	)	获取该URL的查询名
 */


public class TestURL {
    public static void main(String[] args) {
        HttpURLConnection connection = null;
        InputStream is = null;
        FileOutputStream fos = null;
        try {
            URL url = new URL("http://localhost:8080/examples/testURL.jpg");

            connection = (HttpURLConnection) url.openConnection();
            connection.connect();

            is = connection.getInputStream();
            fos = new FileOutputStream("net\\testurlthis.jpg");

            int len;
            byte[] bytes=new byte[1024];
            while ((len=is.read(bytes))!=-1){
                fos.write(bytes,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos!=null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (is!=null) {
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (connection!=null)
            connection.disconnect();
        }

    }
}
