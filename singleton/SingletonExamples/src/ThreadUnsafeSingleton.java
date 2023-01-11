public class ThreadUnsafeSingleton {
    private static ThreadUnsafeSingleton instance;
    private ThreadUnsafeSingleton() {} // Private so no classes can create new ones
    public static ThreadUnsafeSingleton getInstance() {
        if (instance == null) {
            instance = new ThreadUnsafeSingleton();
        }
        return instance;
    }
}
