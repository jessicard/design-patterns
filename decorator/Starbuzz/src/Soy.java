public class Soy extends CondimentDecorator {
    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }
    public double cost() {
        return beverage.cost() + 0.15;
    }
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }
}
