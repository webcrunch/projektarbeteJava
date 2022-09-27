import java.time.Year;
import java.util.ArrayList;

public class Musiker {

    private String name;
    private String info;
    private int birthYear;
    private ArrayList<Band> bands = new ArrayList<>();

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setInfo(String info) {
        this.info = info;
    }
    public String getInfo() {
        return info;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }
    public int getBirthYear() {
        return birthYear;
    }

    public ArrayList<Band> getBands() {
        return bands;
    }

    public void setBands(ArrayList<Band> bands) {
        this.bands = bands;
    }

    public Musiker(String name, String info, int birthYear) {
        setName(name);
        setInfo(info);
        setBirthYear(birthYear);
    }



    private int age(int birthYear){
        return  Input.yearNow() - birthYear;
    }

    public void addBand(Band band){
        if(bands.contains(band)){
            System.out.println(this.name + " is already part of this band!");
        }else{
            bands.add(band);
        }
    }

    public void removeBand(Band band){
        if(!bands.contains(band)){
            System.out.println("Band doesn't exist!");
        }else{
            bands.remove(band);
        }
    }



}
