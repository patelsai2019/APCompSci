import java.util.Random;

public class Paladin extends PlayerCharacter {

    int wisdom;
    int constitution;

    public Paladin(String newName) {

        System.out.println("A new Paladin has been created!");

        name = newName;

        Random rand = new Random();

        strength = 10 + (rand.nextInt(6) + 1);
        intelligence = 15 + (rand.nextInt(6) + 1);
        agility = 5 + (rand.nextInt(6) + 1);
        wisdom = 10 + (rand.nextInt(6) + 1);
        constitution = 10 + (rand.nextInt(6) + 1);

        hp = maxhp = strength + (2 * constitution);
        mp = maxmp = intelligence + (2 * wisdom);

    }

    public void showStats() {
        System.out.printf("%s, a Paladin:\n",name);
        super.showStats();
        System.out.printf("WIS: %3d\nCON: %3d\n",strength,intelligence,agility,wisdom,constitution);
    }
}
