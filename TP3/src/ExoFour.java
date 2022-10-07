class ExoFour {
	void principal() {
		int[] tab = new int[10];
		int i = 0;
		int value = 0;
		int j = 0;
		
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
		
		
		int valueCheck = SimpleInput.getInt("Nombre est t-il dans le tableau ?");
		
		int k = 0;
		int nbValIn = 0;
		boolean twoVal = false;
		while (k < nbVal) {
			if (tab[k] == valueCheck) {
				nbValIn = nbValIn + 1;
			}
			k = k + 1;
			
			if (nbValIn >= 2) {
				twoVal = true;
			}
		}
		
		if (twoVal){
			System.out.println(valueCheck + " est présent en au moins deux exemplaires dans le tableau d’entiers");
		}
	}
}
