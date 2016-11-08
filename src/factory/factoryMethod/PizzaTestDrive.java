package factory.factoryMethod;

import factory.factoryMethod.pizza.Pizza;
import factory.factoryMethod.store.ChicagoPizzaStore;
import factory.factoryMethod.store.NYPizzaStore;
import factory.factoryMethod.store.PizzaStore;

/**
 * Created by sergei on 9/8/16.
 */
public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");
    }
}
