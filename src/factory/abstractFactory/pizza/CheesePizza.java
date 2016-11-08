package factory.abstractFactory.pizza;

import factory.abstractFactory.fabrics.PizzaIngredientFactory;

/**
 * Created by sergei on 11/2/16.
 */
public class CheesePizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public CheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    // Один и тот же код для множества фабрик...
    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }
}
