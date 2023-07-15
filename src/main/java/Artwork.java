public class Artwork {

    private String title;
    private Artist artist;
    private int price;

    public Artwork(String title, Artist artist, int price){
        this.title = title;
        this.artist = artist;
        this.price = price;
    }

    public String getTitle(){
        return this.title;
    }

    public Artist getArtist(){
        return this.artist;
    }


}
