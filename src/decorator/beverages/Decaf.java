package decorator.beverages;

import decorator.root.Beverage;

/**
 * Created by sergei on 8/31/16.
 */
public class Decaf extends Beverage {

    public Decaf() {
        description = "Decaf Coffee";
    }


    @Override
    public double cost() {
        return 1.05;
    }
}
