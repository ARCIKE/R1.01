class ExoFive {

    void principal() {
        testEstCroissant();
    }

    /**
     * teste si les valeurs d’un tableau sont triées par ordre croissant
     * @param t tableau d’entiers
     * @return vrai ssi les valeurs du tableau sont en ordre croissant
     */
    boolean estCroissant(int[] t) {
        boolean result = true;
        int i = 0;
        while (i < t.length - 1 && result) {
            if (t[i] > t[i + 1]) {
                result = false;
            }
            i = i + 1;
        }
        return result;
    }

    /**
     * teste la méthode estCroissant
     **/
    void testEstCroissant() {
        System.out.println();
        System.out.println("*** testEstCroissant()");
        testCasEstCroissant(new int[] { 1, 2, 3, 4, 5 }, true);
        testCasEstCroissant(new int[] { 1, 2, 3, 5, 4 }, false);
        testCasEstCroissant(new int[] { 1, 2, 3, 3, 4 }, true);
        testCasEstCroissant(new int[] { 1, 2, 3, 3, 3 }, true);
        testCasEstCroissant(new int[] { 1, 2, 3, 2, 4 }, false);
        testCasEstCroissant(new int[] { 1, 2, 3, 1, 4 }, false);
        testCasEstCroissant(new int[] { 1, 2, 3, 0, 4 }, false);
        testCasEstCroissant(new int[] { 1, 2, 3, -1, 4 }, false);
        testCasEstCroissant(new int[] { 1, 2, 3, -2, 4 }, false);
        testCasEstCroissant(new int[] { 1, 1, 1, 1, 1 }, true);
    }

    /**
     * teste un appel de estCroissant
     * @param t tableau d’entiers
     * @param result résultat attendu
     */
    void testCasEstCroissant(int[] t, boolean result) {
        // Arrange
        System.out.print("estCroissant (");
        afficherTab(t);
        System.out.print(") \t= " + result + "\t : ");
        // Act
        boolean resExec = estCroissant(t);
        // Assert
        if (resExec == result) {
            System.out.println("OK");
        } else {
            System.err.println("ERREUR");
        }
    }

    /**
     * affiche un tableau d’entiers
     * @param t tableau d’entiers
     */
    void afficherTab(int[] t) {
        System.out.print("[");
        for (int i = 0; i < t.length; i++) {
            System.out.print(t[i]);
            if (i < t.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }
    
}
