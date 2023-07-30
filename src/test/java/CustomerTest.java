import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CustomerTest {

    Customer customer;

    @BeforeEach
    public void setUP(){
    customer = new Customer("Georgia", 12345);}

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
        Artwork monalisa = new Artwork("Mona lisa", new Artist("Leonardo da Vinci"), 1000);
        customer.addArtToCollection(monalisa);
        assertThat(customer.getArtCollectionSize()).isEqualTo(1);

    }


    @Test
    public void canBuy(){
        Artwork theWeepingWomen = new Artwork("The Weeping Woman", new Artist("Pablo Picasso"), 100);
        assertThat(customer.canBuy(theWeepingWomen)).isEqualTo(true);
    }




}
