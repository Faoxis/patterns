package observer.first.classes;

import observer.first.interfaces.Observer;
import observer.first.interfaces.DisplayElement;
import observer.first.interfaces.Subject;

/**
 * Created by sergei on 8/28/16.
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData;


    /*
    Конструктору передается объект WeatherData,
    который используется для регистрации элемента в качестве наблюдателя.
     */
    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "F degress and " + humidity + "% humidity");
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }
}
