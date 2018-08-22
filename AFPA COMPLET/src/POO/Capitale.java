package POO;

public class Capitale extends Ville_moi{
	
	String monument;
	 public Capitale () {
	 // pr initialiser les variables de la classe mère (superclasse) dc faire appel au constructeur de la calee ville
	 super();//avec super on fait appel au constructeur ss paramètres
	 monument = "indéfini";
	 
	}
	 public Capitale (String pnomV,int pnbHab, String pnomP, String pmonument) {//on fait appel au constructeur avec paramètres
	super(pnomV, pnbHab,pnomP);
	  monument=pmonument;
	  
	 }
	 public String getMonument() {
	  return monument;
	 }
	 public void setMonument(String monument) {
	  this.monument = monument;
	 }	
	
	 public String decrisToi () {
	 return super.decrisToi()+". Son monument : "+monument;
		 
	 }
	
	

}
