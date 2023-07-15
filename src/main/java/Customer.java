import java.util.ArrayList;

public class Customer {

    private String name;
    private int wallet;
    private ArrayList<Artwork> artCollections;

    public Customer(String inputName,int walletAmount){
        this.name = inputName;
        this.wallet = walletAmount;
        this.artCollections = new ArrayList<Artwork>();
    }

    // getName
    //getWalletAmount
    // get art collection size
    // add to the art collection

    public String getName(){
        return this.name;
    }

    public int getWalletAmount(){
        return this.wallet;
    }

    public int getArtCollectionSize(){
        return this.artCollections.size();
    }

    public void addArtToCollection(Artwork newArt){
        this.artCollections.add(newArt);
    }


    // buy art work
    // (check if being sold, (gallery.method)
    // check if have enough money in the wallet,
    // deduct the price from wallet,
    // add art to art collection
    // remove art from gallery stock)
    public void buyArt(Artwork artForSale){
        if(gallery.sellArtwork(artForSale)){
            if(this.wallet > artForSale.price()){

            }
        }
    }

}
