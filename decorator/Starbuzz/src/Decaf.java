public class Decaf extends Beverage {
    public Decaf() {
        description += " Decaf Coffee";
    }
    @Override
    public double cost() {
        switch(size) {
            case GRANDE:
                return 2.05;
            case VENTE:
                return 3.05;
            default:
                return 1.05;
        }
    }
}
