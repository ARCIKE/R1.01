class ExoThree {
    void principal() {
        testEstParfait();
    }

    /**
     * teste si un nombre est parfait
     * @param a entier positif
     * @return vrai ssi a est un nombre parfait
     */
    boolean estParfait(int a) {
        int somme = 0;
        boolean result;

        for (int i = 1; i < a; i++) {
            if (estDiviseur(a, i)) {
                somme = somme + i;
            }
        }
        if (somme == a) {
            result = true;
        } else {
            result = false;
        }

        return result;
    }

    /**
     * teste la divisibilité de deux entiers
     * @param p entier positif à tester pour la divisibilité
     * @param q diviseur strictement positif
     * @return vrai ssi q divise p
     */
    boolean estDiviseur(int p, int q) {
        if (q == 0) {
            if (p == 0) {
                return true;
            } else {
                return false;
            }
        }
        if (p % q == 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * test de la méthode estParfait
     **/
    void testEstParfait() {
        System.out.println();
        System.out.println("*** testEstParfait()");
        testCasEstParfait(6, true);
        testCasEstParfait(28, true);
        testCasEstParfait(496, true);
        testCasEstParfait(8128, true);
        testCasEstParfait(33550336, true);
        testCasEstParfait(3, false);
        testCasEstParfait(4, false);
        testCasEstParfait(5, false);
        testCasEstParfait(7, false);
        testCasEstParfait(8, false);
        testCasEstParfait(9, false);
        testCasEstParfait(10, false);
    }

    /**
     * teste un appel de estParfait
     * @param a entier positif
     * @param result resultat attendu
     **/
    void testCasEstParfait(int a, boolean result) {
        // Arrange
        System.out.print("estParfait (" + a + ") \t= " + result + "\t : ");
        // Act
        boolean resExec = estParfait(a);
        // Assert
        if (resExec == result) {
            System.out.println("OK");
        } else {
            System.err.println("ERREUR");
        }
    }
}