public abstract class PlayerCharacter {

    String name;

    int strength;
    int intelligence;
    int agility;

    int hp, maxhp;
    int mp, maxmp;

    public PlayerCharacter() {

        System.out.println("A new PlayerCharacter!");

    }

    public void showStats() {
        System.out.printf(" HP: %3d/%3d\n", hp, maxhp);
        System.out.printf(" MP: %3d/%3d\n", mp, maxmp);
        System.out.printf("STR: %3d\nINT: %3d\nAGI: %3d\n",strength,intelligence,agility);
    }
}
