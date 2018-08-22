package java2;


public class ExoLundi {
	/* ecrire la mmethode puissance qui affiche 2 puissance entier*/

	public static void puissancev1 (int exp) {
		double resultat =1;/*type de résultat retourné*/
		if (exp<0) {/*si exposant négatif*/
			for (int i=0;i<-exp; i++)
			{resultat*=0.5;}

		}

		else if(exp>0) {/*si exposant positif*/
			for(int i=0;i>exp; i++)
			{resultat*=2;}

		}
		System.out.println("resultat:"+resultat);
	}

	public static double puissance(int exp) {
		double resutlat = 1;
		if (exp > 0) {
			for (int i = 0; i < exp; i++) {
				resutlat *= 2;
			}
			return resutlat;
		} else if (exp < 0) {
			return 1 / puissance(-exp);
		} else {
			return resutlat;
		}
	}

	/*écrire la methode puissance inverse qui pour un entier n affiche l'inverse de 2 puissance cet entier, 
 	en utilisant la methode puissance que l'on a crée, on peut modifier la signature de la méthode puissance.*/

	public void puissanceinverse(int exp) {

		System.out.println("L'inverse de puissance est: "+ puissance(-exp));
	}

	/* ecrire une methode qui prend en paramètre un tableau de boolean et qui retourne le nombre de valeur à vrai. */

	public static int NbVabAVrai(boolean []tab) {
		int result=0;
		for(int i=0; i<tab.length; i++) {
			if (!tab[i]) {
				result++;
			}
		}
		return tab.length-result;
	}



	public static void main(String[] args) {


		/*Test six = new Test();
			System.out.println("la puissance :" + six.puissance(-3));
			six.puissanceInverse(3);
		 */


		/*----------------------------------*/

		boolean[] tab = new boolean [5];
		tab[0] = true;
		System.out.println(NbVabAVrai(tab));



	}

}