public class ComparateurAlbum implements ComparateurCd{

    /**
     *
     * @param cd1
     * @param cd2
     * @return
     */
    @Override
    public boolean etreAvant(CD cd1, CD cd2) {
        return cd1.getNomCD().compareTo(cd2.getNomCD())<0;
    }
}
