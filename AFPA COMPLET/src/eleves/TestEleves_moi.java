package eleves;

import java.util.Scanner;

public class TestEleves_moi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nom, prenom, Lib_Section;
		String vrep = "oui";
		int i=0 , numSection;
		Float moyenne;
		Scanner clavier = new Scanner(System.in) ;	
	
//---------------
//		Section ab = new Section(12, "CDI");
//		Scanner clavier = new Scanner(System.in);	
		
	System.out.println("veuillez saisir num section");
	numSection = clavier.nextInt(); 
	
	System.out.println("veuillez saisir nom section");
	Lib_Section = clavier.nextLine();
	
	Section_moi ST = new Section_moi (Lib_Section,numSection );//objet
	
//----------------	
	
	
	while ( vrep.equals("oui"))	{
		
		System.out.println("veuillez saisir le nom");
		nom = clavier.nextLine();
		
		System.out.println("veuillez saisir le prénom");
		prenom = clavier.nextLine();
		
		System.out.println("veuillez saisir la moyenne");
		moyenne = clavier.nextFloat();
		
		Eleve_moi EL= new Eleve_moi (nom, prenom, moyenne);
		EL.setMoyenne(moyenne);
		System.out.println(EL.getMention());
		
		ST.setTablist(nom, prenom, EL.nbrEleve);
		
		ST.affichageliste();
		
		System.out.println("Voulez vous entrer un eleve?" );
		vrep = clavier.nextLine();
	}
	
	
	
	
	
	
	clavier.close();

	}

}