public class King extends Character {
    public King() {
        weaponBehavior = new KnifeBehavior();
    }
    @Override
    public void fight() {
        weaponBehavior.useWeapon();
    }
}
