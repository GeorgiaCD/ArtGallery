
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class GalleryTest {

    Gallery gallery;

    @BeforeEach
    public void setUp() {
        gallery = new Gallery("Tate");
    }

//    test format
//   public void TESTNAME(){ //   given //   when //   then

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
    assertThat((gallery.getStockAmount()).isEqualTo(0);
    }


    // addArtwork test


    // getArtwork test


}