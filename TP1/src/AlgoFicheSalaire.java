class AlgoFicheSalaire {
    void principal ( ) {
		double sb, pam, pavd, pcsg, pcrds, pavp, pc, pt, sp ;
		sb = SimpleInput.getInt( " Salaire brut ? \n" );
		pam = sb * 0.0075;
		pavd = sb * 0.001;
		pcsg = (sb-(sb * 0.0175 )) * 0.075;
		pcrds = (sb-(sb * 0.0175 )) * 0.005;
		pavp = sb * 0.0675;
		pc = sb * 0.024;
		pt = pam + pavd + pcsg + pcrds + pavp + pc;
		sp = sb - pt;
		System.out.println (" Salaire brut : " + sb + " euros ");
		System.out.println (" Prélèvement assurance maladie : " + pam + "euros");
		System.out.println (" Prélèvement Assurance vieillesse déplafonnée : " + pavd + "euros");
		System.out.println (" Prélèvement Contribution sociale généralisée : " + pcsg + "euros");
		System.out.println (" Prélèvement CRDS : " + pcrds + "euros");
		System.out.println (" Prélèvement Assurance vieillesse plafonnée : " + pavp + "euros");
		System.out.println (" Prélèvement Chômage : " + pc + "euros");
		System.out.println ("");
		System.out.println (" Total Prélèvements: " + pt + "euros");
		System.out.println ("");
		System.out.println (" Salaire perçu : " + sp + "euros");
        }
 }
