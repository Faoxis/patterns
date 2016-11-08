package decorator.beverages;

import decorator.root.Beverage;

/**
 * Created by sergei on 8/31/16.
 */
public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "Dark Roast Coffee";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
