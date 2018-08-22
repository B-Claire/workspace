package lecon1;

import java.util.Scanner;

public abstract class exercice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nbr1;
		int nbr2;
		int result;
		float nbr3;

		//// ********* AFFICHAGE********
		//
		//// chaque instruction se termine par un point virgule
		//
		//
		// System.out.println(); //raccourci sysout suivi de ctrl+espace
		/// * commentaire sur
		// * plusieurs
		// * lignes
		// * chaque instruction se termine par un ";"
		// */

		System.out.print("premier affichage");// System.out.print pour afficher un message
		System.out.println("bonjour");// println permet un retour à la ligne

		//// *********RECUPERER UNE SAISIE********//

		Scanner saisie = new Scanner(System.in);

		System.out.println("Saisir un nombre");
		nbr1 = saisie.nextInt();

		System.out.println("Saisir un deuxieme nombre");
		nbr2 = saisie.nextInt();

		result = nbr1 + nbr2;
		System.out.println("L'addition des deux nombres est égale à:" + result); // ici c'est un "+" qu'il faut utiliser
																					// et non pas un "&"

		//// recuperer un reel

		System.out.println("Saisir un nombre réel");
		nbr3 = saisie.nextFloat(); // nextFloat permet de récupérer la saisie d'un réel
		nbr3 = nbr3 * 2;
		System.out.println("nbr3 à pour valeur : " + nbr3);

		// exercice 2 tp4
		int i = 8;
		char j = 2;
		float k = 23.141592653f;
		double l = 12.6;

		double resultat;
		System.out.println("addition " + (resultat = (double) i + j + k + l));
		System.out.println("multiplication " + (resultat = (double) i * j * k * l));
		System.out.println("moyen " + (resultat = (double) (i + j + k + l) / 4));

		// exercice 3

		System.out.println("****" + "  " + "**" + "    " + "***" + " " + "**" + " " + "***" + "   " + "***");
		System.out.println("* " + "    " + "**" + "    " + "* *" + " " + "  " + " " + "* *" + "   " + "*  ");
		System.out.println("* " + "    " + "**" + "    " + "***" + " " + "**" + " " + "***" + "   " + "***");
		System.out.println("* " + "    " + "**" + "    " + "* *" + " " + "**" + " " + "*  *" + "  " + "*  ");
		System.out.println("****" + "  " + "*****" + " " + "* *" + " " + "**" + " " + "*   *" + " " + "***");

		// table de multiplication
		int nbrx;

		System.out.println("entrer un nombre entre 1 et 10");
		Scanner sc = new Scanner(System.in);

		nbrx = sc.nextInt();// intégrer la saisie de la ligne suivante à nbr1
		System.out.println(nbrx + "*1=" + nbrx * 1);
		System.out.println(nbrx + "*2=" + nbrx * 2);
		System.out.println(nbrx + "*3=" + nbrx * 3);
		System.out.println(nbrx + "*4=" + nbrx * 4);
		System.out.println(nbrx + "*5=" + nbrx * 5);
		System.out.println(nbrx + "*6=" + nbrx * 6);
		System.out.println(nbrx + "*7=" + nbrx * 7);
		System.out.println(nbrx + "*8=" + nbrx * 8);
		System.out.println(nbrx + "*9=" + nbrx * 9);
		System.out.println(nbrx + "*10=" + nbrx * 10);

		// multiples

		int nbr;
		String resultA;

		System.out.println("entrer un nombre");

		Scanner b = new Scanner(System.in);

		nbr = saisie.nextInt();
		if (nbr % 2 != 0 && nbr % 3 != 0 && nbr % 5 != 0) {
			System.out.println("nbr multiple d'aucun");
		} else {
			if (nbr % 2 == 0) {
				System.out.println("nbr multiple de 2");
			}
			if (nbr % 3 == 0) {
				System.out.println("nbr multiple de 3");
			}
			if (nbr % 5 == 0) {
				System.out.println("nbr multiple de 5");
			}
		}

		// Random

		int r;
		int r1;
		int r2;
		int r3;
		int r4;

		r = (int) (Math.random() * (100 - 1) + 1);

		System.out.println("Le nombre aleatoire est " + r);

		if (nbr % 2 != 0 && nbr % 3 != 0 && nbr % 5 != 0) {
			System.out.println("le nombre aleatoire est multiple d'aucun");
		} else {
			if (nbr % 2 == 0) {
				System.out.println("le nombre aleatoire est multiple de 2");
			}
			if (nbr % 3 == 0) {
				System.out.println("le nombre aleatoire est multiple de 3");
			}
			if (nbr % 5 == 0) {
				System.out.println("le nombre aleatoire est multiple de 5");
			}
		}

		r1 = (int) (Math.random() * (999 - 0) + 0);
		r2 = (int) (Math.random() * (999 - 0) + 0);
		r4 = (int) (Math.random() * (999 - 0) + 0);
		r3 = (int) (Math.random() * (999 - 0) + 0);

		System.out.println("Les nouveaux nombres aleatoires sont " + r1 + ";" + r2 + ";" + r3 + "et" + r4);

		// deviner un nombre

		int max = 100;
		int proposition;
		int nombre = (int) Math.random();

		System.out.println("j'ai choisi un nombre, devine le!");

		int tentative = 0;
		do {

			System.out.println("saisir un nombre");
			proposition = b.nextInt();

			if (proposition < 5)
				System.out.println("Plus grand !");

			else if (proposition > 5)
				System.out.println("Plus petit !");

		} while (proposition != 5);

		System.out.println("Trouvé en " + proposition + " coups");

	}
}
