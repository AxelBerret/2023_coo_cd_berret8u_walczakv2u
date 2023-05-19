//package donnees;

import java.util.ArrayList;

/**
 * La classe Magasin represente un magasin qui vend des CDs.</p>
 *
 * cette classe est caracterisee par un ensemble de CDs correspondant aux CDS
 * vendus dans ce magasin.
 *
 */
public class Magasin {

    /**
     * la liste des CDs disponibles en magasin
     */
    private ArrayList<CD> listeCds;

    /**
     * construit un magasin par defaut qui ne contient pas de CD
     */
    public Magasin() {
        listeCds = new ArrayList<CD>();
    }

    /**
     * ajoute un cd au magasin
     *
     * @param cdAAjouter
     *            le cd a ajouter
     */
    public void ajouteCd(CD cdAAjouter) {
        listeCds.add(cdAAjouter);
    }

    @Override
    /**
     * affiche le contenu du magasin
     */
    public String toString() {
        String chaineResultat = "";
        //parcours des Cds
        for (int i = 0; i < listeCds.size(); i++) {
            chaineResultat += listeCds.get(i);
        }
        chaineResultat += "nb Cds: " + listeCds.size();
        return (chaineResultat);

    }

    /**
     * @return le nombre de Cds du magasin
     */
    public int getNombreCds() {
        return listeCds.size();
    }

    /**
     * permet d'acceder � un CD
     *
     * @return le cd a l'indice i ou null si indice est non valide
     */
    public CD getCd(int i)
    {
        CD res=null;
        if ((i>=0)&&(i<this.listeCds.size()))
            res=this.listeCds.get(i);
        return(res);
    }

    /**
     * methode de tri par album
     */
    public void TriAlbums() {
        for (int i = 0; i<this.listeCds.size(); i++) {
            CD cds = this.listeCds.get(i);
            int indiceSelection = i;
            for (int j = i+1; j<this.listeCds.size(); j++) {
                if (this.listeCds.get(j).comparerCD(cds)) {
                    indiceSelection = j;
                    CD cdtemp = this.listeCds.get(j);
                    cds = cdtemp;
                }
            }
            this.listeCds.set(indiceSelection, this.listeCds.get(i));
            this.listeCds.set(i, cds);
        }
    }
}
