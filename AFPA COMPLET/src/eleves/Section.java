package eleves;

public class Section {
	private int numSection;
	private String nomSection;
	String tab[][] = new String[10][2];
	public static int i = 0;

	public Section(int numSection, String nomSection) {

		this.nomSection = nomSection;
		this.numSection = numSection;

	}

	public int getNumSection() {
		return numSection;
	}

	public void setNumSection(int numSection) {
		this.numSection = numSection;
	}

	public String getNomSection() {
		return nomSection;
	}

	public void setNomSection(String nomSection) {
		this.nomSection = nomSection;
	}

	public String[][] getTab() {
		return tab;
	}

	public void setTab(String nom, String pnom, int nbrinstance) {

		this.tab[nbrinstance - 1][0] = nom;
		this.tab[nbrinstance - 1][1] = pnom;

	}

	public void affichage() {
		System.out.println("Les "+ Eleve.nbrEleve +"élèves de la section "+getNomSection());
		for (int i = 0; i < Eleve.nbrEleve; i++) {
			System.out.println("");
			for (int j = 0; j < 2; j++) {
				if (j == 0) {
					System.out.println("Nom : " + tab[i][j]);
				} else {
					System.out.print("Prenom : " + tab[i][j]);
				}
			}

		}
		System.out.println();
	}

}