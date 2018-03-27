package com.cmy.teach.work1;

import javax.imageio.stream.FileImageInputStream;
import java.io.File;
import java.io.IOException;
public class Work1glz {
    public static void main(String[] args) {
        String path = "C:\\Users\\Administrator\\Desktop\\hu.jpg";
        File file = new File(path);
        if (!file.exists()) {
            System.out.println("图片不存在");
            return;
        } else {
            System.out.println("图片存在");
        }
        try {
            FileImageInputStream picture = new FileImageInputStream(file);
            byte[] adc = new byte[1024];
            int count = picture.read(adc);
            byte[] a = new byte[count];
            for (int i = 0; i < a.length; i++) {
                a[i] = adc[i];
            }
            String b = new String(a);
            System.out.println(b);
            System.out.println(b.length());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
