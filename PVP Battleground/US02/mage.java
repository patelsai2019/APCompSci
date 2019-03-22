import java.util.Random;

public class Mage {

    String name;

    int strength;
    int intelligence;
    int agility;
    int wisdom;

    int hp, maxhp;
    int mp, maxmp;

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
        System.out.printf("STR: %3d  INT: %3d  AGI: %3d  WIS: %3d\n",strength,intelligence,agility,wisdom);
        System.out.printf(" HP: %3d/%3d\n", hp, maxhp);
        System.out.printf(" MP: %3d/%3d\n", mp, maxmp);
    }
}
