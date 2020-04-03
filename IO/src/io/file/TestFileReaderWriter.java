package io.file;




import org.junit.Test;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @Classname TestFileReaderWriter
 * @Date 2020/4/3
 * @Created by 陈刀仔
 * @Description TODO
 */

public class TestFileReaderWriter {

    @Test
    /*
     * 复制文件
     * */
    public void test4() {
        File srcFile = new File("hello1.txt");
        File dextFile = new File("hello.txt");
        FileReader fileReader = null;
        FileWriter fileWriter = null;
        try {
            fileReader = new FileReader(srcFile);
            fileWriter = new FileWriter(dextFile, true);

            char[] chars = new char[5];
            int len;
            while ((len = fileReader.read(chars)) != -1) {
                String string = new String(chars);
                fileWriter.append(string, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileReader != null) {
                    fileReader.close();
                }
                if (fileWriter != null) {
                    fileWriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

    @Test
    /*
     * 写入文件
     */
    public void test3() {
        FileWriter fileWriter = null;

        try {
            File file = new File("hello1.txt");
            fileWriter = new FileWriter(file, true);

            fileWriter.append("jfioaj\n");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileWriter != null) {
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    @Test
    public void test1() {
        FileReader fileReader = null;

        try {
            File file = new File("hello.txt");
            fileReader = new FileReader(file);

            char[] chars = new char[5];
            //fileReader.read(chars)返回个数
            int len;
            while ((len = fileReader.read(chars)) != -1) {
                for (int i = 0; i < len; i++) {
                    System.out.print(chars[i]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    @Test
    public void test() {
        FileReader fileReader = null;
        try {
            //1.实例化File类的对象
            //test中的相对路径是在module下的
            File file = new File("hello.txt");

            //2.提供流
            fileReader = new FileReader(file);

            //3.开始读入
            //字符读入
            int read = fileReader.read();
            while (read != -1) {
                System.out.print((char) read);
                read = fileReader.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                //4.关闭流
                if (fileReader != null) {
                    fileReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public static void main(String[] args) {
        //main中的相对路径是对于工程下的
        File file = new File("IO/hello.txt");
        File file1 = new File("IO\\hello.txt");
        System.out.println(file.exists());
        System.out.println(file1.exists());
    }
}
