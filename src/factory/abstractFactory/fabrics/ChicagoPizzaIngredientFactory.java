package factory.abstractFactory.fabrics;

import factory.abstractFactory.ingredients.cheese.Cheese;
import factory.abstractFactory.ingredients.cheese.MozzarellaCheese;
import factory.abstractFactory.ingredients.dough.ThickCrustDough;
import factory.abstractFactory.ingredients.sauce.PlumTomatoSauce;
import factory.abstractFactory.ingredients.sauce.Sauce;
import factory.abstractFactory.ingredients.dough.Dough;

/**
 * Created by sergei on 11/2/16.
 */
public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory
{

    public Dough createDough() {
        return new ThickCrustDough();
    }

    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

}
