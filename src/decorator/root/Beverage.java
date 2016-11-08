package decorator.root;

/**
 * Created by sergei on 8/30/16.
 */
public abstract class Beverage {
    protected String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }
    public abstract double cost();
}
