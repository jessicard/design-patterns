public class EnumSingleton {
    public enum Singleton { INSTANCE };
    public static void main(String[] args) {
        Singleton singleton = Singleton.INSTANCE;
    }
}
