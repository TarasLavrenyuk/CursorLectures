package singleton;

public class SingletonExample {

    static private SingletonExample instance;

    private SingletonExample() { }

    public static SingletonExample getInstance() {
        if (instance == null) {
            instance = new SingletonExample();
        }
        return instance;
    }
}
