import javax.accessibility.AccessibleValue;

public class DarkRoast extends Beverage {
    public DarkRoast() {
        description += " Dark Roast Coffee";
    }
    @Override
    public double cost() {
        switch(size) {
            case GRANDE:
                return 1.99;
            case VENTE:
                return 2.99;
            default:
                return 0.99;
        }
    }
}
