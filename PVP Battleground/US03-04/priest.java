import java.util.Random;

public class Priest extends PlayerCharacter {

    int charisma;

    public Priest(String newName) {

        System.out.println("A new Paladin has been created!");

        name = newName;

        Random rand = new Random();

        strength = 7 + (rand.nextInt(6) + 1);
        intelligence = 15 + (rand.nextInt(6) + 1);
        agility = 8 + (rand.nextInt(6) + 1);
        charisma = 10 + (rand.nextInt(6) + 1);

        hp = maxhp = strength;
        mp = maxmp = intelligence + (2 * charisma);

    }

    public void showStats() {
        System.out.printf("%s, a Priest:\n",name);
        super.showStats();
        System.out.printf("CHA: %3d\n",charisma);
    }
}
