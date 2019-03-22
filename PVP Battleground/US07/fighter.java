public class Fighter extends PlayerCharacter {

    private int constitution;

    public Fighter(String newName) {

        System.out.println("A new Fighter has been created!");

        name = newName;

        strength = 15 + Die.roll();
        intelligence = 7 + Die.roll();;
        agility = 8 + Die.roll();;
        constitution = 10 + Die.roll();;

        hp = maxhp = (strength * 2) + (constitution * 2);
        mp = maxmp = 0;

    }

    public void showStats() {
        System.out.printf("%s, a Fighter:\n",name);
        super.showStats();
        System.out.printf("CON: %3d\n",constitution);
    }
}
