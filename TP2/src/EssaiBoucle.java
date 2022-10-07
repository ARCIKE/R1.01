class EssaiBoucle {
	void principal() {
		int nb, somme, total;
		nb = SimpleInput.getInt("Donner un nombre");

		somme = 0;
		total = 0;

		while (nb != -1) {
			if (nb !=1) {
				System.out.println(nb);
				somme = somme + nb;
				total = total + 1;
			}
			nb = SimpleInput.getInt("Donner un nombre :");
		}
		if (total  != 0) {
			System.out.println("La moyenne de la suite est de " + somme / total);
		}
	}
}
