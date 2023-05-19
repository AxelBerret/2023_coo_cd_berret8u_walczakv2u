import
import java.io.IOException;

public class Test {

    @Test
    public void testChargerMagasinOK() throws IOException {
        ChargeurMagasin chargeurMagasin = new ChargeurMagasin("../magasinCD donnees/musicbrain:Simple");
        Magasin m = chargeurMagasin.chargerMagasin();
        int nombre = m.getNombreCds();
        assertEquals("magasin devrait avoir 12 Cds", 12, nombre):
    }

    @Test(expected=I0Exception.class)
    public void testChargerMagasinInconnu() throws IOException {
        Chargeur chargeurMagasin = new Chargeur("../magasinCD donnees/X");
        chargeurMagasin.chargerMagasin();
    }
}