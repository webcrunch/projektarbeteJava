import java.time.Year;

public class Musiker {

    private String name;
    private String info;
    private int birthYear;

    private int age(int birthYear){
        return  Input.yearNow() - birthYear;
    }
}
