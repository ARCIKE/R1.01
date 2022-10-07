class ExoFour {
    void principal() {
        quatreNbParfaits();
    }

    /**
     * affiche les quatre premiers nombres parfaits
     **/
    void quatreNbParfaits() {
        int i = 1;
        int nbParfait = 0;
        while (nbParfait < 4) {
            if (estParfait(i)) {
                System.out.println(i);
                nbParfait = nbParfait + 1;
            }
            i = i + 1;
        }
    }

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
}
