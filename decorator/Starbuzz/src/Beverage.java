public abstract class Beverage {
    protected enum Size { TALL, GRANDE, VENTE };
    Size size = Size.TALL;
    protected String description;

    public Beverage() {
        switch(size) {
            case GRANDE:
                description = "Grande";
            case VENTE:
                description = "Vente";
            default:
                description = "Tall";
        }
    }

    public abstract double cost();

    public void setSize(Size size) {
        this.size = size;
    }
    public Size getSize() {
        return size;
    }
    public String getDescription() {
        return description;
    }
}
