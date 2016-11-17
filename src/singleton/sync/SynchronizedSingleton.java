package singleton.sync;

/**
 * Created by sergei on 11/17/16.
 */
public class SynchronizedSingleton {
    private static volatile SynchronizedSingleton instance;

    private SynchronizedSingleton() {}

    public SynchronizedSingleton getInstance() {

        if (instance == null) {
            synchronized (SynchronizedSingleton.class) {
                if (instance == null) {
                    instance = new SynchronizedSingleton();
                }
            }
        }

        return instance;
    }

}
