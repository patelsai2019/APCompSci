import java.util.Random;

public abstract class Starship {

    protected int hull;
    protected int shield;
    protected int beam;
    protected int torp;

    protected static int[] hullRange;
    protected static int[] shieldRange;
    protected static int[] beamRange;
    protected static int[] torpRange;

    protected String registry;

    protected int getRandomWithin(int[] range) {
        int min = range[0];
        int max = range[1];
        Random r = new Random();
        return r.nextInt(max - min) + min;
    }

    public void showStats() {
        System.out.printf("%15s:\tHull: %d\tShields: %d\tBeam Weapons: %d\tTorpedoes: %d\n",registry,hull,shield,beam,torp);
    }

}
