package com.wdx.strategy;

/**
 *
 * Created by Administrator on 2016/11/29 0029.
 */
public abstract  class Duck {
    FlyBehavoir fly;
    QuackBehavoir quack;

    public abstract void disply();
    public void swim(){
        System.out.println("swimming");
    }

    public void flyDemo(){
        fly.fly();
    }

    public void quackDemp(){
        quack.quack();
    }

    public void setFlyBehavoir(FlyBehavoir fly){
        this.fly=fly;
    }

    public void setQuackBehavoir(QuackBehavoir quack){
        this.quack=quack;
    }
}
