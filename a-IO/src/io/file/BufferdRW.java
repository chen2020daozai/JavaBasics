package io.file;

import org.junit.Test;

import java.io.*;

/**
 * @Classname BufferdRW
 * @Date 2020/4/3
 * @Created by 陈刀仔
 * @Description TODO
 */

public class BufferdRW {

    @Test
    public void test() {
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;

        try {
            File file = new File("hello.txt");
            File file1 = new File("hello1.txt");

            FileReader fileReader=new FileReader(file);
            FileWriter fileWriter=new FileWriter(file1);

            bufferedReader = new BufferedReader(fileReader);
            bufferedWriter = new BufferedWriter(fileWriter);

//            char[] chars = new char[5];
//            //fileReader.read(chars)返回个数
//            int len;
//            while ((len = bufferedReader.read(chars)) != -1) {
//                for (int i = 0; i < len; i++) {
//                    System.out.print(chars[i]);
//                }
//            }

            //方式二
            String string;
            while ((string=bufferedReader.readLine())!=null){
                bufferedWriter.write(string);
                bufferedWriter.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    public static void main(String[] args) {

    }
}
