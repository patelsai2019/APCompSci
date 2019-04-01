import java.util.ArrayList;

public class Main {

    ArrayList<String> shipNames;

    public static void main(String[] args) {

        String[] rawNames = new String[] {"Reliant","Enterprise","Yorktown","Saratoga","Voyager","Discovery","Constitution","Constellation","Grissom","Defiant","Intrepid","Britaan","Stargazer","Yamato","Galaxy","Ambassador","Nimitz","Equinox","Relativity","Challenger"};
        ArrayList<String> shipNames = new ArrayList<String>();
        for (String s : rawNames)
            shipNames.add(s);

        ArrayList<Starship> fleet = new ArrayList<Starship>();
        for (int i = 0; i < 20; i+=4)
        {
            fleet.add(new Escort(shipNames.remove(0)));
            fleet.add(new Frigate(shipNames.remove(0)));
            fleet.add(new Cruiser(shipNames.remove(0)));
            fleet.add(new Battleship(shipNames.remove(0)));
        }

        System.out.println("Overall available fleet:");
        for (Starship x : fleet) {
            x.showStats();
        }

        ArrayList<IsDefense> defBattalion = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            int statSum = 0;
            int maxIndex = 0;
            for (int j = 0; j < fleet.size(); j++) {
                if ((fleet.get(j).hull + fleet.get(j).shield) > statSum && fleet.get(j) instanceof IsDefense) {
                    statSum = fleet.get(j).hull + fleet.get(j).shield;
                    maxIndex = j;
                }
            }
            defBattalion.add((IsDefense) fleet.remove(maxIndex));
        }

        ArrayList<IsOffense> offBattalion = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            int statSum = 0;
            int maxIndex = 0;
            for (int j = 0; j < fleet.size(); j++) {
                if ((fleet.get(j).hull + fleet.get(j).shield) > statSum && fleet.get(j) instanceof IsOffense) {
                    statSum = fleet.get(j).hull + fleet.get(j).shield;
                    maxIndex = j;
                }
            }
            offBattalion.add((IsOffense) fleet.remove(maxIndex));
        }

        System.out.println("Defense Battalion:");
        for (IsDefense x : defBattalion )
            x.showStats();
        System.out.println("Offense Battalion:");
        for (IsOffense x : offBattalion )
            x.showStats();
    }
}
