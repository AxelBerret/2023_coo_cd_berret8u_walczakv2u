import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class TestTriMagasin {

    public void TestTriMagasin() throws IOException {
        Magasin m = new Magasin();
        CD cd1;
        cd1 = new CD("bieber", "believe");
        m.ajouteCd(cd1);
        CD cd2;
        cd2 = new CD("Red hot chili pepper", "californication");
        m.ajouteCd(cd2);
        CD cd3;
        cd3 = new CD("vian", "le deserteur");
        m.ajouteCd(cd3);
        CD cd4;
        cd4 = new CD("juliette", "mutatis mutandis");
        m.ajouteCd(cd4);
        m.trier(new ComparateurArtiste());
        CD cd = m.getCd(0);
        assertEquals("bieber le plus petit nom", cd, cd1);
        cd = m.getCd(1);
        assertEquals("juliette ensuite", cd, cd4);
        cd = m.getCd(2);
        assertEquals("red hot ensuite", cd, cd2);
        cd = m.getCd(3);
        assertEquals("vian ensuite", cd, cd3);
    }

}
