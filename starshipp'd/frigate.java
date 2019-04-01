import java.util.ArrayList;

public class Frigate extends Starship implements IsDefense {

    public Frigate(String name) {
        registry = name;

        hullRange = new int[] {1500,2000};
        shieldRange = new int[] {2000,2500};
        beamRange = new int[] {2500,3500};
        torpRange = new int[] {20,30};

        hull = getRandomWithin(hullRange);
        shield = getRandomWithin(shieldRange);
        beam = getRandomWithin(beamRange);
        torp = getRandomWithin(torpRange);
    }

}
