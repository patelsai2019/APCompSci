import java.util.Random;

public class Mage extends PlayerCharacter {

    int wisdom;

    public Mage(String newName) {

        System.out.println("A new Mage has been created!");

        name = newName;

        Random rand = new Random();

        strength = 7 + (rand.nextInt(6) + 1);
        intelligence = 15 + (rand.nextInt(6) + 1);
        agility = 8 + (rand.nextInt(6) + 1);
        wisdom = 10 + (rand.nextInt(6) + 1);

        hp = maxhp = strength;
        mp = maxmp = intelligence + (2 * wisdom);

    }

    public void showStats() {
        System.out.printf("%s, a Mage:\n",name);
        super.showStats();
        System.out.printf("WIS: %3d\n",wisdom);
    }
}
