import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CustomerTest {

    Customer customer;
    Artwork monalisa;

    @BeforeEach
    public void setUP(){
    customer = new Customer("Georgia", 12345);
    Artwork monalisa = new Artwork("Mona lisa", new Artist("Leonardo da Vinci"), 1000);}

    @Test
    public void canGetName(){
        assertThat(customer.getName()).isEqualTo("Georgia");
    }

    @Test
    public void canGetWalletAmount(){
        assertThat(customer.getWalletAmount()).isEqualTo(12345);
    }

    @Test
    public void canGetArtCollectionSize(){
        assertThat(customer.getArtCollectionSize()).isEqualTo(0);
    }



    @Test
    public void canAddArt(){
        customer.addArtToCollection(monalisa);
        assertThat(customer.getArtCollectionSize()).isEqualTo(1);

    }


    @Test
    public void canBuy(){
        Artwork theWeepingWomen = new Artwork("The Weeping Woman", new Artist("Pablo Picasso"), 100);
        assertThat(customer.canBuy(theWeepingWomen)).isEqualTo(true);
    }


    @Test
    public void cantBuy(){
        Artwork theExpensive = new Artwork("The expensive Weeping Woman", new Artist("Picasso Pablo"), 123455);
        assertThat(customer.canBuy(theExpensive)).isEqualTo(false);
    }

    @Test
    public void canRemoveMoney(){
        Artwork picture = new Artwork("Picture", new Artist("Leonardo da Vinci"), 10);
        customer.removeMoney(picture);
        assertThat(customer.getWalletAmount()).isEqualTo(12335);

    }

    @Test
    public void collectionContains(){
        customer.addArtToCollection(monalisa);
        assertThat(customer.collectionContains(monalisa)).isEqualTo(true);


    }


    @Test
    public void collectionDoesNotContains(){
        Artwork flower1 = new Artwork("flowers", new Artist("George"), 100);
        assertThat(customer.collectionContains(flower1)).isEqualTo(false);

    }

}
