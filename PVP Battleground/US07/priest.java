public class Priest extends PlayerCharacter {

    private int charisma;

    public Priest(String newName) {

        System.out.println("A new Paladin has been created!");

        name = newName;

        strength = 7 + Die.roll();;
        intelligence = 15 + Die.roll();;
        agility = 8 + Die.roll();;
        charisma = 10 + Die.roll();;

        hp = maxhp = strength;
        mp = maxmp = intelligence + (2 * charisma);

    }

    public void showStats() {
        System.out.printf("%s, a Priest:\n",name);
        super.showStats();
        System.out.printf("CHA: %3d\n",charisma);
    }
}
