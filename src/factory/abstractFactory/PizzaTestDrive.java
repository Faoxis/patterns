package factory.abstractFactory;

import factory.abstractFactory.pizza.Pizza;
import factory.abstractFactory.store.NYPizzaStore;


public class PizzaTestDrive {
    public static void main(String[] args) {
        NYPizzaStore nyStore = new NYPizzaStore();
        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println(pizza);
    }
}
