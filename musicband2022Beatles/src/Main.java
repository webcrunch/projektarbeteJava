import java.util.ArrayList;
import java.util.List;

public class Main {

    public static List<Band> bandList = new ArrayList<>();
    public static void main(String[] args) {
        mainMenu();
        // creating a new album with dummy data and test if it will work.
        /*Album testAlbum = new Album("AlbumTest", "this is a structural base of the beast", 2022);
        testAlbum.setAlbum(testAlbum);
        testAlbum.displayAllBands();
        testAlbum.removeAlbum(testAlbum);
        testAlbum.displayAllBands(); */

    }


    private static void mainMenu(){ //mainMenu
        switch(Input.menu("Vad vill du göra? ", "Lägg till", "Ta bort", "Visa")){
            case "Lägg till":
               handlingChooses(Input.menu("Vad vill du Lägga till?", "Band", "Album", "Musiker"), "Lägg till");
                break;
            case "ta bort":
                handlingChooses(Input.menu("Vad vill du ta bort?", "Band", "Album", "Musiker"), "Ta bort");
                break;
            case "Visa":
                handlingChooses(Input.menu("Vad vill du Visa?" , "Band", "Album", "Musiker"), "Visa");
                break;
            default:
        }

    }

    private static void handlingChooses(String members, String action ){ // change name ?? menuOptions

    }
}