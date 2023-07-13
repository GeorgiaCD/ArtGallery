import java.util.ArrayList;
public class Gallery {

    private String name;
    private int till;
    private int stock;
    private ArrayList<Artwork> artworks;

    public Gallery(String inputName){
        this.name = inputName;
        this.till = 0;
        this.stock = 0;
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
    
    



}
