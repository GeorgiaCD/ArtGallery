import java.util.ArrayList;
public class Gallery {

    private String name;
    private int till;
    private ArrayList<Artwork> artworks;

    public Gallery(String inputName){
        this.name = inputName;
        this.till = 0;
        this.artworks = new ArrayList<Artwork>();
    }

    public String getName(){
        return this.name;
    }


    public int getTillAmount(){
        return this.till;
    }

    public void setTillAmount(int amount){
        this.till += amount;
    }
    //adding artwork to the Artwork array
    public void addArtwork(Artwork newArtwork){
        this.artworks.add(newArtwork);
    }

    // get a count from the amount in the artwork array
    public int getStockAmount(){
        return this.artworks.size();
    }
}
