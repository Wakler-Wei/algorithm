package com.algorithm.demo.relevantFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * @author WeiXiang
 * @Description ：
 * @date 2021-03-17
 */
public class formatTxt {


    public static void main(String[] args) {

        BufferedReader bufferedReader;
        String encoding = "UTF-8";
        File file = new File("./file/tape_url.txt");
        List<String> allFile = new ArrayList<>();
        try {
            if (file.isFile() && file.exists()) {
                //判断文件是否存在
                InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), encoding);
                bufferedReader = new BufferedReader(inputStreamReader);
                String line;
                int count =0;

                while ((line = bufferedReader.readLine()) != null) {
                    System.out.println("读到的信息是：" + line);
                    if (line.trim().length() == 0) {
                        continue;
                    }
                    allFile.add(line);
                    count ++ ;

                }
                inputStreamReader.close();
                System.out.println("文件中摆摊活动的数量  "+count);
                System.out.println("列表的大小为 " + allFile.size());
            }

        }catch (Exception e){
            e.printStackTrace();
        }



    }
}
