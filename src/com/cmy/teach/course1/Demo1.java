package com.cmy.teach.course1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Demo1 {

    public static void main(String[] args) {
        // 流的操作
        // 用文件流，读取一个文本文档的内容

        // 文件路径
        String path = "D://src/test/demo1.txt";
        // 创建一个文件对象
        File file = new File(path);

        // 判断文件是否存在
        if(!file.exists()){
            System.out.println("文件不存在");
            return;
        }else{
            System.out.println("文件存在");
        }

        // 新建一个文件输入流对象
        try {
            FileInputStream inputStream = new FileInputStream(file);
            // 1GB = 1024MB
            // 1MB = 1024KB = 1024 * 1024B
            // 1KB = 1024B
            // 新建一个字节数组，用来存放数据
            byte[] b = new byte[1024];
            // 读取字节数据
            inputStream.read(b);
            // 把字节数据转换为字符串
            String str =  new String(b);
            // 打印
            System.out.println(str);
            System.out.println(str.length());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
