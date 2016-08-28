package observer.second;

/**
 * Created by sergei on 8/28/16.
 */

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import java.util.Observer;

public class WeatherData extends Observable {
    private float temperature;
    private float humidity;
    private float pressure;


    public void measurementsChanged() {
        // Метод сообщает позволяет зафиксировать изменения, без него notifyObservers работать не будет
        setChanged();

        // Объект данных не передается (в качестве аргумента) - это означает,
        // что мы используем модель ЗАПРОСА ДАННЫХ (по средства геттеров)
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
