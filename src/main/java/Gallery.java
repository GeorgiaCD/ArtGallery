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

    public void addSoldArtToTill(Artwork artForSale){
        this.till += artForSale.price;
    }



    //adding artwork to the Artwork array
    public void addArtwork(Artwork newArtwork){
        this.artworks.add(newArtwork);
    }

    // get a count from the amount in the artwork array
    public int getStockAmount(){
        return this.artworks.size();
    }

    // sell a piece of art
    // check if the artwork is in stock,
    public boolean artworkForSale(Artwork artForSale){
        if(artworks.contains(artForSale)){
            return true;
        } else return false;
    }




    public void sellArtwork(Customer customer,Artwork artForSale){
            if(artworks.contains(artForSale) && (customer.canBuy(artForSale))){
            // gallery can sell and artist can buy
                // then remove from the collection
                // increase the till amount by price
                this.artworks.remove(artForSale);
                this.till += artForSale.price;
                customer.removeMoney(artForSale);
                customer.addArtToCollection(artForSale);
            }
        }

}
