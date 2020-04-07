package io.file;

import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**RandomAccessFile实现插入
 * @Classname RansomAccessFile
 * @Date 2020/4/4
 * @Created by 陈刀仔
 * @Description TODO
 */

public class RansomAccessFileTest {

    @Test
    public void test() {
        RandomAccessFile randomAccessFile = null;
        try {
            randomAccessFile = new RandomAccessFile("hello.txt","rw");

            randomAccessFile.seek(3);
            StringBuilder string=new StringBuilder((int) new File("hello.txt").length());

            byte[] bytes=new byte[20];
            int len;
            while ((len=randomAccessFile.read(bytes))!=-1){
                string.append(new String(bytes,0,len));
            }

            randomAccessFile.seek(3);
            randomAccessFile.write("zljnb".getBytes());
            randomAccessFile.write(string.toString().getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (randomAccessFile!=null){
                try {
                    randomAccessFile.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    public static void main(String[] args) {

    }
}
