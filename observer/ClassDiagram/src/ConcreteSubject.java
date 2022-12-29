public class ConcreteSubject implements Subject {
    public void getState() {
        // get state
    }
    public void setState() {
        // set state
    }
    @Override
    public void registerObserver(Observer observer) {
        // register a single observer
    }

    @Override
    public void removeObserver(Observer observer) {
        // remove a single observer
    }

    @Override
    public void notifyObservers() {
        // push an update out to all observers
    }
}
