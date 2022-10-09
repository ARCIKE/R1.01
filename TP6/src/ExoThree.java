public class ExoThree {

    /*** élimine les valeurs en plusieurs exemplaires dans un tableau
     * un élément présent plusieurs fois n’est plus qu’en un seul exemplaire
     * @param tab tableau d’entiers
     * @return le nombre d’éléments du tableau sans double
     **/
    int eliminerDouble(int[] tab) {
        int length = tab.length;
        int[] number = new int[length];

        return number.length;
    }

    boolean checkIfIn (int[] tab, int number) {
        boolean result = false;

        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == number) {
                result = true;
            }
        }
        return result;
    }
    

}
