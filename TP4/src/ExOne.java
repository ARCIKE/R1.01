class ExOne {
    void principal()  {
        testFactoriel();
        testCombinaison();
    }

    /**
    * Teste la méthode factoriel()
    **/
    void testFactoriel () {
        System.out.println ();
        System.out.println ("*** testFactoriel()");
        testCasFactoriel (5, 120);
        testCasFactoriel (0, 1);
        testCasFactoriel (1, 1);
        testCasFactoriel (2, 2);
    }

    /**
    * teste un appel de factoriel
    * @param n valeur de la factoriel à calculer
    * @param result resultat attendu
    **/
    void testCasFactoriel (long n, long result) {
        // Arrange
        System.out.print ("factoriel (" + n + ") \t= " + result + "\t : ");
        // Act
        long resExec = factoriel(n);
        // Assert
        if (resExec == result){
        System.out.println ("OK");
        } else {
        System.err.println ("ERREUR");
        }
    }

    /**
     * Teste la méthode combinaison()
     **/
    void testCombinaison () {
        System.out.println ();
        System.out.println ("*** testCombinaison()");
        testCasCombinaison (5, 3, 10);
        testCasCombinaison (0, 0, 1);
        testCasCombinaison (1, 0, 1);
        testCasCombinaison (1, 1, 1);
        testCasCombinaison (2, 1, 2);
        testCasCombinaison (2, 2, 1);
        testCasCombinaison(25, 24, 25);
        testCasCombinaison(13, 12, 13);
        testCasCombinaison(25, 25, 1);
    }

    /**
     * teste un appel de combinaison
     * @param n valeur de la combinaison à calculer
     * @param k valeur de la combinaison à calculer
     * @param result resultat attendu
     **/
    void testCasCombinaison (long n, long k, long result) {
        // Arrange
        System.out.print ("combinaison (" + n + ", " + k + ") \t= " + result + "\t : ");
        // Act
        long resExec = combinaison(n, k);
        // Assert
        if (resExec == result){
        System.out.println ("OK");
        } else {
        System.err.println ("ERREUR");
        }
    }

    /**
    * calcul de la factoriel du paramètre
    * @param n valeur de la factoriel à calculer
    * @return factoriel de n
    **/
    long factoriel (long n) {
        long somme = 1;
        long i = 1;

        while (i <= n) {
            somme = somme * i;
            i = i + 1;
        }

        return somme;
    }

    /**
    * calcul de la combinaison k parmi n
    * @param n cardinalité de l’ensemble
    * @param k nombre d’éléments dans n avec k<=n
    * @return nombre de combinaisons de k parmi n
    **/
    long combinaison (long n, long k) {
        if (k == n-1) {
            return n;
        } else {
            return factoriel(n) / (factoriel(k) * factoriel(n-k));
        }
    }
}