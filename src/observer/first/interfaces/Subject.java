package observer.first.interfaces;

/**
 * Created by sergei on 8/28/16.
 */
public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
