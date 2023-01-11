public class FastSingleton {
    // volatile ensures that multiple threads handle the instance var
    // correctly when it is being initialized to the instance
    private volatile static FastSingleton instance;
    private FastSingleton() {} // Private so no classes can create new ones
    public static FastSingleton getInstance() { // Force every thread to wait its turn to enter method
        if (instance == null) {
            synchronized (FastSingleton.class) {
                if (instance == null) {
                    instance = new FastSingleton();
                }
            }
        }
        return instance;
    }
}
