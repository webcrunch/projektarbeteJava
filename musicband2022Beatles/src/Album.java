import java.util.ArrayList;

public class Album {
    public String name;
    public String info;
    public int year;
    // Remove the arraylist??. Only using it to test so the creation of album is working...
    public ArrayList<Album> albums = new ArrayList<>();
    public Album(String name, String info, int year){
        this.name = name;
        this.info = info;
        this.year = year;
    }
    public void removeAlbum(Album album){
        albums.remove(album);
    }

    public void setAlbum(Album album){
        albums.add(album);
    }
    // for the test of creation of Album
    public void displayAllBands(){
        for (Album album: albums){
            System.out.println(album.name);
        }
    }
}