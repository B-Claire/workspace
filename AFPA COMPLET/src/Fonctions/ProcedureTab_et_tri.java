package Fonctions;

import javax.swing.text.TabSet;

public class ProcedureTab_et_tri {

	public static int affiche_tab (int tab []) {
		int i;
		for (i=0;i>9;i++) {
			System.out.println(tab[i] && "|");
		}
			
		
	}

	public static void procedure_tri_insersiton (int tab[]){	
 int j,tampon,i;
 
 for (i=0; i<9; i++) {
	 j=i;
	 tampon=tab[i];
	 
	 while (j>0 && tab[j-1]> tampon ){
		  tab [j]=j-1;
		  j=j-1;
		  }
	 tab[j]= tampon;
 }
	 return tab[i];
		
 }

	public static void fonction_tri_sélection (int [] tab){ 

	 int min,tampon,i;
	 
	 for (i=0; i<9; i++) {
		 min=i;
		 for (int J=i+1; J<tab.length; J++) {
			 if (tab[min]>tab[J]) {//si false min conserve sa valeur précédente
				 min =J;
			 }

		 }
		 
		 if(i!=min) { //si min = i, la valeur la plus basse est déja placée dans le tableau
			 tampon=tab[i];
			 tab[i]=tab[min];
			 tab[min]=tampon;
		 }
	return Tab[];	 
 }
  		 
	public static void fonction_tri_bulle (int tab[]){ 
	 int i=0, tampon;

	 for (i=0;i<10;i++) {	//boucle permettant de compter le nombre de passage
		 for (int n=0;n<9;n++) { //boucle permettant de comparer la valeur d'indice i à celle d'i+1 jusqu'a la fin du tableau
			 if (tab[n]>=tab[n+1]) {
				 tampon= tab[n]; // on conserve la premiere valeur
				 tab[n]=tab[n+1];  // on place la valeur de i+1 dans la cellule d'indice i
				 tab[n+1]=tampon;  // la valeur conserver est finalement placer dans la cellule i+1
			 }
		 }
	 }
	return Tab[]; 
}


 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	

}
