package factory.factoryMethod.store;

import factory.factoryMethod.pizza.Pizza;

/**
 * Created by sergei on 9/7/16.
 */
public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza;

        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.box();

        return pizza;
    }

    abstract Pizza createPizza(String type);
}
