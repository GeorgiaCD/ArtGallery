
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class GalleryTest {

    Gallery gallery;
    Customer customer;

    @BeforeEach
    public void setUp() {
        gallery = new Gallery("Tate");
    }

//    test format
//   public void TEST NAME(){ //   given //   when //   then

    @Test
    public void getNameTest() {
        gallery = new Gallery("Tate");
        //  when
        String result = gallery.getName();
        //  then
        String expected = "Tate";
        assertThat(result).isEqualTo(expected);
    }


    // getTillAmount initial test
    @Test
    public void getTillAmount() {
        assertThat(gallery.getTillAmount()).isEqualTo(0);
    }

    // updateTillAmount test
    @Test
    public void canUpdateTillAmount(){
      gallery.setTillAmount(10);
        assertThat(gallery.getTillAmount()).isEqualTo(10);

    }

    // getStock test
    @Test
    public void getStockAmount(){
    assertThat(gallery.getStockAmount()).isEqualTo(0);
    }

    // addArtwork test
    @Test
    public void canAddArt(){
        Artwork flower1 = new Artwork("flowers", new Artist("George"), 100);
        gallery.addArtwork(flower1);
        // "flower1" is added to the gallery only for this test
        assertThat(gallery.getStockAmount()).isEqualTo(1);
    }


    @Test
    public void canAddPriceToTill(){
        Artwork flower1 = new Artwork("flowers", new Artist("George"), 100);
        gallery.addSoldArtToTill(flower1);
        assertThat(gallery.getTillAmount()).isEqualTo(100);
    }



    @Test
    public void canArtworkForSale(){
        Artwork flower1 = new Artwork("flowers", new Artist("George"), 100);
        gallery.addArtwork(flower1);
        assertThat(gallery.artworkForSale(flower1)).isEqualTo(true);
    }



    // can sell art work
    @Test
    public void canSellArtwork(){
        Artwork monalisa = new Artwork("Mona lisa", new Artist("Leonardo da Vinci"), 1000);
        gallery.addArtwork(monalisa);
        customer = new Customer("Georgia", 12345);
        gallery.sellArtwork(customer, monalisa);
        assertThat(gallery.getTillAmount()).isEqualTo(1000);
        assertThat(gallery.artworkForSale(monalisa)).isEqualTo(false);
        assertThat(customer.getWalletAmount()).isEqualTo(11345);
        assertThat(customer.collectionContains(monalisa)).isEqualTo(true);
    }



}