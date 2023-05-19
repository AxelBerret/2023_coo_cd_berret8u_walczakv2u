import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class TestChargeurMagasin {

    @Test
    public void testChargerMagasinOK() throws IOException {
        ChargeurMagasin chargeurMagasin = new ChargeurMagasin("../magasinCD donnees/musicbrain:Simple");
        Magasin m = chargeurMagasin.chargerMagasin();
        int nombre = m.getNombreCds();
        assertEquals("magasin devrait avoir 12 Cds", 12, nombre);
    }

    @Test(expected=IOException.class)
    public void testChargerMagasinInconnu() throws IOException {
        ChargeurMagasin chargeurMagasin = new ChargeurMagasin("../magasinCD donnees/X");
        chargeurMagasin.chargerMagasin();
    }
}