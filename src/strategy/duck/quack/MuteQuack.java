package strategy.duck.quack;

/**
 * Created by sergei on 8/12/16.
 */
public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
