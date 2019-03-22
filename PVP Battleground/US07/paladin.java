public class Paladin extends PlayerCharacter {

    private int wisdom;
    private int constitution;

    public Paladin(String newName) {

        System.out.println("A new Paladin has been created!");

        name = newName;

        strength = 10 + Die.roll();;
        intelligence = 15 + Die.roll();;
        agility = 5 + Die.roll();;
        wisdom = 10 + Die.roll();;
        constitution = 10 + Die.roll();;

        hp = maxhp = strength + (2 * constitution);
        mp = maxmp = intelligence + (2 * wisdom);

    }

    public void showStats() {
        System.out.printf("%s, a Paladin:\n",name);
        super.showStats();
        System.out.printf("WIS: %3d\nCON: %3d\n",strength,intelligence,agility,wisdom,constitution);
    }
}
