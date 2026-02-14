public class GameApp {
    public static void main(String[] args) {
        Character knight = new Character(new SwingSword(), new Shield());
        System.out.print("Knight: ");
        knight.attack();
        knight.defend();

        Character wizard = new Character(new CastSpell(), new CreateMagic());
        System.out.print("Wizard: ");
        wizard.attack();
        wizard.defend();

        Character archer = new Character(new ShootArrow(), new Dodge());
        System.out.print("Archer: ");
        archer.attack();
        archer.defend();
    }
}