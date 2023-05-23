public class ComparateurPiste implements ComparateurCd {

    /**
     *
     * @param cd1
     * @param cd2
     * @return
     */
    public boolean etreAvant(CD cd1, CD cd2) {
       return cd1.getPistes().size() > cd2.getPistes().size();
    }
}
