package com.cmy.teach.course2;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class Demo2 {

    // 下载一个图片
    public static void main(String[] args) {

        // 文件路径
        String path = "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1522165972619&di=04d2af239c77028eee90b3f32424b792&imgtype=0&src=http%3A%2F%2Fimg5.xiazaizhijia.com%2Fwalls%2F20160708%2F1440x900_2f172c09d079701.jpg";
        String filePath = "D:\\src\\test\\demo4.jpg";

        try {
            // 转换URL
            URL url = new URL(path);
            // 连接服务器
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            // 获取输入流
            InputStream inputStream = conn.getInputStream();
            // 定义一个下载文件
            File downloadFile = new File(filePath);
            // 创建
            downloadFile.createNewFile();
            // 创建一个输出流
            OutputStream outputStream = new FileOutputStream(downloadFile);
            // 读取数据
            int count;
            byte[] b = new byte[1024];
            while ((count = inputStream.read(b)) != -1) {
                // 把缓存区的数据写到输出流中
                outputStream.write(b, 0, count);
            }

            System.out.println("下载成功");

        } catch (Exception e) {
            e.printStackTrace();
        }

        // IO

    }

}
