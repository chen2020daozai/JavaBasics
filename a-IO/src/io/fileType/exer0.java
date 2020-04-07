package io.fileType;

import java.io.File;

/**
 * 判断一个文件夹下是否有某种后缀的文件
 *
 * @Classname exer0
 * @Date 2020/4/3
 * @Created by 陈刀仔
 * @Description TODO
 */

public class exer0 {

    public static Boolean method(String path,String suffix){
        File fileDir=new File(path);
        File[] fileNames=fileDir.listFiles();
        Boolean ifHave=false;
        for (File file :
                fileNames) {
            String name=file.getName();
            if (name.endsWith(suffix)){
                System.out.println(name);
                ifHave=true;
            }
        }
        return ifHave;
    }

    public static void main(String[] args) {
        File file=new File("E:\\定格\\PC\\电脑壁纸");
        String path="E:\\定格\\PC\\电脑壁纸";
        System.out.println(method(path,".jpg"));
    }
}
