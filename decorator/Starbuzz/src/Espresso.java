public class Espresso extends Beverage {
    public Espresso() {
        description += " Espresso";
    }
    @Override
    public double cost() {
        switch (size) {
            case GRANDE:
                return 2.99;
            case VENTE:
                return 3.99;
            default:
                return 1.99;
        }
    }
}
