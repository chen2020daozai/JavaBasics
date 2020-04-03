package io.file;

import org.junit.Test;

import java.io.*;

/**
 * @Classname TestFileIOStream
 * @Date 2020/4/3
 * @Created by 陈刀仔
 * @Description TODO
 */

public class TestFileIOStream {

    @Test
    public void test1(){
        long start=System.currentTimeMillis();
        FileInputStream fileInputStream= null;
        FileOutputStream fileOutputStream=null;
        try {
            File filesrc=new File("E");
            File filedest=new File("this.mp4");

            fileInputStream = new FileInputStream(filesrc);
            fileOutputStream=new FileOutputStream(filedest);

            byte[] bytes=new byte[1024];
            int len;
            while ((len=fileInputStream.read(bytes))!=-1){
                fileOutputStream.write(bytes,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileInputStream!=null)
                    fileInputStream.close();
                if (fileOutputStream!=null)
                    fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        long millis = System.currentTimeMillis();
        System.out.println(millis-start);
    }

    @Test
    public void test() {
        FileInputStream fileInputStream= null;
        try {
            File file=new File("hello.txt");

            fileInputStream = new FileInputStream(file);

            byte[] bytes=new byte[3];
            int len;
            while ((len=fileInputStream.read(bytes))!=-1){
                String string = new String(bytes,0,len);
                System.out.println(string);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileInputStream!=null)
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public static void main(String[] args) {

    }
}
