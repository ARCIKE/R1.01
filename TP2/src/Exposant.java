class Exposant {
	void principal() {
		float x, result;
		int n, i;
		boolean negatif;
		
		x = SimpleInput.getInt("Valeur de x = ");
		n = SimpleInput.getInt("Valeur de n = ");
		
		negatif = false;
		result = 1;
		i = 0;
		
		if (n < 0) {
			negatif = true;
			n = (-1) * n;
		}
		
		while (i != n) {
			result = x * result;
			i = i + 1;
		}
		
		if (negatif) {
			result = 1 / result;
		}
		
		System.out.println("Calcul de x^n = " + result);
	};
}
