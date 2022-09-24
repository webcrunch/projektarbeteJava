import java.util.ArrayList;
public class Band {
    // kanske lägga ihop vissa strings? members + instruments i samma? (kolla med grupp)
    // hashmap för members och instrument?

    public String bandName;

    public String bandInfo;

    public int yearFounded;

    public String members;

    public String disbanded;

    public String instruments;

    public Band(String bandName, String members, int yearFounded) {

    }
    public ArrayList<Band> bands = new ArrayList<>();
    public void addBand(Band bandToAdd) {
        if (!bandToAdd.bands.contains(this)) {
            bandToAdd.joinBand(this);
        }
        if (!bands.contains(bandToAdd)) {
            bands.add(bandToAdd);
        }
    }
    public void joinBand(Band bandToJoin) {
        if (!bands.contains(bandToJoin)) {
            bands.add(bandToJoin);
        }
        if (!bandToJoin.bands.contains(this)) {
            bandToJoin.addBand(this);
        }
    }
    public void removeBand(Band bandToRemove) {
        bands.remove(bandToRemove);
        if (bandToRemove.bands.contains(this)) {
            bandToRemove.removeBand(this);
        }
    }
}
