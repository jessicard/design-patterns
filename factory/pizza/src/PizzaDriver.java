public class PizzaDriver {
    public void main(String[] args) {
        NYPizzaStore nyStore = new NYPizzaStore();
        nyStore.orderPizza("Veggie");

        ChicagoPizzaStore chicagoStore = new ChicagoPizzaStore();
        chicagoStore.orderPizza("Veggie");
    }
}
