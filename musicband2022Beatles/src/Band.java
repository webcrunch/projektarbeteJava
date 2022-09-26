import java.util.ArrayList;
import java.util.List;

public class Band {
    private String bandName;

    private String bandInfo;

    private int yearFounded;

    private List<Musiker> members=new ArrayList<>();

    private int yearDisbanded;

    private String instruments;

    public ArrayList<Band> bands = new ArrayList<>();
    public Band(String bandName, int yearFounded, int yearDisbanded) {
        this.bandName = bandName;
        this.yearFounded = yearFounded;
    }

    public void addMember(Musiker musiker){
               if (!members.contains(musiker))      {
                   members.add(musiker);
               }
    }

    public void kickMember(Musiker musiker){
        members.remove(musiker);
    }
    public void joinBand(Band bandToJoin) {
        if (!bands.contains(bandToJoin)) {
            bands.add(bandToJoin);
        }
        if (!bandToJoin.bands.contains(this)) {
           // bandToJoin.addBand(this);
        }
    }
    public void removeBand(Band bandToRemove) {
        bands.remove(bandToRemove);
        if (bandToRemove.bands.contains(this)) {
            bandToRemove.removeBand(this);
        }
    }
}
