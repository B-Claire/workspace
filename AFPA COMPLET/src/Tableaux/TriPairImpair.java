package Tableaux;

import java.util.Scanner;

public class TriPairImpair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*exo 2 
		 * etape 1 = saisir 10 nbr dans un tableau 
		 * etape 2 phase de tri: placer les chiffres pairs � gauche et les chiffres impairs � droite
		*/
		int [] tab = new int[10] ;
		
		int i=0,j=0, tampon, pair,impair, choix, number=0 ;
		Scanner clavier = new Scanner(System.in);
		
		
		for (i=0;i<10;i++ ) {
			System.out.println("bonjour veuillez saisir la valeur"+(i+1));
			tab[i]=clavier.nextInt();
			}
		
				
		 if (number == 0) {
	            System.out.println("Le nombre est z�ro (et il est pair)");
	        } else {
	            int reste = number % 2;
	            if (reste == 0) {
	                System.out.println("et pair");
	            } else {
	                System.out.println("et impair");
	            }
			}
					System.out.println("Les valeurs du tableau tri� sont:");
					for (i=0;i<10;i++ ) {
						System.out.print(tab[i]+" | ");
			
					}
		
		
		
		clavier.close();
				

	}

}
