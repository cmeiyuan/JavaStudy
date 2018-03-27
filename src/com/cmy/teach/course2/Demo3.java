package com.cmy.teach.course2;

import java.util.ArrayList;
import java.util.List;

public class Demo3 {

    public static void main(String[] args) {
        byte[] b = new byte[100];

        int[] c = new int[100];

        float[] d = new float[100];

        double[] e = new double[100];

        String[] f = new String[100];

        int length = f.length;
        System.out.println("数组的长度:" + length);

        // 数组的特性
        // 1、元素数据的类型都是一致的
        // 2、它的长度是固定的，不可变的

        // 有没有一种新的数据结构，用起来更方便呢？
        // 列表
        List<String> list = new ArrayList<>();
        // 添加元素
        list.add("我是老大");
        list.add("我是老二");
        list.add("我是老三");
        list.add("我是老四");

        // 删除元素
        list.remove("我是老三");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        int size = list.size();
        System.out.println("列表的长度:" + size);


    }

}
