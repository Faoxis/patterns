package decorator.beverages;

import decorator.root.Beverage;

/**
 * Created by sergei on 8/31/16.
 */
public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "House Blend Coffe";
    }

    @Override
    public double cost() {
        return .89;
    }
}
