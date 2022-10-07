import java.util.Arrays;

public class ExoTwo {

    void principal() {
        TestSontTousDiff();
    }

    /*** vérifie si deux tableaux n’ont aucune valeur commune
     * @param tab1 premier tableau
     * @param tab2 deuxième tableau
     * @return vrai si les tableaux tab1 et tab2 n’ont aucune valeur commune, faux sinon
     **/
    boolean sontTousDiff (int[] tab1, int[] tab2) {
        boolean result = true;
        for (int i = 0; i < tab1.length; i++) {
            for (int j = 0; j < tab2.length; j++) {
                if (tab1[i] == tab2[j]) {
                    result = false;
                }
            }
        }
        return result;
    }

    void TestSontTousDiff() {
        System.out.println("Test de la méthode sontTousDiff");
        int[] tab1 = {1, 2, 3, 4, 5};
        int[] tab2 = {6, 7, 8, 9, 10};
        TestCasSontTousDiff(tab1, tab2, false);

        int[] tab3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] tab4 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        TestCasSontTousDiff(tab3, tab4, false);
    }

    void TestCasSontTousDiff(int[] tab1, int[] tab2, boolean expected) {
        boolean result = sontTousDiff(tab1, tab2);
        System.out.println("Test avec les tableaux suivants :");
        System.out.println("tab1 = " + Arrays.toString(tab1));
        System.out.println("tab2 = " + Arrays.toString(tab2));
        if (result == expected) {
            System.out.println("Test réussi");
        } else {
            System.out.println("Test échoué");
        }
    }
}
