package com.cmy.teach.course2;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Demo1 {

    public static void main(String[] args) {
        // 流的操作
        // 用文件流，读取一个文本文档的内容

        // 文件路径
        String path = "D://src/test/demo1.txt";
        // 创建一个文件对象
        File file = new File(path);

        // 判断文件是否存在
        if (!file.exists()) {
            System.out.println("文件不存在");
            return;
        } else {
            System.out.println("文件存在");
        }

        // 新建一个文件输入流对象
        try {

            // 7000B
            // 6*1024= 6144
            // 7000 - 6144 = 856
            FileInputStream inputStream = new FileInputStream(file);
            byte[] b = new byte[1024];
            int count = 0;
            int c;
            // 列表
            while ((c = inputStream.read(b)) != -1) {
                System.out.println("c:" + c);
                count += c;
            }

            System.out.println(count);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
