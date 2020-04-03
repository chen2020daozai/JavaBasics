package io.fileType;

import java.io.File;

/**
 * File类常用方法
 *
 * @Classname TestFile
 * @Date 2020/4/3
 * @Created by 陈刀仔
 * @Description TODO
 *
 * a:File类的获取功能
 * public String getAbsolutePath()：获取绝对路径
 * public String getPath() ：获取路径
 * public String getName() ：获取名称
 * public String getParent()：获取上层文件目录路径。若无，返回null
 * public long length() ：获取文件长度（即：字节数）。不能获取目录的长度。
 * public long lastModified() ：获取最后一次的修改时间，毫秒值
 * public String[] list() ：获取指定目录下的所有文件或者文件目录的名称数组
 * public File[] listFiles() ：获取指定目录下的所有文件或者文件目录的File数组
 *
 * b:File类的重命名功能
 * public boolean renameTo(File dest):把文件重命名为指定的文件路径
 *
 * c:File类的判断功能
 * public boolean isDirectory()：判断是否是文件目录
 * public boolean isFile() ：判断是否是文件
 * public boolean exists() ：判断是否存在
 * public boolean canRead() ：判断是否可读
 * public boolean canWrite() ：判断是否可写
 * public boolean isHidden() ：判断是否隐藏
 *
 * d:File类的创建功能
 * public boolean createNewFile() ：创建文件。若文件存在，则不创建，返回false
 * public boolean mkdir() ：创建文件目录。如果此文件目录存在，就不创建了。如果此文件目录的上层目录不存在，也不创建。
 * public boolean mkdirs() ：创建文件目录。如果上层文件目录不存在，一并创建
 * 注意事项：如果你创建文件或者文件目录没有写盘符路径，那么，默认在项目路径下。
 *
 * e:File类的删除功能
 * public boolean delete()：删除文件或者文件夹
 * 删除注意事项：
 * Java中的删除不走回收站。
 * 要删除一个文件目录，请注意该文件目录内不能包含文件或者文件目录
 */

public class TestFile {
    public static void main(String[] args) {
        File file=new File("D:\\testjava\\testfile");
        File file1=new File("D:\\testjava");
        file.mkdirs();
        file.delete();
    }
}
