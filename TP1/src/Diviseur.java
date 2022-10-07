class Diviseur {
	void principal() {
		int number, reste;
		number = SimpleInput.getInt("Donnez un nombre ? \n");
		System.out.print(number + " est divisible par"); 
		if (number % 2 == 0) {
			System.out.print(" 2 \t");
		}
		if (number % 3 == 0) {
			System.out.print(" 3 \t");
		}
		if (number % 4 == 0) {
			System.out.print(" 4 \t");
		}
		if (number % 5 == 0) {
			System.out.print(" 5 \t");
		}
		if (number % 2 != 0 && number % 3 != 0 && number % 4 != 0 && number % 5 != 0) {
			System.out.print(" aucune valeur");
		}
	}
}
