package observer.first.interfaces;

/**
 * Created by sergei on 8/28/16.
 * Интерфейс реализуется всеми наблюдателями.
 * Таким образом, все наблюдатели должны реализовать метод update
 */
public interface Observer {
    void update(float temperature, float humidity, float pressure);
}
