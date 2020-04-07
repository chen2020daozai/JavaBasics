package io.file;

import org.junit.Test;

import java.io.*;

/**
 * 转换流
 *
 * @Classname IOStreamRW
 * @Date 2020/4/4
 * @Created by 陈刀仔
 * @Description TODO
 */

public class IOStreamRW {

    @Test
    public void test() throws IOException {
        FileInputStream fileInputStream = new FileInputStream("word.txt");

        InputStreamReader streamReader = new InputStreamReader(fileInputStream, "utf-8");

        int len;
        char[] chars=new char[20];
        while ((len=streamReader.read(chars))!=-1){
            for (int i = 0; i < len; i++) {
                System.out.print(chars[i]);
            }
        }

        streamReader.close();
        fileInputStream.close();
    }

    public static void main(String[] args) {

    }
}
