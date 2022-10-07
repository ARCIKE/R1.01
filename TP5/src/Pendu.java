import java.util.Arrays;

class Pendu {
    final String[] listLanguages = {"PYTHON", "JAVA", "RUST", "GO LANG", "JAVASCRIPT", "SWIFT"};

    void principal() {
        // testCreerDico();
        // testChoisirMot();
        // testAffichierReponse();
        // testCreerReponse();
        // testTester();
        // testEstComplet();

        partie(creerDico());
    }

    /**
     * Crée un dictionnaire de mots
     * @return le dictionnaire
     **/
    String[] creerDico() {
        String[] dico = listLanguages;
        return dico;
    }
    
    /**                                                                                                                                                                           
     * teste la méthode creerDico
     **/
    void testCreerDico() {
        System.out.println();
        System.out.println("*** testCreerDico()");
        testCasCreerDico(listLanguages);
    }

    /**
     * teste un appel de creerDico
     * @param dico dictionnaire attendu
     */
    void testCasCreerDico(String[] dico) {
        System.out.print("creerDico() \t= ");

        if (Arrays.equals(creerDico(), dico)) {
            System.out.println("OK");
        } else {
            System.err.println("ERREUR");
        }
    }

    /**
     * Choisit un mot au hasard dans le dictionnaire
     * @param dico le dictionnaire de mots
     **/
    String choisirMot(String[] dico) {
        int random = (int) (Math.random() * creerDico().length);
        return dico[random];
    }

    /**
     * teste la méthode choisirMot
     **/
    void testChoisirMot() {
        System.out.println();
        System.out.println("*** testChoisirMot()");
        testCasChoisirMot(creerDico());
    }

    /**
     * teste un appel de choisirMot
     * @param dico dictionnaire attendu
     */
    void testCasChoisirMot(String[] dico) {
        System.out.print("choisirMot() \t= ");

        if (choisirMot(dico) != null) {
            System.out.println("OK");
        } else {
            System.err.println("ERREUR");
        }
    }

    /**
     * Affiche le mot avec les lettres trouvées et les lettres non trouvées remplacées par des tirets
     * @param reponse le mot à afficher
     */
    void afficherReponse(char[] reponse) {
        for (int i = 0; i < reponse.length; i++) {
            System.out.print(reponse[i]);
        }
        System.out.println();
    }

    /**
     * teste la méthode afficherReponse
     **/
    void testAffichierReponse() {
        System.out.println();
        System.out.println("*** testAffichierReponse()");
        char[] reponse1 = {'P', 'R', 'O', 'G', 'R', 'A', 'M', 'M', 'E'};
        testCasAfficherReponse (reponse1);
        char[] reponse2 = {};
        testCasAfficherReponse (reponse2);
    }

    /**
     * teste un appel à afficherReponse()
     * @param reponse tableau des réponse à afficher
     **/
    void testCasAfficherReponse (char[] reponse) {
        System.out.print ("afficherReponse (" + Arrays.toString(reponse) + ") : ");
        afficherReponse (reponse);
    }

    /**
     *  Affiche le mot a evec des '_'
     * @param lg la longueur du mot
     * @return le mot avec des '_'
     */
    char[] creerReponse(int lg) {
        char[] reponse = new char[lg];
        for (int i = 0; i < reponse.length; i++) {
            reponse[i] = '_';
        }
        return reponse;
    }

    /**
     * teste la méthode creerReponse
     **/
    void testCreerReponse() {
        System.out.println();
        System.out.println("*** testCreerReponse()");
        testCasCreerReponse(8, new char[] {'_', '_', '_', '_', '_', '_', '_', '_'});
        testCasCreerReponse(7, new char[] {'_', '_', '_', '_', '_', '_', '_'});
        testCasCreerReponse(6, new char[] {'_', '_', '_', '_', '_', '_'});
    }

    /** teste un appel à creerReponse()
     * @param lg la longueur du mot
     * @param reponse tableau des réponse à afficher
     */
    void testCasCreerReponse(int lg, char[] reponse) {
        System.out.print("creerReponse(" + lg + ") \t= ");

        if (Arrays.equals(creerReponse(lg), reponse)) {
            System.out.println("OK");
        } else {
            System.err.println("ERREUR");
        }
    }

    /**
     * Teste si la lettre est dans le mot
     * @param mot le mot
     * @param reponse le mot avec les lettres trouvées
     * @param car le caractère à tester
     * @return vrai ssi la lettre est dans le mot
     */
    boolean tester (String mot, char[] reponse, char car) {
        boolean result = false;
        for (int i = 0; i < mot.length(); i++) {
            if (mot.charAt(i) == car) {
                reponse[i] = car;
                result = true;
            }
        }
        return result;
    }

    /**
     * teste la méthode tester
     **/
    void testTester () {
        System.out.println();
        System.out.println("*** testTester()");
        testCasTester("PYTHON",creerReponse(6),'Y', true);
        testCasTester("JAVA",creerReponse(4),'B', false);
        testCasTester("PYTHON", creerReponse(4), ' ', false);
    }

    /**
     * teste un appel de tester
     * @param mot mot à tester
     * @param reponse réponse attendue
     * @param car caractère à tester
     * @param result résultat attendu
     */
    void testCasTester (String mot, char[] reponse, char car, boolean result) {
        System.out.print("tester(" + mot + ", " + reponse + ", " + car + ") \t= ");

        if (tester(mot, reponse, car) == result) {
            System.out.println("OK");
        } else {
            System.err.println("ERREUR");
        }
    }

