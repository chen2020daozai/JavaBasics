package Utils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

/**
 * @Classname MyException
 * @Date 2020/3/25 15:46
 * @Created by 陈刀仔
 * @Description TODO
 */

public class show {

    public static void main(String[] args) {
        try {
            File file = new File("/Users/mac/Pictures/test.JPEG");
            byte[] fileByte = Files.readAllBytes(file.toPath());
            System.out.println("Success");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

