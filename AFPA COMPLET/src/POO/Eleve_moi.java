package eleves;

import eleves.Eleve_moi;

public class Eleve_moi {

	private String nomEleve;// Stocke le nom de l eleve
	private String prénomEleve;// Stocke le prénom de l eleve
	private String mention;
	private Float moyenne;
	public static int nbrEleve = 0;// permet de conserver la val d un obj créé a un autre

	String section1 = new String();

	public Eleve_moi(String pNomEleve, String pPrénomEleve, float pMoyenne) {
		// TODO Auto-generated constructor stub
		// System.out.println("construction d'un Eleve_moi");
		nomEleve = pNomEleve; // p nom est le paramètre
		prénomEleve = pPrénomEleve;
		moyenne = pMoyenne;

		this.setMention();

		nbrEleve++;
	}

	// ******************** ACCESSEURS *******************
	public String getNomEleve() {
		return nomEleve;
	}

	public String getPrénomEleve() {
		return prénomEleve;
	}

	public Float getMoyenne() {
		return moyenne;
	}

	public String getMention() {
		return mention;
	}

	// ****************** MUTATEURS **********************

	public void setNomEleve(String nomEleve) {
		this.nomEleve = nomEleve;
	}

	public void setPrénomEleve(String prénomEleve) {
		this.prénomEleve = prénomEleve;
	}

	public void setMoyenne(Float moyenne) {
		this.moyenne = moyenne;
	}

	public void setMention(String mention) {
		this.mention = mention;
	}

	private void setMention() { // se crée à partir de la moyenne
		if (this.moyenne < 8) {
			this.mention = "recalé";

		} else if (this.moyenne < 10) {
			this.mention = "rattrapage";

		} else if (this.moyenne < 12) {
			this.mention = "passable";

		} else if (this.moyenne < 14) {
			this.mention = "bien";

		} else if (this.moyenne < 16) {
			this.mention = "trés bien";

		} else if (this.moyenne < 20) {
			this.mention = "excellent";
		}

		// retourne la description de la personne

		/*
		 * public String decrisToi(){ return
		 * "\t"+this.nomEleve+" "+this.prénomEleve+"a obtenu la moyenne :"+this.
		 * moyenne+" /20 => l'eleve a obtenu la mention :"+this.mention; }
		 * 
		 * //Retourne une chaîne de caractères selon le résultat de la comparaison
		 * public String comparer(Eleve_moi e1){ String str = new String();
		 * //comparaison if (e1.getMoyenne() > this.moyenne) str =
		 * e1.getNomEleve()+" a obtenu une note meilleure que "+this.nomEleve;
		 * 
		 * else str =
		 * this.nomEleve+" a obtenu une note meilleure que "+e1.getNomEleve();
		 * 
		 * return str;
		 */

		this.mention = mention;

	}

}
