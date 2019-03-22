public class Mage extends PlayerCharacter {

    private int wisdom;

    public Mage(String newName) {

        System.out.println("A new Mage has been created!");

        name = newName;

        strength = 7 + Die.roll();;
        intelligence = 15 + Die.roll();;
        agility = 8 + Die.roll();;
        wisdom = 10 + Die.roll();;

        hp = maxhp = strength;
        mp = maxmp = intelligence + (2 * wisdom);

    }

    public void showStats() {
        System.out.printf("%s, a Mage:\n",name);
        super.showStats();
        System.out.printf("WIS: %3d\n",wisdom);
    }
}
