package lecon2;

import java.util.Scanner;

public class Lecon2ExoMention {

	public static void main(String[] args) {
				// afficher la mention

		
				String identite = new String();
				char reponse = ' ';
				float nbr;
				Scanner clavier= new Scanner(System.in);
				
				do{
				System.out.println("Bonjour, entrez votre nom et votre prénom");
				identite= clavier.nextLine();
				
				System.out.println("Entrez votre note");
				nbr= clavier.nextFloat();
				if (nbr <= 8 ) {
					System.out.println("vous êtes recalé");
				} else {
					if (nbr >8 & nbr <10) {
						System.out.println("rattrapage");
					}
					if (nbr >10 & nbr <12) {
						System.out.println("passable");
					}
					if (nbr >=12 & nbr <14) {
						System.out.println("assez bien");
					}
					if (nbr >=14 & nbr <16) {
						System.out.println("bien");
					}
					if (nbr >=16 & nbr <18) {
						System.out.println("tres bien");
					}
					if (nbr >18) {
						System.out.println("excellent");
					}
									
						}
				
				do{
					System.out.println("voulez-vous entrer une autre note? (O/N)");
					reponse = clavier.next().charAt(0);
				}while(reponse!= 'O' && reponse != 'N' );
				
				}while(reponse =='O');
				
					System.out.println("Au revoir");


clavier.close();
				
	}

}
