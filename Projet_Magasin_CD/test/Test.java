import org.testng.annotations.Test;

import java.io.IOException;
public class TestChargeurMagasin {

    @Test
    public void testChargerMagasinOK() throws IOException {
        ChargeurMagasin chargeurMagasin = new ChargeurMagasin("../magasinCD donnees/musicbrain:Simple");

        Magasin m chargeurMagasin.chargerMagasin();

        int nombre m.getNombreCds();

        assertEquals("magasin devrait avoir 12 Cds", 12, nombre):

    }

    @Test(expected=I0Exception.class)

    public void testChargerMagasinInconnu() throws IOException {
        Chargeur Magasin chargeurMagasin = new Chargeur Magasin("../magasinCD donnees/X");
        chargeurMagasin.chargerMagasin();
    }
}