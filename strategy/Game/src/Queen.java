public class Queen extends Character {
    public Queen() {
        weaponBehavior = new BowAndArrowBehavior();
    }
    @Override
    public void fight() {
        weaponBehavior.useWeapon();
    }
}