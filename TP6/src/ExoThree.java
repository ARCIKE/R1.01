
public class ExoThree {

    void principal() {
        testEliminerDouble();
    }

    /*** élimine les valeurs en plusieurs exemplaires dans un tableau
     * un élément présent plusieurs fois n’est plus qu’en un seul exemplaire
     * @param tab tableau d’entiers
     * @return le nombre d’éléments du tableau sans double
     **/
    int eliminerDouble(int[] tab) {
        int length = tab.length;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (tab[i] == tab[j]) {
                    for (int k = j; k < length - 1; k++) {
                        tab[k] = tab[k + 1];
                    }
                    j--;
                    length--;
                }
            }
        }
        return length;
    }

    void testEliminerDouble() {
        System.out.println("testEliminerDouble");
        System.out.println("eliminerDouble(e ({0, 0, 2, 3, 0, 2, 1, 3, 3, 0}) = 4");
        int[] tab = {0, 0, 2, 3, 0, 2, 1, 3, 3, 0};
        testCasEliminerDouble(tab, 4);

    }

    void testCasEliminerDouble(int[] tab, int expected) {
        int result = eliminerDouble(tab);
        if (result == expected) {
            System.out.println("\u001B[32m Test réussi \u001B[0m");
        } else {
            System.out.println("Test échoué");
        }
    }
}
