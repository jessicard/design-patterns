public class Game {
    public static void main(String[] args) {
        King king = new King();
        Queen queen = new Queen();
        Knight knight = new Knight();
        Troll troll = new Troll();

        king.fight();
        queen.fight();
        knight.fight();
        troll.fight();

        System.out.println("---------------");

        queen.setWeapon(new KnifeBehavior());
        queen.fight();
    }
}
