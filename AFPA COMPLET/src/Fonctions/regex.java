package Fonctions;

import java.util.Scanner;

public class regex {

	public static void main(String[] args) {

				//a-z => peut être saisi une lettre de a à z inclus
				// 0-9 => peut être saisi un chiffre de 0à9
				// ^ 	Matches the beginning of the line.
				// $ 	Matches the end of the line.
				// . 	Matches any single character except newline. Using m option allows it to match the newline as well﻿



//		 public static boolean isValidEmail( String email ) {
//		        //String regExp = "^.+@.+\\..+$";
//		        //String regExp = "^[A-Za-z0-9._-]+@[A-Za-z0-9._-]+\\.[a-z][a-z]+$";
//		        //String regExp = "^[\\w.-]+@[\\w.-]+\\.[a-z]{2,}$";
//		        
//		       // String regExp = "^[A-Za-z][A-Za-z0-9._-]+@[A-Za-z0-9._-]+\\.[A-Za-z]{2,4}$";
//		        String regExp = "^[a-zA-Z]([a-zA-Z0-9]+[\\._-]?[a-zA-Z0-9]+){2,63}@"+"([a-zA-Z0-9]+[\\._-]?[a-zA-Z0-9]+\\.[a-zA-Z]{2,4})${5,255}";
//		        /*ma regex commence par une lettre maj ou min ^[A-Za-z]
//		         * [A-Za-z0-9._-]+ signifie que nous voulons des chiffres et lettres autant de fois que nécessairepar le biais du signe '+'
//		         * @ est un caractére que nous devrons obligatoirement retrouver
//		         * [A-Za-z0-9._-]+ signifie que nous voulons des chiffres et lettres autant de fois que nécessairepar le biais du signe '+'
//		         * \\. nous voudrions un point donc nous echapons le caractere pour ne pas le confondre avec le caractere du regex signifiant'tous caractere accepter sauf retour a la ligne'
//		         * [a-z]{2,4}$ la chaine se termine'$' avec 2 lettres ou 4 au maximums
//		         * 
//		         */
//		        
//		        return email.matches( regExp );
//		    }
//		    
//		    
		  //		        
//			methode 1 
//		      String strmail=new String();
//		      Scanner sc= new Scanner(System.in);
//		      System.out.println( "Saisir un mail" );
//		      strmail=sc.nextLine();
//		      
//		      while(isValidEmail( strmail )==false) {
	//
//		          System.out.println( "Ressaisir un mail" );
//		          strmail=sc.nextLine();
//		      }
//		      
//		      System.out.println( "le mail est valide" );
		 // Fin methode 1
		      
		       //methode 2
		      String regExp = "^[a-zA-Z]([a-zA-Z0-9]+[\\._-]?[a-zA-Z0-9]+){2,63}@"+"([a-zA-Z0-9]+[\\._-]?[a-zA-Z0-9]+\\.[a-zA-Z]{2,4})${5,255}";  
		      String strmail=new String();
		      Scanner sc= new Scanner(System.in);
		      System.out.println( "Saisir un mail" );
		      strmail=sc.nextLine();
		      
		      
		      while(strmail.matches( regExp )==false) {

		          System.out.println( "Ressaisir un mail" );
		          strmail=sc.nextLine();
		      }
		      System.out.println( "le mail est valide" );
		      
		      
		      
	     
		sc.close();      
		      
		      
		    



		
		
		
		
	}

}
