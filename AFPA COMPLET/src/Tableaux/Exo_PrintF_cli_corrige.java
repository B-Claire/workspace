package Tableaux;

import java.util.Scanner;

public class Exo_PrintF_cli_corrige {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String vrep="oui";
		String [][] tab= new String[6][100];
		Scanner sc = new Scanner(System.in);
		int i=0;
        while(vrep.equals("oui")) {
			System.out.println("saisir un nom");
			tab[i][0]=sc.nextLine();
			System.out.println("saisir un pnom");
			tab[i][1]=sc.nextLine();		
			System.out.println("saisir un adr");
			tab[i][2]=sc.nextLine();
			System.out.println("saisir un cp");
			tab[i][3]=sc.nextLine();
			System.out.println("saisir un ville");
			tab[i][4]=sc.nextLine();
			System.out.println("saisir un tel");
			tab[i][5]=sc.nextLine();

			i++;
			System.out.println("Voulez vous continuez oui/non");
			vrep=sc.nextLine();
			while(!vrep.equals("oui")&&!vrep.equals("non")) {
				System.out.println("Voulez vous continuez oui/non");
				vrep=sc.nextLine();				
			}
        }
        System.out.println(tab[0][4]);
        
			System.out.println( "\n ___________________________________________________________________________________" );
	        System.out.println( "| NOM        | PRENOM       | ADRESSE           | CP     | VILLE        |TELEPHONE   |" );
	        System.out.println( "|____________|______________|___________________|________|______________|____________|" );
			for(int j=0; j<i; j++) {
				
				System.out.printf( "| %10s | %12s | %17s | %-6s | %12s | %10s |\n", 
						tab[j][0], tab[j][1], tab[j][2], tab[j][3], tab[j][4], tab[j][5]  );				
				
			}
			System.out.println( "|____________|______________|___________________|________|______________|____________|" );
		
sc.close();
	}

}
