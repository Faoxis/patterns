package decorator.decorators;

import decorator.root.Beverage;

import java.util.IdentityHashMap;

/**
 * Created by sergei on 8/31/16.
 */
public class Mocha extends CondimentDecorator {
    // Переменная для хранения ссылки
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return 0.2 + beverage.cost();
    }

}
