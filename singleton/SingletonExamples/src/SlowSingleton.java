public class SlowSingleton {
    private static SlowSingleton instance;
    private SlowSingleton() {} // Private so no classes can create new ones
    public static synchronized SlowSingleton getInstance() { // Force every thread to wait its turn to enter method
        if (instance == null) { // Lazy loading
            instance = new SlowSingleton();
        }
        return instance;
    }
}
