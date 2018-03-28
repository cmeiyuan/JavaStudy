package com.cmy.teach.course2;

public class Demo4 {

    public static void main(String[] args) {

        // Throwable 可抛出的错误
        // Exception 异常


        // NullPointerException 空指针异常

        User user = createUser();

//        if (user != null) {
//            user.eat();
//        } else {
//            System.out.println("用户未登录");
//        }

        try{
            user.eat();
        }catch (Exception e){
            if(e instanceof NullPointerException){
                System.out.println("该用户不存在");
            }
        }

    }

    private static User createUser() {
        return null;
    }


    public static class User {

        public void eat() {
            System.out.println("吃饭");
        }

    }

}
