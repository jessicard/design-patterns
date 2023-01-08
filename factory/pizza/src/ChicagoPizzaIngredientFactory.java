public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozarellaCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[] = { new BlackOlive(), new Onion(), new Mushroom(), new GreenPepper() };
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new WholePepperoni();
    }

    @Override
    public Clams createClam() {
        return new FrozenClams();
    }
}
