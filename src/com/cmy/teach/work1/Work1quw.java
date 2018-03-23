package com.cmy.teach.work1;

import javax.imageio.stream.FileImageInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Work1quw {
    public static void main(String[] args) {
        String path = "C:\\Users\\Administrator\\Desktop\\icon.png";
        File file = new File(path);
        if (!file.exists()) {
            System.out.println("文件不存在");
            return;
        } else {
            System.out.println("文件存在");
        }
        try {
            FileImageInputStream img = new FileImageInputStream(file);
            byte[] a = new byte[1024];
            img.read(a);
            String icon = new String(a);
            System.out.println("");
            System.out.println("");
            System.out.println("文件为：" + icon.length() + "字节");
            System.out.println("");
            System.out.println("");
            System.out.println(icon);
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}

