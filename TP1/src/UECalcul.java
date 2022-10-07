class UECalcul {
	void principal () {
		double ue1, ue2, ue3, ue4, ue5, ue6;
		int ueobtenu;
		ue1 = SimpleInput.getInt("Votre note d'UE1 ?");
		ue2 = SimpleInput.getInt("Votre note d'UE2 ?");
		ue3 = SimpleInput.getInt("Votre note d'UE3 ?");
		ue4 = SimpleInput.getInt("Votre note d'UE4 ?");
		ue5 = SimpleInput.getInt("Votre note d'UE5 ?");
		ue6 = SimpleInput.getInt("Votre note d'UE6 ?");
		ueobtenu = 0;
		if (ue1 >= 10) {
			ueobtenu = ueobtenu + 1;
		};
		if (ue2 >= 10) {
			ueobtenu = ueobtenu + 1;
		};
		if (ue3 >= 10) {
			ueobtenu = ueobtenu + 1;
		};
		if (ue4 >= 10) {
			ueobtenu = ueobtenu + 1;
		};
		if (ue5 >= 10) {
			ueobtenu = ueobtenu + 1;
		};
		if (ue6 >= 10) {
			ueobtenu = ueobtenu + 1;
		};
		
		if (ueobtenu >= 4 && ue1 >= 8 && ue2 >= 8 && ue3 >= 8 && ue4 >= 8 && ue5 >= 8 && ue6 >= 8) {
			System.out.println("Vous passez en deuxieme année ! Bravo");
		}
		
		else {
			System.out.println("Vous ne passez en deuxième année car vous avez obtenu la moyenne de 10 que dans " + ueobtenu + " UE ou votre moyenne est inférieur à 8 dans tous les UE");
		}
		
	}
}
