package com.cmy.teach.work1;

import javax.imageio.stream.FileImageInputStream;
import java.io.File;
import java.io.IOException;

public class Work1glz {
    public static void main(String[] args) {
        String path = "E:\\wenjianjia\\wendan.txt";
        File file = new File(path);
        if (!file.exists()) {
            System.out.println("图片不存在");
        } else {
            System.out.println("图片存在");
        }
        try {
            FileImageInputStream picture = new FileImageInputStream(file);
            byte[] adc = new byte[1024];
            picture.read(adc);
            byte[] a = new byte[adc.length];
            for (int i = 0; i < adc.length; i++) {
                a[i] = adc[i];
            }
            String b = new String(a);
            System.out.println(b.length());
            System.out.println(b);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
