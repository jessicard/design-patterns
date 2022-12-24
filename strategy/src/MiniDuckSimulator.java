public class MiniDuckSimulator{
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        Duck redhead = new RedheadDuck();
        Duck rubber = new RubberDuck();
        Duck decoy = new DecoyDuck();
        Duck model = new ModelDuck();

        mallard.display();
        mallard.performFly();
        mallard.performQuack();

        System.out.println("--------------");

        redhead.display();
        redhead.performFly();
        redhead.performQuack();

        System.out.println("--------------");

        rubber.display();
        rubber.performFly();
        rubber.performQuack();

        System.out.println("--------------");

        decoy.display();
        decoy.performFly();
        decoy.performQuack();

        System.out.println("--------------");

        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}