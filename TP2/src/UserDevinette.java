class UserDevinette {
	void principal() {
		int value, valueChoose;
		char repUser;
		
		valueChoose = SimpleInput.getInt("Donner une valeur comprise entre 1 et 1000\t");
		while (valueChoose < 0 || valueChoose > 1000) {
			valueChoose = SimpleInput.getInt("Donner une valeur comprise entre 1 et 1000\t");
		}
		
		int lower = 0;
		int upper = 1000;
		boolean preValue = false;
		boolean postValue = false;
		value = (lower + upper) /2;
		System.out.println(value);
		repUser= SimpleInput.getChar("+ / - / =");
		
		while (repUser != '=') {
			if (value == valueChoose - 1) {
				preValue = true;
			}
			
			if (value == valueChoose + 1) {
				postValue = true;
			}
		
			if (repUser == '+'){
				lower = value ;
			} 
			if (repUser == '-'){
				upper = value;
			}
			if (preValue == true && postValue == true) {
				repUser = '=';
				System.out.println("Le chiffre est obligatoirement " + valueChoose);
			}
			else {
				value = (lower + upper) /2;
				System.out.println(value);
				repUser= SimpleInput.getChar("+ / - / =");
			}
		}
	}
}
