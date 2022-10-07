public class ExoOne {

    int LG_TAB = 10;

    void principal() {
        afficher(saisirEtTrier());
    }

    int[] saisirEtTrier () {
        int[] t = new int[LG_TAB];
        int i = 0;
        while (i < t.length) {
            t[i] = SimpleInput.getInt ("Entrer un entier");
            // insertion de la valeur en ordre croissant dans t
            int j = i;
            while (j > 0 && t[j] < t[j-1]) {
                int tmp = t[j];
                t[j] = t[j-1];
                t[j-1] = tmp;
                j--;
            }
            i = i + 1;
        }
        return t;
    }

    void afficher (int[] t) {
        for (int i = 0; i < t.length; i++) {
            System.out.println (t[i]);
        }
    }
}