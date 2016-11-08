package strategy.duck.fly;

/**
 * Created by sergei on 8/12/16.
 */
public class FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("I can't fly");
    }
}
