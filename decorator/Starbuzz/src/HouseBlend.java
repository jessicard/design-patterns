public class HouseBlend extends Beverage {
    public HouseBlend() {
        description += " House Blend Coffee";
    }
    @Override
    public double cost() {
        switch (size) {
            case GRANDE:
                return 1.89;
            case VENTE:
                return 2.89;
            default:
                return 0.89;
        }
    }
}
