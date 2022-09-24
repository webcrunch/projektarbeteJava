public class Main {
    public static void main(String[] args) {

        // creating a new album with dummy data and test if it will work.
        Album testAlbum = new Album("AlbumTest", "this is a structural base of the beast", 2022);
        testAlbum.setAlbum(testAlbum);
        testAlbum.displayAllBands();
    }
}