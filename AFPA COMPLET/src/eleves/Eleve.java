package eleves;


import java.util.Scanner;

public class Eleve {
	private String nom;
	private String prenom;
	private double moyenne;
	private String mention;
public static int  nbrEleve=0;
	// constructeur par default
	public Eleve() {
		nom = " p";
		prenom = " t";
		moyenne = (double) 0;
		this.setMention();
		
	};

	// constructeur paramétré
	public Eleve(String pNom, String pPrenom, double pMoyenne) {

		nom = pNom;
		prenom = pPrenom;
		moyenne = pMoyenne;
		this.setMention();
		
nbrEleve++;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Double getMoyenne() {
		return moyenne;
	}

	public void setMoyenne(double moyenne) {
		this.moyenne = moyenne;
		this.setMention();
	}

	public String getMention() {
		return mention;
	}

	public void setMention() {
		if (this.moyenne < 8) {
			this.mention = "recalé";

		} else {
			if (this.moyenne < 10) {
				this.mention = "ratrapage";
			} else {
				if (this.moyenne < 12) {
					this.mention = "passable";
				} else {
					if (this.moyenne < 14) {
						this.mention = "bien";
					} else {
						if (this.moyenne < 16) {
							this.mention = "tres bien";
						} else {
							if (this.moyenne < 20) {
								this.mention = "excellent";

							}
						}
					}
				}
			}
		}

		this.mention = mention;
	}

}
