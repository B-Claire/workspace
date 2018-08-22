package lecon2;

import java.util.Scanner;

public class Correctionsexos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
						
			
			
			// note du bac
			//double note;
			
		
			//System.out.println("Saisir la note d'examen");
			//note = sc.nextDouble();
			/*
			if (note>=10) {
				System.out.println("vous êtes reçu");
				
			}else if (note>=8 && note<10 ){
				System.out.println("vous êtes en rattrapage");
			}else {
				System.out.println("vous êtes recalé");
			}
			*/
			/*
			 * // ternaire
			 */
			//String message = new String();
			//message = (note>=10)?"vous êtes reçu":(note>=8 && note<10 )?"vous êtes en rattrapage":"vous êtes recalé";
		   // System.out.println(message);
		    //
		    
		   		    
		    
/////////////////////////////////////////////////////////
		    
//***************afficher la mention

			String Nom;
			String Prenom;
			float moy;
			String reponse = new String ("oui");//ou reponse=oui
			String message;
			while (!reponse.equals("oui")){
						System.out.println("saisir un nom");
						nom=sc.nextLine();
						System.out.println("saisir un prenom");
						prenom=sc.nextLine();
						System.out.println("saisir une moyenne");
						moy=sc.nextFloat()
					
			String message=(moy< 8)?"recalé":
				(moy >8 && moy <10)?"rattrapage":
					(moy >10 && moy <12)?"passable":
						(moy >=12 && moy <14)?"assez bien":
							(moy >=14 && moy <16)?"bien":
								(moy >=16 && moy <18)?"tres bien":
									(moy >18)?"excellent";
											
		
			System.out.println(message);
			System.out.println("voulez-vous continuer? oui/non");
			reponse = sc.nextLine();
			reponse=reponse.toLowerCase();
			
			while(!reponse.equals("oui")&&!reponse("non");{
				System.out.println("saisir à nouveau: oui/non");
				reponse=sc.nextLine();

				}
			}
		//************** exo 3 leçon 2
			int somme,nbr2;
			somme=0;
			int vRep=0;
			
			while(vRep==0) {
					System.out.println("saisir un nombre");
					nbr2=sc.nextInt();
					System.out.println("le nombre saisi est : "+nbr2);
					somme+=nbr2;//somme = somme+nrb2
					System.out.println("la somme obtenue est:"+nbr2);
					
					System.out.println("Voulez-vous continuer (0pour oui/1pour non");
					vRep=sc.nextInt();
					while(vRep!=0 && vRep!=1) {
						System.out.println("ressaisir (0 pour oui/1 pour non)");
						vRep=sc.nextInt();
						
			}

	System.out.println("la somme finale est de :"+somme);
	
			
			
			
			
			
			
			
	sc.close();		
			
		}
}