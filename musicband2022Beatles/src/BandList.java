import java.util.ArrayList;
import java.util.List;

public class BandList {
    List<Band> bands = new ArrayList<>();

    public void addBand(Band band) {
        if (!band.bands.contains(this)) {
          //  band.joinBand(this);
        }
        if (!bands.contains(band)) {
            bands.add(band);
        }
    }
    public void removeBand(Band bandToRemove) {
        bands.remove(bandToRemove);
        if (bandToRemove.bands.contains(this)) {
          //  bandToRemove.removeBand(this);
        }
    }
}
