class Devinette {
	void principal() {
		int value, essai, random;
		
		random = (int) (Math.random() * 100);
		System.out.println("Debug  " + random);
		
		value = 0;
		essai = 0;
		
		while (value != random) {
			value = SimpleInput.getInt("Donner un nombre :");
			
			if (value > random) {
				System.out.println("Trop grand !");
			}
			if (value < random) {
				System.out.println("Trop petit !");
			}
			
			essai = essai + 1;
		}
		
		System.out.print("Vous avez réussi en " + essai + " essais");
	}
}
