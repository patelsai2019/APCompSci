public class Main {

    public static void main(String[] args) {

        Fighter playerA = new Fighter("Sentri");
        playerA.showStats();

        Mage playerB = new Mage("Jaana");
        playerB.showStats();

        Paladin playerC = new Paladin("Dupre");
        playerC.showStats();

        Priest playerD = new Priest("Antos");
        playerD.showStats();

        // PlayerCharacter playerX = new PlayerCharacter();

    }
}
