package fileUtil;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * 把文件夹下某种文件移动到指定文件夹
 * 返回大小和数量
 *
 * @Classname exer1
 * @Date 2020/4/3
 * @Created by 陈刀仔
 * @Description TODO
 */


public class moveFileWithAnySuffix {

    public static long bytes=0;
    public static long numFiles=0;
    public static long bytesWithSuffix=0;
    public static long numFilesWithSuffix=0;

    public static long[] method(String path,String suffix,String dest){
        File file=new File(path);
        File[] files=file.listFiles();
        for (File file1 :
                files) {
            if (file1.isFile()){
                if (file1.getName().endsWith(suffix)) {
                    try {
                        Files.copy(Paths.get(file1.getAbsolutePath()),Paths.get(dest+file1.getName()));
                        bytesWithSuffix+=file1.length();
                        numFilesWithSuffix++;
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                numFiles++;
                bytes+=file1.length();
                System.out.println(file1.getPath());
            }else if (file1.isDirectory()){
                method(file1.getPath(),suffix,dest);
            }
        }
        long[] out=new long[4];
        out[0]=numFiles;
        out[1]=bytes;
        out[2]=numFilesWithSuffix;
        out[3]=bytesWithSuffix;
        return out;
    }

    public static void main(String[] args) {
        long[] out = method("G:\\文档\\java\\javaweb\\spring4", "wmv", "G:\\文档\\java\\javaweb\\spring4-视频\\");
        System.out.println("共   "+out[0]+"  个文件");
        System.out.println("共   "+out[1]+"  内存");
        System.out.println();
        System.out.println("共移动/复制   "+out[2]+"  个suffix文件");
        System.out.println("共移动/复制   "+out[3]+"  内存");
    }
}
