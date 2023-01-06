public class Soy extends CondimentDecorator {
    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }
    public double cost() {
        double cost;
        switch (size) {
            case GRANDE:
                cost = 0.25;
            case VENTE:
                cost = 0.35;
            default:
                cost = 0.15;
        }

        return beverage.cost() + cost;
    }
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }
}
