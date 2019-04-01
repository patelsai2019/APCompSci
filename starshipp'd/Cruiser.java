import java.util.ArrayList;

public class Cruiser extends Starship implements IsOffense {

    public Cruiser(String name) {
        registry = name;

        hullRange = new int[] {2000,2500};
        shieldRange = new int[] {2000,2500};
        beamRange = new int[] {3000,4000};
        torpRange = new int[] {20,35};

        hull = getRandomWithin(hullRange);
        shield = getRandomWithin(shieldRange);
        beam = getRandomWithin(beamRange);
        torp = getRandomWithin(torpRange);
    }

}
