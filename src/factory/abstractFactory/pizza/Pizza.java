package factory.abstractFactory.pizza;

import factory.abstractFactory.ingredients.cheese.Cheese;
import factory.abstractFactory.ingredients.dough.Dough;
import factory.abstractFactory.ingredients.sauce.Sauce;

/**
 * Created by sergei on 11/2/16.
 */
public abstract class Pizza {
    String name;

    Dough dough;
    Sauce sauce;
    Cheese cheese;


    public abstract void prepare();

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("---- " + name + " ----\n");
        if (dough != null) {
            result.append(dough);
            result.append("\n");
        }
        if (sauce != null) {
            result.append(sauce);
            result.append("\n");
        }
        if (cheese != null) {
            result.append(cheese);
            result.append("\n");
        }
        return result.toString();
    }
}