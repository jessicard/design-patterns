public class Mocha extends CondimentDecorator {
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }
    public double cost() {
        double cost;
        switch (size) {
            case GRANDE:
                cost = 0.30;
            case VENTE:
                cost = 0.40;
            default:
                cost = 0.20;
        }

        return beverage.cost() + cost;
    }
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }
}
