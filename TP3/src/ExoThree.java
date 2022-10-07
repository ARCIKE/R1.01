class ExoThree {
	void principal() {
		
		String mot;
		
		mot = SimpleInput.getString("Mot ?   ");
		
		char currentLetter;
		String motInverse = "";
		
		boolean palindrome = false;
		
		int j = mot.length();
		int i = 0;
		while (i<j) {
		   currentLetter = mot.charAt(i);
		   motInverse = String.valueOf(currentLetter) + motInverse;
		   i = i + 1;
		}
		
		if (mot.equals(motInverse)) {
			palindrome = true;
		}
		
		if (palindrome) {
			System.out.println("Le mot est un palindrome");
		} else {
			System.out.println("Le mot n'est pas un palindrome");
		}
	}
}
