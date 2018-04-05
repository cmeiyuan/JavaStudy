package com.cmy.teach.course3;

public class Main {

    public static void main(String[] args){
        // User user = new User("cmy");

//        User user = User.getInstance("cmy");
//
//        User user1 = User.getInstance("glz");
//
//        System.out.println(user.getUserName());
//        System.out.println(user1.getUserName());

        // java 设计模式23种
        // 单例模式
        // 工厂模式

//        Shoes shoes = ShoesFactory.generateShoes("皮鞋");
//
//        if(shoes != null){
//            System.out.println(shoes.getTypeName());
//        }else{
//            System.out.println("该工厂不支持生产这种鞋");
//        }


        Xiaotou xiaotou = new Xiaotou();

        xiaotou.addObserve(new People("张三"));
        xiaotou.addObserve(new People("李四"));
        xiaotou.addObserve(new People("王五"));
        xiaotou.addObserve(new People("陈六"));
        xiaotou.addObserve(new People("韩七"));

        xiaotou.toudongxi();

    }

}
