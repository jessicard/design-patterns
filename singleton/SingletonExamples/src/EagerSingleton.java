public class EagerSingleton {
    private static EagerSingleton instance = new EagerSingleton();
    private EagerSingleton() {} // Private so no classes can create new ones
    public static EagerSingleton getInstance() {
        return instance;
    }
}
