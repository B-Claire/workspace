package eleves;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// double moyenne;
		// Eleve el1 = new Eleve();
		// Scanner sc = new Scanner(System.in);
		// System.out.println("saisir la moyenne : ");
		// moyenne = sc.nextdouble();
		// el1.setMoyenne(moyenne);
		// System.out.println(el1.getMention());
		//
		// Eleve el2 = new Eleve("Mohamed", "ali", 15);
		// System.out.println(el2.getMention());
		// System.out.println("");
		String vRep = "oui";
		Section s1 = new Section(1000, "bts");
		Scanner sc = new Scanner(System.in);
		System.out.println("Nom de section: "+s1.getNomSection());
		while (vRep.equals("oui")) {
			
			System.out.println("Saisir le nom de l'élève :");
			String nomStagiaire = sc.nextLine();
			System.out.println("Saisir le prénom de l'élève :");
			String prenomStg = sc.nextLine();
			System.out.println("saisir la moyenne : ");
			double moyenne = sc.nextDouble();
			Eleve el1 = new Eleve(nomStagiaire,prenomStg,moyenne);
			el1.setMoyenne(moyenne);
			System.out.println(el1.getMention());
			
			s1.setTab(nomStagiaire,prenomStg,Eleve.nbrEleve);
			System.out.println("Voulez-vous continuer (oui/non):");
			sc.nextLine();
			vRep = sc.nextLine();
			
		}
		s1.affichage();
		
	}

}
