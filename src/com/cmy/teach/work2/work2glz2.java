package com.cmy.teach.work2;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class work2glz2 {
    public static void main(String[] args){
        String path = "http://www.huitu.com/photo/show/20170509/002021941011.html";
        //图片储存地址
        String filepath = "E:\\che.html";
        try {
            URL url = new URL(path);
            HttpURLConnection a = (HttpURLConnection) url.openConnection();
            InputStream inputStream = a.getInputStream();
            File downloadfile = new File(filepath);
            downloadfile.createNewFile();
            FileOutputStream outputStream = new FileOutputStream(downloadfile);
            byte [] b = new byte[1024];
            int c = 0;
            while ((c = inputStream.read(b)) != -1 ){
                 outputStream.write(b,0,c);
            }
            System.out.println("打印成功");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
