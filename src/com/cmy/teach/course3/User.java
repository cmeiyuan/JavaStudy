package com.cmy.teach.course3;

public class User {

    // 单例模式
    private static User instance;

    private String userName;

    // 私有的构造方法
    private User(String name) {
        this.userName = name;
    }

    public String getUserName() {
        return userName;
    }

    public static User getInstance(String name) {
        if(instance == null){
            instance = new User(name);
        }
        return instance;
    }

}
