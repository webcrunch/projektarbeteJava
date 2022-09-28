import java.time.Year;
import java.util.ArrayList;

public class Musiker extends Item{

    private String name;
    private String info;
    private Integer birthYear;
    private ArrayList<Band> currentBands = new ArrayList<>();

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

    public ArrayList<Band> getCurrentBands() {
        return currentBands;
    }

    public void setCurrentBands(ArrayList<Band> currentBands) {
        this.currentBands = currentBands;
    }

    public Musiker(String name, String info, Integer birthYear) {
        setName(name);
        setInfo(info);
        setBirthYear(birthYear);
        ItemStore.add(this);
    }



    private int age(int birthYear){
        return  Input.yearNow() - birthYear;
    }

    public void addCurrentBand(Band band){
        if(currentBands.contains(band)){
            System.out.println(this.name + " is already part of this band!");
        }else{
            currentBands.add(band);
        }
    }

    public void removeCurrentBand(Band band){
        if(!currentBands.contains(band)){
            System.out.println("Band doesn't exist!");
        }else{
            currentBands.remove(band);
        }
    }
}
