package com.cmy.teach.course3;

import java.util.ArrayList;
import java.util.List;

/**
 * 被观察者-小偷
 */
public class Xiaotou {

    private List<Observe> observeList = new ArrayList<>();

    // 添加观察者
    public void addObserve(Observe observe) {
        observeList.add(observe);
    }

    public void toudongxi() {
        System.out.println("我要下手了");

        for (int i = 0; i < observeList.size(); i++) {
            observeList.get(i).onToudongxi();
        }

    }

}
