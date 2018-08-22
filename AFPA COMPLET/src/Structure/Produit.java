package Structure;

import java.util.ArrayList;
import java.util.Scanner;

public class Produit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i,J ;
	Scanner sc= new Scanner (System.in);
		ArrayList[][] Produit= new ArrayList[10][6];
		
		for (i=0; i<10;i++) {
			System.out.println("Saisir un code produit");
			Produit[i][0].add(sc.nextLine());
			
			System.out.println("Saisir un libelle");
			Produit[i][1].add(sc.nextLine());
			System.out.println("Saisir une couleur");
			Produit[i][2].add(sc.nextLine());
			System.out.println("Saisir un prix");
			Produit[i][3].add(sc.nextLine());
			System.out.println("Saisir une quantité");
			Produit[i][4].add(sc.nextLine());
			System.out.println("Saisir une dimension");
			Produit[i][5].add(sc.nextLine());
			
		}
		
	
		
		sc.close();

	}

}
