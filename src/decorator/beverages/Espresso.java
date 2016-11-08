package decorator.beverages;

import decorator.root.Beverage;

/**
 * Created by sergei on 8/31/16.
 */
public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
