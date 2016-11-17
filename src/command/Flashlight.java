package command;

/**
 * Created by sergei on 11/14/16.
 */
public class Flashlight implements Light {
    public void on() {
        System.out.println("It's light!");
    }
    public void off() {
        System.out.println("It's dark!");
    }
}
