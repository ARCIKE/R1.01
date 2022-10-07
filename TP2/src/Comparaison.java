class Comparaison {
	void principal () {
		int val, last;
		
		val = SimpleInput.getInt("Nombre :");
		last = val;
		
		while (val >= last) {
			last = val;
			val = SimpleInput.getInt("Nombre :");
		}
	}
}
