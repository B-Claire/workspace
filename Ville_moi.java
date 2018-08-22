package POO;
// voir cours ici: https://openclassrooms.com/courses/26832-apprenez-a-programmer-en-java/21282-votre-premiere-classe
public class Ville_moi {
	public static int i=0;
	
	int nombre_de_ville;  //permet de compter le nombre d'objets cr�es par le biais de la classe ville
	
	
private  String nomVille;//Stocke le nom de notre ville
private  String nomPays ;//Stocke le nom du pays de notre pays
private int nbreHabitants;//Stocke le nombre d'habitants de notre ville
private char categorie ;//Stocke la cat�gorie
	
public Ville_moi () { // constructeur
	System.out.println("construction d'une ville sans param�tres");
	
	nomVille= "non renseign�" ; // attribut
	nomPays =  "non renseign�";
	nbreHabitants= 0;
	this.setCategorie();
	i++;
	System.out.println(i++);
};

public Ville_moi (String pNomVille, int pNbre, String pPays ) { // surcharge de constructeur
	System.out.println("construction d'une ville avec param�tres");

	nomVille= pNomVille; //p nombre est le param�tre
	nomPays =  pPays;
	nbreHabitants= pNbre;
	this.setCategorie();
	i++;
	System.out.println(i++);
	}

//******************** ACCESSEURS *******************
public String getNomVille() {  // accede au nom de la ville
	return nomVille;
}

public String getNomPays() {
	return nomPays;
}

public int getNbreHabitants() {
	return nbreHabitants;
}

public char getCategorie() {
	return categorie;
}

//****************** MUTATEURS **********************

public void setNomVille(String nomVille) {// modifie le nom de la ville
	this.nomVille = nomVille; //n'est pas obligatoire
}

public void setNomPays(String nomPays) {
	this.nomPays = nomPays;
}

public void setNbreHabitants(int nbre) {
	nbreHabitants=nbre;
	this.setCategorie(); 
	}

public void setCategorie(char categorie) {
	this.categorie = categorie;
}



private void setCategorie() { 
	
	//tableau borne nombre habitants
	int bornesSuperieures[] = {0, 1000, 10000, 100000, 500000, 1000000, 5000000, 10000000};
	//tableau categorie
    char categories[] = {'?', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'};

    int i = 0;//
    while (i < bornesSuperieures.length && this.nbreHabitants > bornesSuperieures[i]) { // "tant que, faire "
      i++;

    this.categorie = categories[i];}
  }

  //Retourne la description de la ville
  public String decrisToi(){
    return "\t"+this.nomVille+" est une ville de/du/of "+this.nomPays+ ", elle comporte : "+this.nbreHabitants+" habitant(s) => elle est donc de cat�gorie : "+this.categorie;
  }

  //Retourne une cha�ne de caract�res selon le r�sultat de la comparaison
  public String comparer(Ville_moi v1){
    String str = new String();

    if (v1.getNbreHabitants() > this.nbreHabitants)
      str = v1.getNomVille()+" est une ville plus peupl�e que "+this.nomVille;
     
    else
      str = this.nomVille+" est une ville plus peupl�e que "+v1.getNomVille();
     
    return str;
  }

//methode destructeur de la classe. C'est une methode sp�ciale qui sera appel�e( si elle est red�finie dans la classe) lorsque l'objet sera nattoy� de la m�moire par le garbage collector
public void finalize () { System.out.println("objet supprim�");}

}
