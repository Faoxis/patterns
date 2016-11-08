package factory.abstractFactory.fabrics;

import factory.abstractFactory.ingredients.cheese.Cheese;
import factory.abstractFactory.ingredients.dough.Dough;
import factory.abstractFactory.ingredients.sauce.Sauce;

/**
 * Created by sergei on 11/2/16.
 */
public interface PizzaIngredientFactory {
    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
}
