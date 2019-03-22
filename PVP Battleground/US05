import java.util.Random;

public class Fighter extends PlayerCharacter {

    private int constitution;

    public Fighter(String newName) {

        System.out.println("A new Fighter has been created!");

        name = newName;

        Random rand = new Random();

        strength = 15 + (rand.nextInt(6) + 1);
        intelligence = 7 + (rand.nextInt(6) + 1);
        agility = 8 + (rand.nextInt(6) + 1);
        constitution = 10 + (rand.nextInt(6) + 1);

        hp = maxhp = (strength * 2) + (constitution * 2);
        mp = maxmp = 0;

    }

    public void showStats() {
        System.out.printf("%s, a Fighter:\n",name);
        super.showStats();
        System.out.printf("CON: %3d\n",constitution);
    }
}
