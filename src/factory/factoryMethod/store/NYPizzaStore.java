package factory.factoryMethod.store;

import factory.factoryMethod.pizza.NYStyleCheesePizza;
import factory.factoryMethod.pizza.NYStyleVeggiePizza;
import factory.factoryMethod.pizza.Pizza;


public class NYPizzaStore extends PizzaStore {
    public Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new NYStyleCheesePizza();
        } else if (item.equals("veggie")) {
            return new NYStyleVeggiePizza();
        }
        return null;
    }
}
