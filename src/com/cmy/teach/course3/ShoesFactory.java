package com.cmy.teach.course3;

public class ShoesFactory {

    public static Shoes generateShoes(String typeName) {
        if (typeName.equals("运动鞋")) {
            return new SportShoes();
        } else if (typeName.equals("体闲鞋")) {
            return new FallowShoes();
        }
        return null;
    }

}
