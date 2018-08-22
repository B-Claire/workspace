package cdi.tools;
import java.util.Scanner;

public class Clavier {
	
	private static Scanner scanner = new Scanner(System.in);
	
	public static int lireInt(){
		System.out.print("Saisissez votre entier : ");
		return scanner.nextInt();
	}
	
	public static String lireString(){
		System.out.print("Saisissez votre phrase ou mot : ");
		return scanner.next();
	}

	public static int[] lireTableauInt(int longueur){
		System.out.println("Vous allez saisir un tableau de "+longueur+" elements de type entier");
		int[] result = new int[longueur];
		for(int i = 0; i<longueur; i++){
			System.out.print("Saisissez votre "+(i+1)+" element : ");
			result[i] = scanner.nextInt();
		}
		System.out.println("tableau saisi : "+contenuTableau(result));
		return result;
	}
	
	public static boolean[] lireTableauBoolean(int longueur){
		System.out.println("Vous allez saisir un tableau de "+longueur+" elements de type boolean");
		boolean[] result = new boolean[longueur];
		for(int i = 0; i<longueur; i++){
			System.out.print("Saisissez votre "+(i+1)+" element : ");
			result[i] = scanner.nextBoolean();
		}
		System.out.println("tableau saisi : "+contenuTableau(result));
		return result;
	}
	
	public static String contenuTableau(int[] tab){
		String resultat = "[";
		for(int i=0; i<tab.length; i++){
			resultat = resultat+tab[i]+",";
		}
		if(resultat.length()>1){
			resultat.substring(0, resultat.length());
		}
		resultat+="]";
		return resultat;
	}
	
	public static String contenuTableau(boolean[] tab){
		String resultat = "[";
		for(int i=0; i<tab.length; i++){
			resultat = resultat+tab[i]+",";
		}
		if(resultat.length()>1){
			resultat.substring(0, resultat.length());
		}
		resultat+="]";
		return resultat;
	}
	
	public static boolean lireBoolean(){
		System.out.print("Saisissez votre boolean (true ou false) : ");
		return scanner.nextBoolean();
	}

}
