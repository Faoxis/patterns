package factory.factoryMethod.store;

import factory.factoryMethod.pizza.ChicagoStyleCheesePizza;
import factory.factoryMethod.pizza.ChicagoStyleVeggiePizza;
import factory.factoryMethod.pizza.Pizza;

public class ChicagoPizzaStore extends PizzaStore {
    Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        } else if (item.equals("veggie")) {
            return new ChicagoStyleVeggiePizza();
        }
        return null;
    }
}
