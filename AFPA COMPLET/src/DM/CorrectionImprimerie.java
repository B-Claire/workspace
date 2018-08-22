package DM;

import java.util.Scanner;

public class CorrectionImprimerie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		final float prix10 = 0.10f;
		final float prix20 = 0.09f;
		final float prixPlus = 0.08f;
		float prix;//ou float prix=0.00f; et retirer le cast de prix 
		int nbr;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Saisir le nombre de photocopie à effectuer");
		nbr=sc.nextInt();
		while(nbr<1) {
			System.out.println("Ressaisir le nombre de photocopie à effectuer");
			nbr=sc.nextInt();			
		}
		
		if( nbr>0 && nbr<11) { 
			prix=nbr*prix10;
		}else {
			if(nbr>10 && nbr<=30){
				   prix=10*prix10+ (nbr-10)*prix20;
			}else {
		  	    prix=10*prix10+ 20*prix20+(nbr-30)* prixPlus;
			}
		}
		//System.out.println("le montant à régler est de :"+prix+"€");
		System.out.println("le montant à régler est de :"+(float)prix+"€");
		
		
		
		
		

	}

}
