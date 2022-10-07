class ExoTwo {
	void principal() {
		int[] tab = new int[10];
		int i = 0;
		int value = 0;
		int j = 0;
		boolean ascending = false;
		
		while (value != -1 && i<tab.length) {
			value = SimpleInput.getInt("Donner une valeur");
						
			if (value != -1){
				tab[i] = value;
				i = i + 1;
			}
		}
		
		int nbVal = i;
		System.out.println("Il y a " + nbVal + " valeurs :");
		
		while (j < nbVal) {
			System.out.println(tab[j]);
			j = j + 1;
		}
		
		int k = 0;
		
		ascending = true;
		
		while (k < (nbVal - 1)) {
			if (tab[k] > tab[k + 1]) {
				ascending = false;
			}
			k = k + 1;
		}
		
		if (ascending) {
			System.out.println("Croissant");
		} else {
			System.out.println("Décroissant");
		}
	}
}
