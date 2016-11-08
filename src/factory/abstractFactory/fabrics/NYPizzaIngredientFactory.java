package factory.abstractFactory.fabrics;

import factory.abstractFactory.ingredients.cheese.Cheese;
import factory.abstractFactory.ingredients.cheese.ReggianoCheese;
import factory.abstractFactory.ingredients.dough.Dough;
import factory.abstractFactory.ingredients.dough.ThinCrustDough;
import factory.abstractFactory.ingredients.sauce.MarinaraSauce;
import factory.abstractFactory.ingredients.sauce.Sauce;

/**
 * Created by sergei on 11/2/16.
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    public Dough createDough() {
        return new ThinCrustDough();
    }

    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    public Cheese createCheese() {
        return new ReggianoCheese();
    }
}
