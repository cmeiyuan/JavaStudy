package com.cmy.teach.course4;

import java.lang.reflect.Field;

public class Demo2 extends Demo1 {

    @Override
    public void say() {
        super.say();
    }

    public static void main(String[] args) {
        User user = new User("陈美圆", "123456");

//        // 反射
//        try {
//            Class cls = Class.forName("com.cmy.teach.course4.User");
//            Field field = cls.getDeclaredField("userName");
//            field.setAccessible(true);
//            String userName = (String) field.get(user);
//            System.out.println(userName);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        try {
            Class cls = Class.forName("com.cmy.teach.course4.User");

            Field[] fields = cls.getDeclaredFields();

            for (Field field : fields) {
                System.out.println(field.getName());
                MyAnnotation annotation = field.getAnnotation(MyAnnotation.class);
                if(annotation != null){
                    System.out.println(annotation.value());
                }
             }

        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}
