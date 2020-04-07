package io.fileType;

import java.io.File;

/**
 * 遍历文件夹下所有文件
 *
 * @Classname exer1
 * @Date 2020/4/3
 * @Created by 陈刀仔
 * @Description TODO
 */


public class exer1 {

    public static long bytes=0;

    public static long method(String path){
        File file=new File(path);
        File[] files=file.listFiles();
        for (File file1 :
                files) {
            if (file1.isFile()){
                bytes+=file1.length();
                System.out.println(file1.getPath());
            }else if (file1.isDirectory()){
                method(file1.getPath());
            }
        }

        return bytes;
    }

    public static void main(String[] args) {
        System.out.println(method("E:\\定格"));
    }
}
