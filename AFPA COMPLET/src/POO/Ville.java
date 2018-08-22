package POO;

public class Ville {
	
	//Variable de classe utilis� pour toutes les instances donc on utilise le mot cl� 'static'
	// Variables publiques qui comptent les instances
		public static int nbreInstances=0;
	// Variables priv�e qui comptent les instances
		private static int nbreInstancesBis=0;
			
	// stocke le nom de notre ville
	// le mot cle private ne permet pas d'acceder au variable d'instance sans controle.	
	// ces attributs ne sont plus accessibles en dehors de la classe ou ils sont d�clar�s	
	private String nomVille;
	//stocke le nom du pays de notre ville
	private String nomPays;
	//stocke le nombre d'habitants de notre ville
	private int nbreHabitants;
	//stocke la categorie de la ville
	private char categorie;
	private int superficie;

	//constructeur par d�faut
	// le constructeur n'a aucun type de retour "void", "double".. et porte le meme 
	// nom que notre classe

	public Ville(){
		//on incremente nos variables � chaque appel aux constructeurs
		nbreInstances++;
		nbreInstancesBis++;
		
	System.out.println("Cr�ation d'une ville sans parametres !");
	nomVille="inconnu";
	nomPays="inconnu";
	nbreHabitants = 0;
	this.setCategorie();


	}

	//constructeur avec param�tres

	public Ville (String pNom, int pNbre, String pPays)
	{
		//on incremente nos variables � chaque appel aux constructeurs
		nbreInstances++;
		nbreInstancesBis++;
	System.out.println("Cr�ation d'une ville avec des param�tres !");
	nomVille = pNom;
	nomPays = pPays;
	nbreHabitants = pNbre;
	this.setCategorie();
	}




	//************ ACCESSEUR *****************
	/* les accesseurs sont des methodes de port�e public pour que l'on puisse y acceder depuis 
	 une autre classe. Les accesseur sont de meme type que les variables qu'il doivent retourner.  
	 */
	//Retourne le nom de la ville
	public String getNomVille() {
		return nomVille;
	}
	//Retourne le nom du pays
	public String getNomPays() {
		return nomPays;
	}
	//Retourne le nombre d'habitants
	public int getNbreHabitants() {
		return nbreHabitants;
	}

	//Retourne la categorie de la ville
	public char getCategorie() {
		return categorie;
	}

	/*accesseur de la variable de classe nombreinstanceBis donc mots cl� 'static' avant le type.
	*/
	public static int getNombreInstancesBis()
	{
		return nbreInstancesBis;
	}
	//************ MUTATEURS *****************
	/*
	 les mutateur sont de type void car elle ne retourne aucune valeur elle les met � jour
	 */
	//D�finit le nom de la ville
	public void setNomVille(String pnomVille) {
		nomVille = pnomVille;
	}

	//D�finit le nom du pays
	public void setNomPays(String pnomPays) {
		nomPays = pnomPays;
	}

	//D�finit le nombre d'habitants 
	public void setNbreHabitants(int pnbreHabitants) {
		nbreHabitants = pnbreHabitants;
	//apres l'initialisation de nombre habitant, on appelle la m�thode cat�gorie
		this.setCategorie();
	}
	// this fait reference a l'objet courant

	//D�finit la cat�gorie de la ville

	private void setCategorie(){
		// tableau borne nombre d'habitant
		int bornesSuperieures[] = {0, 1000, 10000, 100000, 500000, 1000000, 5000000, 10000000};
		// tableau categorie
		char categories[]= {'?', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'};
		int i= 0;
		while (i< bornesSuperieures.length && this.nbreHabitants > bornesSuperieures[i] ) {
			i++;
	}
		this.categorie = categories[i];
	}


	//Retourne la description de la ville
	public String decrisToi(){
		
		return"\t"+this.nomVille+" est une ville de "+this.nomPays+", elle comporte :"+this. nbreHabitants+
				"habitant(s) => elle est donc de cat�gorie :" +this.categorie;
		
		
		
	}

	//Retourne une chaine de caracteres selon le r�sultat de la comparaison
	public String comparer(Ville_moi v1){
		String str= new String();
		if (v1.getNbreHabitants() > this.nbreHabitants)
			str=v1.getNomVille()+"est une ville plus peupl�e que" +this.nomVille;
		else
			str= this.nomVille+" est une ville plus peupl�e que " +v1.getNomVille();
		return str;
	}

	// m�thode destructeur de la classe. C'est une m�thode sp�ciale qui sera appel�e (si elle est red�finie dans la classe) lorsque l'objet sera nettoy� de la m�moire par le garbage collector
	public void finalize()
	{
	     System.out.println("Objet nettoy� de la m�moire");   
	     System.out.close();
	}

	}// fin de classe




