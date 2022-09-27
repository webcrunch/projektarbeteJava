import java.util.ArrayList;
import java.util.List;

public class Band {
    private String bandName;

    private String bandInfo;

    private int yearFounded;

    private int yearDisbanded;

    private String instruments;
    private List<Musiker> members=new ArrayList<>();
    public ArrayList<Band> bands = new ArrayList<>();
    public Band(String bandName, int yearFounded, int yearDisbanded) {
        this.bandName = bandName;
        this.yearFounded = yearFounded;
        this.yearDisbanded = yearDisbanded;
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
}
