class ExoTwo {
    void principal() {
        testEstDiviseur();
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
     * test de la méthode estDiviseur
     **/
    void testEstDiviseur() {
        System.out.println();
        System.out.println("*** testEstDiviseur()");
        testCasEstDiviseur(5, 10, false);
        testCasEstDiviseur(10, 5, true);
        testCasEstDiviseur(5, 11, false);
        testCasEstDiviseur(5, 0, false);
        testCasEstDiviseur(0, 5, true);
        testCasEstDiviseur(0, 0, true);
    }

    /**
     * teste un appel de estDiviseur
     * @param p entier positif à tester pour la divisibilité
     * @param q diviseur strictement positif
     * @param result resultat attendu
     **/
    void testCasEstDiviseur(int p, int q, boolean result) {
        // Arrange
        System.out.print("estDiviseur (" + p + ", " + q + ") \t= " + result + "\t : ");
        // Act
        boolean resExec = estDiviseur(p, q);
        // Assert
        if (resExec == result) {
            System.out.println("OK");
        } else {
            System.err.println("ERREUR");
        }
    }
}
