package io.exer;

import org.junit.Test;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Classname WordCount
 * @Date 2020/4/4
 * @Created by 陈刀仔
 * @Description TODO
 */

public class WordCount {

    @Test
    public void test0() {
        Map<Character, Integer> map = new HashMap<>();

        BufferedReader bfr = null;
        BufferedWriter bfw = null;
        try {
            FileReader fileReader = new FileReader("word.txt");
            FileWriter fileWriter = new FileWriter("wordCount.txt",true);

            bfr = new BufferedReader(fileReader);
            bfw = new BufferedWriter(fileWriter);

            String string;
            while ((string = bfr.readLine()) != null) {
                for (Character c :
                        string.toCharArray()) {
                    if (!map.containsKey(c)) {
                        map.put(c, 1);
                    } else {
                        map.put(c, map.get(c) + 1);
                    }
                }
            }

            Set<Map.Entry<Character, Integer>> entrySet = map.entrySet();
            for (Map.Entry<Character, Integer> entry :
                    entrySet) {
                switch (entry.getKey()){
                    case ' ':
                        bfw.write("空格="+entry.getValue());
                        break;
                    case '\t':
                        bfw.write("制表符="+entry.getValue());
                        break;
                    case '\r':
                        bfw.write("回车="+entry.getValue());
                        break;
                    case '\n':
                        bfw.write("换行="+entry.getValue());
                        break;
                    default:
                        bfw.write(entry.getKey()+"="+entry.getValue());
                        break;
                }
                bfw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bfr!=null){
                try {
                    bfr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bfw!=null) {
                try {
                    bfw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }



    }

    public static void main(String[] args) {

    }
}
