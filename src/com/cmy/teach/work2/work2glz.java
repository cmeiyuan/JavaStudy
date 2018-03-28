package com.cmy.teach.work2;

import java.util.ArrayList;
import java.util.List;

public class work2glz {
    public static void main (String[] args){
        List<Integer> array = new ArrayList<>();
        for (int i = 0 ;i < 100;i++){
            int a = (int) (Math.random()*100);
            array.add(a);
        }
        System.out.println(array);
        int f = 0;
        for (int j = 0; j < array.size(); j++){
            if (array.get(j) >=90){
                System.out.print(array.get(j));
                System.out.print(" ");
                f ++;
            }
            }
            System.out.println("");
            System.out.println("大于等于90的数有"+ f +"个");
            

    }


}
