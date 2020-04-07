package io.file;

import org.junit.Test;

import java.io.*;

/**
 * 缓冲流
 *
 * @Classname BufferdStream
 * @Date 2020/4/3
 * @Created by 陈刀仔
 * @Description TODO
 */

public class BufferdStream {

    @Test
    public void test1() {
        File filesrc = null;
        File filedest = null;
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;


        try {
            filesrc = new File("E:\\定格\\PC\\电脑壁纸\\1.jpg");
            filedest = new File("this.jpg");

            fileInputStream = new FileInputStream(filesrc);
            fileOutputStream = new FileOutputStream(filedest);

            bis = new BufferedInputStream(fileInputStream);
            bos = new BufferedOutputStream(fileOutputStream);

            byte[] bytes = new byte[1024];
            int len;
            while ((len = bis.read(bytes)) != -1) {
                bos.write(bytes, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            //应该先关闭外部流再关闭内部流
            //二次包装的流是外部流
            //关闭外部流会自动关闭内部流
            try {
                if (bis != null) {
                    bis.close();
                }
                if (bos != null) {
                    bos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }


}
