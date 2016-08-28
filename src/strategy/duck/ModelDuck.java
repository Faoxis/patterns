package strategy.duck;

import strategy.duck.fly.FlyNoWay;
import strategy.duck.quack.Quack;

/**
 * Created by sergei on 8/14/16.
 */
public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("I'm a model duck");
    }
}
