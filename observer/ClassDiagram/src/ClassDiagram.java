public class ClassDiagram {
    public static void main(String[] args) {
        System.out.println("Hello World");

        Observer observer = new ConcreteObserver();
        Subject subject = new ConcreteSubject();

        subject.registerObserver(observer);
        subject.notifyObservers();
    }
}
