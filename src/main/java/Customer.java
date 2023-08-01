import java.util.ArrayList;

public class Customer {

    private String name;
    protected int wallet;
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

    public void removeMoney(Artwork artForSale){
        this.wallet -= artForSale.price;
    }

    public int getArtCollectionSize(){
        return this.artCollections.size();
    }

    public boolean collectionContains(Artwork art){
        if(artCollections.contains(art)){
            return true;
        } else return false;
    }

    public void addArtToCollection(Artwork newArt){
        this.artCollections.add(newArt);
    }

    public Boolean canBuy(Artwork artForSale){
        if(this.wallet > artForSale.price){
            return true;
        } else {return false;}
    }




}
