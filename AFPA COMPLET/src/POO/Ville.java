package POO;

public class Ville {
	
	//Variable de classe utilisé pour toutes les instances donc on utilise le mot clé 'static'
	// Variables publiques qui comptent les instances
		public static int nbreInstances=0;
	// Variables privée qui comptent les instances
		private static int nbreInstancesBis=0;
			
	// stocke le nom de notre ville
	// le mot cle private ne permet pas d'acceder au variable d'instance sans controle.	
	// ces attributs ne sont plus accessibles en dehors de la classe ou ils sont déclarés	
	private String nomVille;
	//stocke le nom du pays de notre ville
	private String nomPays;
	//stocke le nombre d'habitants de notre ville
	private int nbreHabitants;
	//stocke la categorie de la ville
	private char categorie;
	private int superficie;

	//constructeur par défaut
	// le constructeur n'a aucun type de retour "void", "double".. et porte le meme 
	// nom que notre classe

	public Ville(){
		//on incremente nos variables à chaque appel aux constructeurs
		nbreInstances++;
		nbreInstancesBis++;
		
	System.out.println("Création d'une ville sans parametres !");
	nomVille="inconnu";
	nomPays="inconnu";
	nbreHabitants = 0;
	this.setCategorie();


	}

	//constructeur avec paramètres

	public Ville (String pNom, int pNbre, String pPays)
	{
		//on incremente nos variables à chaque appel aux constructeurs
		nbreInstances++;
		nbreInstancesBis++;
	System.out.println("Création d'une ville avec des paramètres !");
	nomVille = pNom;
	nomPays = pPays;
	nbreHabitants = pNbre;
	this.setCategorie();
	}




	//************ ACCESSEUR *****************
	/* les accesseurs sont des methodes de portée public pour que l'on puisse y acceder depuis 
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

	/*accesseur de la variable de classe nombreinstanceBis donc mots clé 'static' avant le type.
	*/
	public static int getNombreInstancesBis()
	{
		return nbreInstancesBis;
	}
	//************ MUTATEURS *****************
	/*
	 les mutateur sont de type void car elle ne retourne aucune valeur elle les met à jour
	 */
	//Définit le nom de la ville
	public void setNomVille(String pnomVille) {
		nomVille = pnomVille;
	}

	//Définit le nom du pays
	public void setNomPays(String pnomPays) {
		nomPays = pnomPays;
	}

	//Définit le nombre d'habitants 
	public void setNbreHabitants(int pnbreHabitants) {
		nbreHabitants = pnbreHabitants;
	//apres l'initialisation de nombre habitant, on appelle la méthode catégorie
		this.setCategorie();
	}
	// this fait reference a l'objet courant

	//Définit la catégorie de la ville

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
				"habitant(s) => elle est donc de catégorie :" +this.categorie;
		
		
		
	}

	//Retourne une chaine de caracteres selon le résultat de la comparaison
	public String comparer(Ville_moi v1){
		String str= new String();
		if (v1.getNbreHabitants() > this.nbreHabitants)
			str=v1.getNomVille()+"est une ville plus peuplée que" +this.nomVille;
		else
			str= this.nomVille+" est une ville plus peuplée que " +v1.getNomVille();
		return str;
	}

	// méthode destructeur de la classe. C'est une méthode spéciale qui sera appelée (si elle est redéfinie dans la classe) lorsque l'objet sera nettoyé de la mémoire par le garbage collector
	public void finalize()
	{
	     System.out.println("Objet nettoyé de la mémoire");   
	     System.out.close();
	}

	}// fin de classe




