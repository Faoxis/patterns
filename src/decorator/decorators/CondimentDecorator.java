package decorator.decorators;

import decorator.root.Beverage;

/**
 * Created by sergei on 8/30/16.
 * Абстрактный класс для дополнений
 */
public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
}
