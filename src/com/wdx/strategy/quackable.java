package com.wdx.strategy;

/**
 *
 * Created by Administrator on 2016/11/29 0029.
 */
public class quackable implements QuackBehavoir {
    @Override
    public void quack() {
        System.out.println("can quack");
    }
}
