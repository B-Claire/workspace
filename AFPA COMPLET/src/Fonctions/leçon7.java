package Fonctions;

import java.util.Scanner;

public class leçon7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	enoncé:
			a,b,c : chaînes de caractères
			i,j,k : entiers
			-longueur de a 
			-placer dans b les 4 caractères de gauche de c 
			-additionner la longueur de a,b,c 
			-supprimer les 2 caractères de gauche de b
			-afficher le code ascii ou ansi du 5ème caractère de c
			-placer dans b les 3 caractères de droite de c, convertis en minuscule
			-afficher le 3eme caractère de b autant de fois que la longueur de a */
		
		String a,b,c;
		int i,j,k ;
		Scanner clavier= new Scanner(System.in);

		System.out.println("Bonjour, veuillez saisir un mot");
		a = clavier.next();
		
		clavier.close();
	}

}
