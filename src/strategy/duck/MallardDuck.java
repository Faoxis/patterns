package strategy.duck;

import strategy.duck.fly.FlyWithWings;
import strategy.duck.quack.Quack;

/**
 * Created by sergei on 8/12/16.
 */
public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
