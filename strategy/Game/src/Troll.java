public class Troll extends Character {
    public Troll() {
        weaponBehavior = new AxeBehavior();
    }
    @Override
    public void fight() {
        weaponBehavior.useWeapon();
    }
}