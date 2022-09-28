import java.util.ArrayList;
import com.google.gson.*;

public class ItemStore {

  // Create an array list for each class that extends Item
  public ArrayList<Band> bands = new ArrayList<>();
  public ArrayList<Musiker> musikers = new ArrayList<>();
  public ArrayList<Album> albums = new ArrayList<>();

  // Create a mapping for each field that contains
  // references to other items or list of items that are stored
  public static String[] fieldsToReviveAfterLoad  = {
      // className, fieldName, datatype of field
      //"Band", "bands", "",
      //"Musiker", "", "",
      //"Album", "", ""
  };

  // Add ternaries so that we get the correct list from a className
  public static ArrayList getList(String className){
    return className.equals("Band") ? lists.bands :
           className.equals("Musiker") ? lists.musikers :
           className.equals("Album") ? lists.albums :
           null;
  }

  // Add ternaries so that we get a correct instance from a className
  public static Item getItemFromClassName(String className) {

    return switch (className) {
      case "Band" -> new Band("", null, null);
      case "Musiker" -> new Musiker("", "", null);
      case "Album" -> new Album("", "", null);
      default -> null;
    };
  }
  // ---------- NO NEED TO MODIFY CODE BELOW THIS LINE ------------------------
  // ---------- DO AT YOUR OWN RISK - IF YOU THINK YOU GET HOW TO -------------
  // ---------- ALL YOUR BASE ARE BELONG TO US  -------------------------------

  private static boolean addActive = true;

  public static ItemStore lists = new ItemStore();

  public static String log(Object toLog){
    Gson gson= new GsonBuilder().setPrettyPrinting().create();
    return gson.toJson(toLog);
  }

  public static void log(){
    System.out.println(log(lists));
  }

  public static void save(String filePath){
    Gson gson= new GsonBuilder().setPrettyPrinting().create();
    String json = gson.toJson(lists);
    ItemFileHandler.write(filePath, json);
  }

  public static void load(String filePath){
    addActive = false;
    String json = ItemFileHandler.read(filePath);
    Gson gson= new GsonBuilder().setPrettyPrinting().create();
    lists = gson.fromJson(json, ItemStore.class);
    lists.reviveAfterLoad();
    addActive = true;
  }

  public static void add(Item item){
    if(!addActive){ return; }
    String className = item.getClass().getSimpleName();
    ArrayList list = getList(className);
    if(item.id != null){ return; }
    item.id = className + (list.size() + 1);
    list.add(item);
  }

  public void reviveAfterLoad(){
    for(int i = 0; i < fieldsToReviveAfterLoad.length - 2; i += 3){
      String className = fieldsToReviveAfterLoad[i];
      String fieldName = fieldsToReviveAfterLoad[i + 1];
      String dataType = fieldsToReviveAfterLoad[i + 2];
      for(Object item : getList(className)){
        try {
          Object value = item.getClass().getField(fieldName).get(item);
          if(value.getClass().getSimpleName().equals("ArrayList")){
            ArrayList list = (ArrayList) value;
            for(int j = 0; j < list.size(); j++) {
              String refId = ((Item) list.get(j)).id.substring(5);
              for(Object thing : getList(dataType)){
                if(((Item) thing).id.equals(refId)){
                  list.set(j, thing);
                }
              }
            }
          }
          else {
            String refId = ((Item) value).id.substring(5);
            for(Object thing : getList(dataType)){
              if(((Item) thing).id.equals(refId)) {
                item.getClass().getField(fieldName).set(item, thing);
              }
            }
          }
        }
        catch(Exception ignore){}
      }
    }
  }

}
