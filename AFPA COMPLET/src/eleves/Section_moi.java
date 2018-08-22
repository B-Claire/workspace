package eleves;

public class Section_moi {
	
//TODO
private int numSection;
private String Lib_Section;
private String[][] tablist= new String[36][2];




public Section_moi (String pLibsection,int pNumsection  ) { //constructeur
	//System.out.println("construction d'une Section_moi avec paramètres");

	numSection= pNumsection; //p nom est le paramètre
	Lib_Section= pLibsection;
	
}


//******************** ACCESSEURS *******************
public int getNumSection() {
	return numSection;
}


public String getLib_Section() {
	return Lib_Section;
}

public String[][] getTablist() {
	return tablist;
}





//****************** MUTATEURS **********************
public void setNumSection(int numSection) {
	this.numSection = numSection;
}

public void setLib_Section(String lib_Section) {
	Lib_Section = lib_Section;
}


public void setTablist(String nom, String pnom, int nbrinstance) {
	this.tablist [nbrinstance-1][0]=nom;//[nbrinstance-1] on mets -1 pour placer correctement le nom car une instance =1 , deuxieme=2 etc
	this.tablist [nbrinstance-1][1]=pnom;
	
}


public void affichageliste(){
	
	
	
	
}





/*retourne la fiche eleve

public String decrisToi(){
    return "\t"+this.nomEleve+" "+this.prénomEleve+" est dans la section : "+this.section+this.numSection;
  }*/
	
}
