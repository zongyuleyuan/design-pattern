package com.wdx.strategy;

/**
 *
 * Created by Administrator on 2016/11/29 0029.
 */
public class demoDuck extends Duck {
    @Override
    public void disply() {
        System.out.println("塑料的");
    }

    public static void main(String[] args) {
        Duck duck=new demoDuck();

        duck.setFlyBehavoir(new ufly());
        duck.setQuackBehavoir(new quackable());

        duck.disply();
        duck.swim();
        duck.flyDemo();
        duck.quackDemp();
    }
}
