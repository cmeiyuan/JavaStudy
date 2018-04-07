package com.cmy.teach.course4;

public class User {

    @MyAnnotation("用户名")
    private String userName;

    private String passWord;

    private int age;

    @MyAnnotation("性别")
    private String sex;

    public User(String userName, String passWord) {
        this.userName = userName;
        this.passWord = passWord;
    }

}
