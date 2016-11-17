package singleton.simple;

/**
 * Created by sergei on 11/17/16.
 */
public class SimpleSingleton {
    private static SimpleSingleton instance;

    private SimpleSingleton() {}

    public SimpleSingleton getInstance() {
        if (instance == null) {
            instance = new SimpleSingleton();
        }
        return instance;
    }

}
