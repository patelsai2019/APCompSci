import java.util.ArrayList;

public class Battleship extends Starship implements IsOffense {

    public Battleship(String name) {
        registry = name;

        hullRange = new int[] {3000,5000};
        shieldRange = new int[] {1500,2000};
        beamRange = new int[] {4000,5000};
        torpRange = new int[] {40,50};

        hull = getRandomWithin(hullRange);
        shield = getRandomWithin(shieldRange);
        beam = getRandomWithin(beamRange);
        torp = getRandomWithin(torpRange);
    }

}
