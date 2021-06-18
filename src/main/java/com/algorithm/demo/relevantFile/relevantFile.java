package com.algorithm.demo.relevantFile;

import cn.hutool.core.io.FileUtil;
import cn.hutool.http.HttpUtil;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * @author WeiXiang
 * @Description ： 根据URL下载文件
 * @date 2021-03-11
 */
public class relevantFile {

    public static void main(String[] args) {


        BufferedReader bufferedReader;
        String encoding = "UTF-8";
        File file = new File("./file/lyz326.txt");
        List<String> allFile = new ArrayList<>();
        try {

            if (file.isFile() && file.exists()) {
                //判断文件是否存在
                InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), encoding);
                bufferedReader = new BufferedReader(inputStreamReader);
                String line;
                int count = 0;

                while ((line = bufferedReader.readLine()) != null) {
                    System.out.println("读到的信息是：" + line);
                    if (line.trim().length() == 0) {
                        continue;
                    }
                    allFile.add(line);
                    count++;

                }
                inputStreamReader.close();
                System.out.println("文件中摆摊活动的数量  " + count);
                System.out.println("列表的大小为 " + allFile.size());
            }

            allFile.stream().parallel().forEach(item ->
                    HttpUtil.downloadFile(item, FileUtil.file("E:\\vist_record_2021_03_26")
                    ));

        } catch (Exception e) {
            e.printStackTrace();
        }





        /*for (String fileUrl : allFile) {

            //带进度显示的文件下载
            HttpUtil.downloadFile(fileUrl, FileUtil.file("E:\\vist_record_2021_03_26"), new StreamProgress(){

                @Override
                public void start() {
                    Console.log("开始下载。。。。");
                }

                @Override
                public void progress(long progressSize) {
                    Console.log("已下载：{}", FileUtil.readableFileSize(progressSize));
                }

                @Override
                public void finish() {
                    Console.log("下载完成！");
                }
            });


        }*/


    }
}
