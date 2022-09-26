public class Main {
    public static void main(String[] args) {
        startMenu();
        // creating a new album with dummy data and test if it will work.
        /*Album testAlbum = new Album("AlbumTest", "this is a structural base of the beast", 2022);
        testAlbum.setAlbum(testAlbum);
        testAlbum.displayAllBands();
        testAlbum.removeAlbum(testAlbum);
        testAlbum.displayAllBands(); */

    }


    private static void startMenu(){
        String topChoose = Input.menu("Välj vad du vill arbeta med? ", "Band", "Album", "Musiker");
        System.out.println(topChoose);
    }

    private static void subMenu(){

    }
}