    /**
     * estComplet
     * @param mot le mot
     * @param reponse le mot avec les lettres trouvées
     * @return vrai ssi le mot est complet
     */
    boolean estComplet (String mot, char[] reponse) {
        boolean result = true;
        for (int i = 0; i < mot.length(); i++) {
            if (mot.charAt(i) != reponse[i]) {
                result = false;
            }
        }
        return result;
    }

    /**
     * teste la méthode estComplet
     **/
    void testEstComplet () {
        System.out.println();
        System.out.println("*** testEstComplet()");
        testCasEstComplet("PYTHON", new char[] {'P', 'Y', 'T', 'H', 'O', 'N'}, true);
        testCasEstComplet("JAVA", new char[] {'J', 'A', 'V', 'A'}, true);
        testCasEstComplet("PYTHON", new char[] {'P', 'Y', 'T', 'H', 'O', '_'}, false);
        testCasEstComplet("PYTHON", new char[] {'_', '_', '_', '_', '_', '_'}, false);
    }

    /**
     * teste un appel de estComplet
     * @param mot mot à tester
     * @param reponse réponse attendue
     * @param result résultat attendu
     */
    void testCasEstComplet (String mot, char[] reponse, boolean result) {
        System.out.print("estComplet(" + mot + ", ");
        afficherTabChar(reponse);
        System.out.println(") \t= ");

        if (estComplet(mot, reponse) == result) {
            System.out.println("OK");
        } else {
            System.err.println("ERREUR");
        }
    }

    /**
     * lancement d’une partie du jeu du pendu
     * @param dico dictionnaire des mots à deviner
     **/
    void partie(String[] dico) {
        String mot = choisirMot(dico);
        char[] reponse = creerReponse(mot.length());
        afficherReponse(reponse);
        int nbEssais = 9;
        while (nbEssais > 0 && !estComplet(mot, reponse)) {
            char car = SimpleInput.getChar("Proposez une lettre : ");
            if (tester(mot, reponse, car)) {
                System.out.println("Bravo !");
            } else {
                nbEssais = nbEssais - 1;

                switch (nbEssais) {
                    case 8:
                        System.out.println(" _______");
                        System.out.println(" |     |");
                        System.out.println(" |");
                        System.out.println(" |");
                        System.out.println(" |");
                        System.out.println(" |");
                        System.out.println("_|___");
                        break;
                    case 7:
                        System.out.println(" _______");
                        System.out.println(" |     |");
                        System.out.println(" |     O");
                        System.out.println(" |");
                        System.out.println(" |");
                        System.out.println(" |");
                        System.out.println("_|___");
                        break;
                    case 6:
                        System.out.println(" _______");
                        System.out.println(" |     |");
                        System.out.println(" |     O");
                        System.out.println(" |     |");
                        System.out.println(" |");
                        System.out.println(" |");
                        System.out.println("_|___");
                        break;
                    case 5:
                        System.out.println(" _______");
                        System.out.println(" |     |");
                        System.out.println(" |     O");
                        System.out.println(" |    /|");
                        System.out.println(" |");
                        System.out.println(" |");
                        System.out.println("_|___");
                        break;
                    case 4:
                        System.out.println(" _______");
                        System.out.println(" |     |");
                        System.out.println(" |     O");
                        System.out.println(" |    /|\\");
                        System.out.println(" |");
                        System.out.println(" |");
                        System.out.println("_|___");
                        break;
                    case 3:
                        System.out.println(" _______");
                        System.out.println(" |     |");
                        System.out.println(" |     O");
                        System.out.println(" |    /|\\");
                        System.out.println(" |    /");
                        System.out.println(" |");
                        System.out.println("_|___");
                        break;
                    case 2:
                        System.out.println(" _______");
                        System.out.println(" |     |");
                        System.out.println(" |     O");
                        System.out.println(" |    /|\\");
                        System.out.println(" |    / \\");
                        System.out.println(" |");
                        System.out.println("_|___");
                        break;
                    case 1:
                        System.out.println(" _______");
                        System.out.println(" |     |");
                        System.out.println(" |     O");
                        System.out.println(" |   /|\\");
                        System.out.println(" |    / \\");
                        System.out.println(" |");
                        System.out.println("_|___");
                        break;
                    case 0:
                        System.out.println(" _______");
                        System.out.println(" |     |");
                        System.out.println(" |     O");
                        System.out.println(" |   /|\\");
                        System.out.println(" |    / \\");
                        System.out.println(" |");
                        System.out.println("_|___");
                        break;
                }
            }
            afficherReponse(reponse);
        }
        if (estComplet(mot, reponse)) {
            System.out.println("Bravo, vous avez gagné !");
        } else {
            System.out.println("Dommage, vous avez perdu !");
        }
    }

     /**
     * affiche un tableau d'entiers
     * @param t tableau d'entiers
     */
    void afficherTabChar(char[] t) {
        System.out.print("[");
        for (int i = 0; i < t.length; i++) {
            System.out.print(t[i]);
            if (i < t.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }
    
    void afficherTabString(String[] t) {
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
