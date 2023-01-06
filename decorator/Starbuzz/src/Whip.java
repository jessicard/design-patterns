public class Whip extends CondimentDecorator {
    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }
    public double cost() {
        double cost;
        switch (size) {
            case GRANDE:
                cost = 0.20;
            case VENTE:
                cost = 0.30;
            default:
                cost = 0.10;
        }

        return beverage.cost() + cost;
    }
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }
}
