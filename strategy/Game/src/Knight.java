public class Knight extends Character {
    public Knight() {
        weaponBehavior = new SwordBehavior();
    }
    @Override
    public void fight() {
        weaponBehavior.useWeapon();
    }
}