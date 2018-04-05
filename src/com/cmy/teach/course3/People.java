package com.cmy.teach.course3;

public class People implements Observe{

    private String name;

    public People(String name) {
        this.name = name;
    }

    @Override
    public void onToudongxi() {
        System.out.println("小偷在偷东西，我们冲上去把他打一顿");
    }

}
