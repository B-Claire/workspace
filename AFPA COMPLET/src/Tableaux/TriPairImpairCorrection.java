package Tableaux;

import java.util.Scanner;

public class TriPairImpairCorrection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//tri par insertion
		int tab[] = new int[10];
		int tampon, j;
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 10; i++) {
			
			if (i == 0) {
				System.out.println("saisir le " + (i + 1) + "ier nombre");// je saisis un premier nbr et je sors 
				tab[i] = sc.nextInt();//on conserve la valeur pour la d�placer
			} else {
				
				
				System.out.println("saisir le " + (i + 1) + "i�me nombre");// on saisis la valeur suivante, on commence � tier/permutter les valeurs
				
				tab[i] = sc.nextInt();
				sc.nextLine();
				
				if (tab[i] % 2==0||tab[i]==0) {
					
					tampon=tab[i];
					j=i;
					//tant que j sup 0 // && -> d�s que l'on trouve un pair on s'arr�te
					while (j>0&&(tab[j-1]%2!=0||tab[j-1]>tampon||tampon==0))// nous comparons la valeur de tampon avec les valeurs pr�c�dentes du tableau jusqu'� ce que le nombre soit supp�rieur 
					{	// vrai               ou faux         //
						tab[j]=tab[j-1]; // nous d�calons les valeurs vers la droite
						j=j-1;
						
					}tab[j]=tampon;
					
					
				} else {
					
					tampon=tab[i];
					j=i;
		
					while (j>0&&tab[j-1]%2!=0&&tab[j-1]>=tampon)// nous comparons la valeur de tampon avec les valeurs pr�c�dentes du tableau jusqu'� ce que le nombre soit supp�rieur 
					{
							tab[j]=tab[j-1]; // nous d�calons les valeurs vers la droite
							j=j-1;
						
					}tab [j]= tampon;
								
				}
			}

		}

		for (int  i = 0; i < 10; i++) {
			System.out.print(tab[i] + " | ");
		}

	sc.close();

	}

}
