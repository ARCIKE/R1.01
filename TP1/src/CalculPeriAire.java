class CalculPeriAire {
	void principal() {
		double perimetre, rayon, aire;
		rayon = SimpleInput.getFloat("Donner le rayon de votre cercle en centimètre : \n");
		perimetre = 2 * Math.PI * rayon;
		System.out.print("Le périmètre de votre cercle est de \t");
		System.out.print(perimetre);
		System.out.println("cm");
		System.out.println("");
		aire = Math.PI * rayon * rayon;
		System.out.print("L'aire de votre cercle est de \t");
		System.out.print(aire);
		System.out.println("cm²");
	}
}
