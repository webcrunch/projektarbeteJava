import java.io.File;
import java.io.IOException;

public class FileHandling {

    public FileHandling(){
    }

    public void fileCreation(String name){
        createFile(name);
    }

    private static String readFromFile(String fileName){
      return "ej";
    };
    private static String writeToFile(String content){
        return "eheej";
    };
    private static String createFile(String fileName){
        return "hej";
        /*try {

        } ;
        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
            return "An Error";
        }*/
    }
}
